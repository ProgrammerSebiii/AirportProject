package at.qe.sepm.skeleton.ui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import at.qe.sepm.skeleton.model.Booking;

@Controller
public class BookingRangeController {
	@Autowired
	private BookingService bookingService;
	
	private Integer from = 0;
	
	private Integer to = 0;
	
	private List<Booking> bookingInRange = new ArrayList<>();;
	
	public Integer getFrom() {
		return from;
	}
	
	public void setFrom(Integer from) {
		System.out.println("New Value:" + from);
		this.from = from;
	}
	
	public Integer getTo() {
		return to;
	}
	
	public void setTo(Integer to) {
		System.out.println("New Value:" + to);
		this.to = to;
	}
	
	public List<Booking> getBookingInRange() {
		return bookingInRange;
	}

	public void setBookingInRange(List<Booking> bookingInRange) {
		this.bookingInRange = bookingInRange;
	}

	public void reloadBookingsInRange(){
		System.out.println("From " + this.from + " To " + this.to);
		this.bookingInRange = bookingService.findBookingsInRange(this.from, this.to);
		System.out.println("Updated in range bookings " + bookingInRange.size());
	}
	
	public int countResults() {
		return this.bookingInRange==null?0:this.bookingInRange.size();
	}
	
	public int getNumOfBookings() {
		return bookingService.numOfBookings();
	}
	
	
}
