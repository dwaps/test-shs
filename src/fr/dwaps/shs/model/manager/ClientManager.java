package fr.dwaps.shs.model.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.dwaps.shs.model.bean.Client;
import fr.dwaps.shs.util.AppListener;

public class ClientManager implements IClientManager {
	
	private EntityManager em;

	@Override
	@SuppressWarnings("unchecked")
	public List<Client> findAll() {
		em = AppListener.getEmf().createEntityManager();
		Query query = em.createNativeQuery("SELECT * FROM client", Client.class);
		List<Client> clients = query.getResultList();
		return clients;
	}

	@Override
	public Client find(int id) {
		em = AppListener.getEmf().createEntityManager();
		Client client = em.find(Client.class, id);
		em.close();
		return client;
	}

	@Override
	public boolean remove(int id) {
		em = AppListener.getEmf().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			Client c = em.find(Client.class, id);
			em.remove(c);
			transaction.commit();
		}
		catch (Exception e) {
			transaction.rollback();
		}
		
		em.close();
		return true;
	}

	@Override
	public boolean updateOrCreate(Client client) {
		em = AppListener.getEmf().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			if (client.getId() > 0) {
				Client c = em.merge(client);
				client = c;
			}
			em.persist(client);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			transaction.rollback();
		}
		
		em.close();
		return false;
	}
	
}
