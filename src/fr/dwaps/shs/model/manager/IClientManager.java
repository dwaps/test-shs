package fr.dwaps.shs.model.manager;

import java.util.List;

import fr.dwaps.shs.model.bean.Client;

public interface IClientManager {
	List<Client> findAll();
	Client find(int id);
	boolean remove(int id);
	boolean updateOrCreate(Client client);
}
