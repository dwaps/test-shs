package fr.dwaps.shs.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("fr.dwaps.shs.jpa");
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}
	
}
