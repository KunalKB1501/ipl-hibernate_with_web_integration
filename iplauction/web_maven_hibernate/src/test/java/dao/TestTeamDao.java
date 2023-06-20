package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pojos.Team;
import utils.HibernateUtils;

class TestTeamDao {
	
private static TeamDao dao;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//build session factory
		HibernateUtils.getFactory();
		dao=new TeamdaoImpl();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		HibernateUtils.getFactory().close();
	}

	@Test
	void test() {
//		fail("Not yet implemented");
		Team newteam=new Team("Munbai Indians", "MI", "Nita Ambani", 33, 48, 15);
		String mesg=dao.addTeam(newteam);
		System.out.println(mesg);
		assertEquals(4, newteam.getId());
	}
	@Test
	void testGetAllTeams()
	{
		List<Team>team=dao.getAllteams();
		team.forEach(v->System.out.println(v.getId()+"."+v.getAbbrevation()));
		assertEquals(4, team.size());
	}

}
