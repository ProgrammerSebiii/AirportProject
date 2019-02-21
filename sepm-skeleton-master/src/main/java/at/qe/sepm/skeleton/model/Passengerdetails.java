package at.qe.sepm.skeleton.model;
// Generated Feb 20, 2019, 7:50:55 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Passengerdetails generated by hbm2java
 */
@Entity
@Table(name = "passengerdetails", catalog = "airportdb")
public class Passengerdetails implements java.io.Serializable {

	private int passengerId;
	private Passenger passenger;
	private Date birthdate;
	private Character sex;
	private String street;
	private String city;
	private short zip;
	private String country;
	private String emailaddress;
	private String telephoneno;

	public Passengerdetails() {
	}

	public Passengerdetails(Passenger passenger, Date birthdate, String street, String city, short zip,
			String country) {
		this.passenger = passenger;
		this.birthdate = birthdate;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}

	public Passengerdetails(Passenger passenger, Date birthdate, Character sex, String street, String city, short zip,
			String country, String emailaddress, String telephoneno) {
		this.passenger = passenger;
		this.birthdate = birthdate;
		this.sex = sex;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
		this.emailaddress = emailaddress;
		this.telephoneno = telephoneno;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "passenger"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "passenger_id", unique = true, nullable = false)
	public int getPassengerId() {
		return this.passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Passenger getPassenger() {
		return this.passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birthdate", nullable = false, length = 10)
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "sex", length = 1)
	public Character getSex() {
		return this.sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	@Column(name = "street", nullable = false, length = 100)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city", nullable = false, length = 100)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "zip", nullable = false)
	public short getZip() {
		return this.zip;
	}

	public void setZip(short zip) {
		this.zip = zip;
	}

	@Column(name = "country", nullable = false, length = 100)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "emailaddress", length = 120)
	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	@Column(name = "telephoneno", length = 30)
	public String getTelephoneno() {
		return this.telephoneno;
	}

	public void setTelephoneno(String telephoneno) {
		this.telephoneno = telephoneno;
	}

}