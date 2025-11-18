package service;

import dtos.request.IssueTicketRequest;
import dtos.responses.IssueTicketResponse;
import data.models.Ticket;

import java.util.List;

public interface TicketService {
    IssueTicketResponse issueTicket(IssueTicketRequest request);
    Ticket viewTicket(int id);
    List<Ticket> listTicketsByVehicle(int vehicleId);
    void markTicketPaid(int ticketId);
}
