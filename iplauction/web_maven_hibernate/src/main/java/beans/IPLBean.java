package beans;

import java.util.List;

import org.hibernate.HibernateException;

import dao.TeamdaoImpl;
import pojos.Team;

public class IPLBean {
//state : dep : dao
	private TeamdaoImpl teamDao;
	public IPLBean(){
		//dao instace
		teamDao=new TeamdaoImpl();
		System.out.println("IPL bean created...");
		
	}
	//getters n setters
	public TeamdaoImpl getTeamDao() {
		return teamDao;
	}
	public void setTeamDao(TeamdaoImpl teamDao) {
		this.teamDao = teamDao;
	}
	//add B.L method to ret list of all teams to the caller(JSP)
	public List<Team> fetchAllTeams()
	{
		//invoke dao's method
		return teamDao.getAllteams();
	}
	
	
}
