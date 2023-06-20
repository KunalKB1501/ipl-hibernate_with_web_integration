package beans;
//

import java.time.LocalDate;

import dao.PlayerDaoImpl;
import dao.TeamdaoImpl;
import pojos.Player;
import pojos.Team;

public class PlayerBean {

	

	public PlayerDaoImpl getDao() {
		return dao;
	}

	public void setDao(PlayerDaoImpl dao) {
		this.dao = dao;
	}

	public TeamdaoImpl getTeamDao() {
		return teamDao;
	}

	public void setTeamDao(TeamdaoImpl teamDao) {
		this.teamDao = teamDao;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getJersey() {
		return jersey;
	}

	public void setJersey(String jersey) {
		this.jersey = jersey;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getWickets() {
		return wickets;
	}

	public void setWickets(String wickets) {
		this.wickets = wickets;
	}

	public String getMyTeam() {
		return myTeam;
	}

	public void setMyTeam(String myTeam) {
		this.myTeam = myTeam;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
//name & variable should be same as in html form
	private  PlayerDaoImpl dao;
	private  TeamdaoImpl teamDao;
	private String fn;
	private String ln;
	private String jersey;
	private String dob;
	private String avg;
	private String wickets;
	private String myTeam;
	private Player player1;
	
	

	public PlayerBean() {
		dao = new PlayerDaoImpl();
		teamDao = new TeamdaoImpl();
		System.out.println("player bean created");
	}

	public String validatePlayer() {
		
		System.out.println("Inside validatePlayer Method of PlayerBean");
		String mesg = "Player not Added";
		int i=Integer.parseInt(myTeam);
		System.out.println(i);
		Team t = teamDao.getTeamDetails(i);
		System.out.println(t);
		if (t != null) {
			if ((t.getBattingAvg() <= Double.parseDouble(avg))
					&& (t.getWicketsTaken() <= Integer.parseInt(wickets))) {
				player1 = new Player(fn, ln, jersey, LocalDate.parse(dob), Double.parseDouble(avg),
						Integer.parseInt(wickets));
				dao.addPlayer(player1, t.getId());
				mesg = "Player Added successfully";
			}
		}
		return mesg;
	}
}
