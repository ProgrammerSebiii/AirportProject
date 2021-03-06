package at.qe.sepm.skeleton.model;
// Generated Feb 20, 2019, 7:50:55 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Flight generated by hbm2java
 */
@Entity
@Table(name = "flight", catalog = "airportdb")
public class Flight implements java.io.Serializable {

	private Integer flightId;
	private Airline airline;
	private Airplane airplane;
	private Airport airportByTo;
	private Airport airportByFrom;
	private String flightno;
	private Date departure;
	private Date arrival;
	private Set<Booking> bookings = new HashSet<Booking>(0);

	public Flight() {
	}

	public Flight(Airline airline, Airplane airplane, Airport airportByTo, Airport airportByFrom, String flightno,
			Date departure, Date arrival) {
		this.airline = airline;
		this.airplane = airplane;
		this.airportByTo = airportByTo;
		this.airportByFrom = airportByFrom;
		this.flightno = flightno;
		this.departure = departure;
		this.arrival = arrival;
	}

	public Flight(Airline airline, Airplane airplane, Airport airportByTo, Airport airportByFrom, String flightno,
			Date departure, Date arrival, Set<Booking> bookings) {
		this.airline = airline;
		this.airplane = airplane;
		this.airportByTo = airportByTo;
		this.airportByFrom = airportByFrom;
		this.flightno = flightno;
		this.departure = departure;
		this.arrival = arrival;
		this.bookings = bookings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "flight_id", unique = true, nullable = false)
	public Integer getFlightId() {
		return this.flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "airline_id", nullable = false)
	public Airline getAirline() {
		return this.airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "airplane_id", nullable = false)
	public Airplane getAirplane() {
		return this.airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to", nullable = false)
	public Airport getAirportByTo() {
		return this.airportByTo;
	}

	public void setAirportByTo(Airport airportByTo) {
		this.airportByTo = airportByTo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "from", nullable = false)
	public Airport getAirportByFrom() {
		return this.airportByFrom;
	}

	public void setAirportByFrom(Airport airportByFrom) {
		this.airportByFrom = airportByFrom;
	}

	@Column(name = "flightno", nullable = false, length = 8)
	public String getFlightno() {
		return this.flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "departure", nullable = false, length = 26)
	public Date getDeparture() {
		return this.departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "arrival", nullable = false, length = 26)
	public Date getArrival() {
		return this.arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flight")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

}
