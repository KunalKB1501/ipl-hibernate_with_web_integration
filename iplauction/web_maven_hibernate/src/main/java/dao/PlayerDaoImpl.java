package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Player;
import pojos.Team;
import utils.HibernateUtils;

public class PlayerDaoImpl implements  PlayerDao {

	@Override
	public String addPlayer(Player p,int id) {
		Session session =HibernateUtils.getFactory().getCurrentSession();
		String mesg="Player not added";
		Team t1=null;
		Transaction tr=session.beginTransaction();
		try {
			t1=session.get(Team.class, id);
			if(t1!=null)
			{
				t1.addPlayer(p);
				session.persist(p);
			}
			tr.commit();
			mesg="team Player successfuly";
			
		} catch (RuntimeException e) {
			if(tr!=null)
				tr.rollback();
			System.out.println(mesg);
			throw e;
		}
		return mesg;
	}



}
