package webapplistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utils.HibernateUtils;

/**
 * Application Lifecycle Listener implementation class SFManager
 *
 */
@WebListener
public class SFManager implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SFManager() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 System.out.println("in ctx destroy");
    	 HibernateUtils.getFactory().close();//close the session factory
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
   System.out.println("in ctx init");
   HibernateUtils.getFactory();//triggers cls loading and static initailizer block and build session Factory
    }
	
}
