package pojos;
/*
 * 	id (PK), first_name,last_name, dob,batting_avg,wickets_taken....
	+team_id (FK)
 */

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player extends BaseEntity {
	// project tip add at least one unique key for generation of later equlas and
	// hashcode anad that filed shoud be immutable
	@Column(name = "First_Name", length = 20)
	private String firstName;
	@Column(name = "Last_Name", length = 20)
	private String lastName;
	@Column(name = "Jersey", length = 20,unique = true)
	private String jersey;
	@Column(name = "Date_of_Birth")
	private LocalDate dob;
	@Column(name = "Batting_average")
	private double battingAvg;
	@Column(name = "Wickets")
	private int wicketsTaken;
	// FK
	@ManyToOne//for many to one fetch type is EAGER
	@JoinColumn(name="team_id",nullable = false)
	private Team myteam;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String firstName, String lastName, LocalDate dob, double battingAvg, int wicketsTaken) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;

	}

	public Team getMyteam() {
		return myteam;
	}

	public void setMyteam(Team myteam) {
		this.myteam = myteam;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + getId() + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}

}
