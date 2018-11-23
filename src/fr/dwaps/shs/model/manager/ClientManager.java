package fr.dwaps.shs.model.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import fr.dwaps.shs.model.bean.Client;
import fr.dwaps.shs.util.AppListener;

public class ClientManager implements IClientManager {
	
	private EntityManager em;

	@Override
	public List<Client> findAll() {
		em = AppListener.getEmf().createEntityManager();
		Query query = em.createNativeQuery("SELECT * FROM client", Client.class);
		List<Client> clients = query.getResultList();
		return clients;
	}

	@Override
	public Client find(int id) {
		return null;
	}

	@Override
	public boolean remove(int id) {
		return false;
	}

	@Override
	public boolean updateOrCreate(int id) {
		return false;
	}
	
}
