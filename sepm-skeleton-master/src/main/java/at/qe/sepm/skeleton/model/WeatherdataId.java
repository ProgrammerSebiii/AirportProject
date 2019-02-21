package at.qe.sepm.skeleton.model;
// Generated Feb 20, 2019, 7:50:55 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WeatherdataId generated by hbm2java
 */
@Embeddable
public class WeatherdataId implements java.io.Serializable {

	private Date logDate;
	private Date time;
	private int station;

	public WeatherdataId() {
	}

	public WeatherdataId(Date logDate, Date time, int station) {
		this.logDate = logDate;
		this.time = time;
		this.station = station;
	}

	@Column(name = "log_date", nullable = false, length = 10)
	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	@Column(name = "time", nullable = false, length = 16)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "station", nullable = false)
	public int getStation() {
		return this.station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeatherdataId))
			return false;
		WeatherdataId castOther = (WeatherdataId) other;

		return ((this.getLogDate() == castOther.getLogDate()) || (this.getLogDate() != null
				&& castOther.getLogDate() != null && this.getLogDate().equals(castOther.getLogDate())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())))
				&& (this.getStation() == castOther.getStation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLogDate() == null ? 0 : this.getLogDate().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result + this.getStation();
		return result;
	}

}