package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Team;
import utils.HibernateUtils;

public class TeamdaoImpl implements TeamDao {

	@Override
	public String addTeam(Team t1) {
		Session session =HibernateUtils.getFactory().getCurrentSession();
		String mesg="team not added";
		Transaction tr=session.beginTransaction();
		try {
			session.persist(t1);
			tr.commit();
			mesg="team Added successfuly";
			
		} catch (RuntimeException e) {
			if(tr!=null)
				tr.rollback();
			System.out.println(mesg);
			throw e;
		}
		return mesg;
	}

	@Override
	public List<Team> getAllteams() {
	Session session =HibernateUtils.getFactory().getCurrentSession();
	String jpql="select new pojos.Team(id,abbrevation) from Team t";
	Transaction tr=session.beginTransaction();
	List<Team>team=null;
	try {
		team=session.createQuery(jpql, Team.class).getResultList();
		tr.commit();
		
	} catch (RuntimeException e) {
		if(tr!=null)
			tr.rollback();
		throw e;
	}
		return team;
	}

	@Override
	public Team getTeamDetails(int id) {
		Session session =HibernateUtils.getFactory().getCurrentSession();
		Transaction tr=session.beginTransaction();
		Team t=null;
		try {
			t=session.get(Team.class, id);
			tr.commit();
			
		} catch (RuntimeException e) {
			if(tr!=null)
				tr.rollback();
			throw e;
		}
			return t;
		}

}
 