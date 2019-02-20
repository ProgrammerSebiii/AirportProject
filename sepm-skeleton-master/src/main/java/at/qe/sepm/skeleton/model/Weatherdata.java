package at.qe.sepm.skeleton.model;
// Generated Feb 20, 2019, 7:50:55 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Weatherdata generated by hbm2java
 */
@Entity
@Table(name = "weatherdata", catalog = "airportdb")
public class Weatherdata implements java.io.Serializable {

	private WeatherdataId id;
	private BigDecimal temp;
	private BigDecimal humidity;
	private BigDecimal airpressure;
	private BigDecimal wind;
	private String weather;
	private short winddirection;

	public Weatherdata() {
	}

	public Weatherdata(WeatherdataId id, BigDecimal temp, BigDecimal humidity, BigDecimal airpressure, BigDecimal wind,
			short winddirection) {
		this.id = id;
		this.temp = temp;
		this.humidity = humidity;
		this.airpressure = airpressure;
		this.wind = wind;
		this.winddirection = winddirection;
	}

	public Weatherdata(WeatherdataId id, BigDecimal temp, BigDecimal humidity, BigDecimal airpressure, BigDecimal wind,
			String weather, short winddirection) {
		this.id = id;
		this.temp = temp;
		this.humidity = humidity;
		this.airpressure = airpressure;
		this.wind = wind;
		this.weather = weather;
		this.winddirection = winddirection;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "logDate", column = @Column(name = "log_date", nullable = false, length = 10)),
			@AttributeOverride(name = "time", column = @Column(name = "time", nullable = false, length = 16)),
			@AttributeOverride(name = "station", column = @Column(name = "station", nullable = false)) })
	public WeatherdataId getId() {
		return this.id;
	}

	public void setId(WeatherdataId id) {
		this.id = id;
	}

	@Column(name = "temp", nullable = false, precision = 3, scale = 1)
	public BigDecimal getTemp() {
		return this.temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	@Column(name = "humidity", nullable = false, precision = 4, scale = 1)
	public BigDecimal getHumidity() {
		return this.humidity;
	}

	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}

	@Column(name = "airpressure", nullable = false, precision = 10)
	public BigDecimal getAirpressure() {
		return this.airpressure;
	}

	public void setAirpressure(BigDecimal airpressure) {
		this.airpressure = airpressure;
	}

	@Column(name = "wind", nullable = false, precision = 5)
	public BigDecimal getWind() {
		return this.wind;
	}

	public void setWind(BigDecimal wind) {
		this.wind = wind;
	}

	@Column(name = "weather", length = 20)
	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	@Column(name = "winddirection", nullable = false)
	public short getWinddirection() {
		return this.winddirection;
	}

	public void setWinddirection(short winddirection) {
		this.winddirection = winddirection;
	}

}
