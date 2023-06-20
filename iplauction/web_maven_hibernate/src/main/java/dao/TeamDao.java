package dao;

import java.util.List;

import pojos.Team;

public interface TeamDao {
	String addTeam(Team t1);
	List<Team>getAllteams();
	Team getTeamDetails(int id);

}
