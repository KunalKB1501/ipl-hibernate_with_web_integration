package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

//id , name, abbrevation,owner,max_age,batting_avg,wickets_taken
@Entity
public class Team extends BaseEntity {
	@Column(name="Name",length = 40)
	private String name;
	@Column(name="Abbrevation",length = 5,unique = true)
	private String abbrevation;
	@Column(name="Owner",length = 20)
	private String owner;
	@Column(name="Max_Age")
	private int maxAge;// max age of the player allowed in this team
	@Column(name="Batting_average")
	private double battingAvg;
	@Column(name="Wickets")
	private int wicketsTaken;
	//add a bi -dir asssiociation between team and players
	@OneToMany(mappedBy = "myteam",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)//by default fetch type is also lazy
	private List<Player>players=new ArrayList<>();

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String name, String abbrevation, String owner, int maxAge, double battingAvg,
			int wicketsTaken) {
		super();
		this.name = name;
		this.abbrevation = abbrevation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	}
	
	
	public Team(String name, String abbrevation) {
		super();
		this.name = name;
		this.abbrevation = abbrevation;
	}
	public Team(int id, String abbrevation) {
		super.setId(id);
		this.abbrevation = abbrevation;
	}
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
		return "Team [teamId=" + getId() + " name=" + name + ", abbrevation=" + abbrevation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}
	
	public void addPlayer(Player p1)
	{
		System.out.println("Inside addPlayer Method of Player Class");
		players.add(p1);
		p1.setMyteam(this);
	}

	public void removePlayer(Player p2)
	{
		players.remove(p2);
		p2.setMyteam(null);
	}
}
