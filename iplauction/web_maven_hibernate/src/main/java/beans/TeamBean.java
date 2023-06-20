package beans;

import dao.TeamdaoImpl;
//| id | Abbrevation | Batting_average | Max_Age | Name| Owner| Wickets |
public class TeamBean {

	

	private TeamdaoImpl dao;
	private String name;
	private String abbreviation;
	private String owner;
	private int maxAge;
	private double battingAverage;
	private int wickets;
	
	public TeamBean() {
		dao=new TeamdaoImpl();
		System.out.println("Team bean created");
	}

	public TeamdaoImpl getDao() {
		return dao;
	}

	public void setDao(TeamdaoImpl dao) {
		this.dao = dao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
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

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
}
