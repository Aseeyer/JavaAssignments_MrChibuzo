package service;

import data.models.*;
import data.repositories.*;
import dtos.request.IssueTicketRequest;
import dtos.responses.IssueTicketResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceImplTest {

    private Tickets ticketsRepository;
    private Vehicles vehiclesRepository;
    private Officers officersRepository;
    private TicketServiceImpl ticketService;

    private Vehicle testVehicle;
    private Officer testOfficer;

    @BeforeEach
    void setUp() {
        ticketsRepository = new Tickets();
        vehiclesRepository = new Vehicles();
        officersRepository = new Officers();
        ticketService = new TicketServiceImpl(ticketsRepository, vehiclesRepository, officersRepository);

        testVehicle = new Vehicle(1, "Toyota", "Corolla", Year.of(2020), "Red", "ABC123", null);
        vehiclesRepository.save(testVehicle);

        testOfficer = new Officer(101);
        testOfficer.setOfficerName("Officer John");
        officersRepository.save(testOfficer);
    }

    @Test
    void issueTicket_shouldReturnValidResponse() {
        IssueTicketRequest request = new IssueTicketRequest();
        request.setVehicleId(testVehicle.getId());
        request.setOfficerId(testOfficer.getBadgeNumber());
        request.setOffence("over speeding");

        IssueTicketResponse response = ticketService.issueTicket(request);

        assertNotNull(response);
        assertEquals("Ticket issued successfully", response.getMessage());
        assertEquals(testVehicle.getPlateNumber(), response.getVehiclePlate());
        assertEquals(testOfficer.getOfficerName(), response.getOfficerName());
        assertTrue(response.getTicketId() > 0);

        Ticket savedTicket = ticketsRepository.findById(response.getTicketId());
        assertEquals(Offence.OVER_SPEEDING, savedTicket.getOffence());
        assertEquals(testVehicle, savedTicket.getVehicle());
        assertEquals(testOfficer, savedTicket.getIssuer());
        assertFalse(savedTicket.isPaid());
    }

    @Test
    void viewTicket_shouldReturnCorrectTicket() {
        Ticket ticket = new Ticket(1);
        ticket.setVehicle(testVehicle);
        ticket.setIssuer(testOfficer);
        ticket.setOffence(Offence.DRUNK_DRIVING);
        ticketsRepository.save(ticket);

        Ticket fetchedTicket = ticketService.viewTicket(ticket.getId());

        assertNotNull(fetchedTicket);
        assertEquals(ticket.getId(), fetchedTicket.getId());
        assertEquals(Offence.DRUNK_DRIVING, fetchedTicket.getOffence());
        assertEquals(testVehicle, fetchedTicket.getVehicle());
        assertEquals(testOfficer, fetchedTicket.getIssuer());
    }

    @Test
    void listTicketsByVehicle_shouldReturnIssuedTickets() {
        Ticket ticket1 = new Ticket(1);
        ticket1.setVehicle(testVehicle);
        ticket1.setOffence(Offence.ONE_WAY);
        ticket1.setIssuer(testOfficer);
        ticketsRepository.save(ticket1);
        testVehicle.addTicket(ticket1);

        Ticket ticket2 = new Ticket(2);
        ticket2.setVehicle(testVehicle);
        ticket2.setOffence(Offence.OVER_SPEEDING);
        ticket2.setIssuer(testOfficer);
        ticketsRepository.save(ticket2);
        testVehicle.addTicket(ticket2);

        List<Ticket> tickets = ticketService.listTicketsByVehicle(testVehicle.getId());

        assertEquals(2, tickets.size());
        assertTrue(tickets.contains(ticket1));
        assertTrue(tickets.contains(ticket2));
    }

    @Test
    void markTicketPaid_shouldUpdateTicketStatus() {
        Ticket ticket = new Ticket(1);
        ticket.setVehicle(testVehicle);
        ticket.setOffence(Offence.DRUNK_DRIVING);
        ticket.setIssuer(testOfficer);
        ticketsRepository.save(ticket);

        assertFalse(ticket.isPaid());

        ticketService.markTicketPaid(ticket.getId());

        Ticket updatedTicket = ticketsRepository.findById(ticket.getId());
        assertTrue(updatedTicket.isPaid());
        assertNotNull(updatedTicket.getDateOfPayment());
    }
}
