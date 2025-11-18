package service;

import data.models.Ticket;
import data.models.Vehicle;
import data.models.Officer;
import data.repositories.Tickets;
import data.repositories.Vehicles;
import data.repositories.Officers;
import dtos.request.IssueTicketRequest;
import dtos.responses.IssueTicketResponse;

import java.time.LocalDateTime;
import java.util.List;

public class TicketServiceImpl implements TicketService {

    private final Tickets ticketsRepository;
    private final Vehicles vehiclesRepository;
    private final Officers officersRepository;

    public TicketServiceImpl(Tickets ticketsRepository, Vehicles vehiclesRepository, Officers officersRepository) {
        this.ticketsRepository = ticketsRepository;
        this.vehiclesRepository = vehiclesRepository;
        this.officersRepository = officersRepository;
    }

    @Override
    public IssueTicketResponse issueTicket(IssueTicketRequest request) {
        Vehicle vehicle = vehiclesRepository.findById(request.getVehicleId());
        Officer officer = officersRepository.findById(request.getOfficerId());

        Ticket ticket = new Ticket(ticketsRepository.getSize() + 1);
        ticket.setVehicle(vehicle);
        ticket.setIssuer(officer);
        ticket.setOffence(Enum.valueOf(data.models.Offence.class, request.getOffence().toUpperCase().replace(" ", "_")));
        ticket.setHasPaid(false);
        ticket.setDateOfBooking(LocalDateTime.now());

        Ticket savedTicket = ticketsRepository.save(ticket);
        vehicle.addTicket(savedTicket);

        IssueTicketResponse response = new IssueTicketResponse();
        response.setTicketId(savedTicket.getId());
        response.setMessage("Ticket issued successfully");
        response.setVehiclePlate(vehicle.getPlateNumber());
        response.setOfficerName(officer.getOfficerName());

        return response;
    }

    @Override
    public Ticket viewTicket(int id) {
        return ticketsRepository.findById(id);
    }

    @Override
    public List<Ticket> listTicketsByVehicle(int vehicleId) {
        Vehicle vehicle = vehiclesRepository.findById(vehicleId);
        return vehicle.getTickets();
    }

    @Override
    public void markTicketPaid(int ticketId) {
        Ticket ticket = ticketsRepository.findById(ticketId);
        ticket.moneyHasBeenPaid(LocalDateTime.now());
    }
}
