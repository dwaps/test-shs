package fr.dwaps.shs.model.manager;

import java.util.List;

import javax.persistence.EntityManager;

import fr.dwaps.shs.model.bean.Client;

public class ClientManager implements IClientManager {
	
	private EntityManager em;

	@Override
	public List<Client> findAll() {
		return null;
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
