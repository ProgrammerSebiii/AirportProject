package at.qe.sepm.skeleton.ui.controllers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import at.qe.sepm.skeleton.model.Booking;
import at.qe.sepm.skeleton.repositories.BookingRepo;

@Controller
public class BookingController {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private BookingRepo bookingRepo;
	
	public Integer idToSearch;
	
	public Integer getIdToSearch() {
		return idToSearch;
	}
	
	public void setIdToSearch(Integer idToSearch) {
		this.idToSearch = idToSearch;
	}
	
	public Booking doSearchByBookingId() {
	
		return bookingRepo.findOne(260);
	}
	
	public List<Booking> getBookingsInRange(){
		return Booking.getAllBookingsInIdRange(em);
	}
	
	
	
}
