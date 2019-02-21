package at.qe.sepm.skeleton.ui.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import at.qe.sepm.skeleton.model.Booking;
import at.qe.sepm.skeleton.repositories.BookingRepo;

@Service
public class BookingService {
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	EntityManager em;
	
	public List<Booking> findBookingsInRange(Integer from, Integer to){
		return bookingRepo.findBookingsInRange(from, to);
	}
	
	public static List<Booking> getAllBookingsInIdRange(EntityManager em) {
		TypedQuery<Booking> query = em.createQuery("SELECT b FROM Booking b WHERE b.bookingId > 100 AND b.bookingId < 1000", Booking.class);
		return query.getResultList();
	}

	public int numOfBookings() {
		return bookingRepo.findAll().size();
	}
	
}
