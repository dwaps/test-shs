package fr.dwaps.shs.action;

import java.util.List;

import fr.dwaps.shs.model.bean.Client;
import fr.dwaps.shs.model.manager.ClientManager;

public class ClientAction {
	private ClientManager cm = new ClientManager();
	private List<Client> clients;
	
	public List<Client> getClients() {
		return clients;
	}
	
	public String allClient() {
		clients = cm.findAll();
		return "success";
	}
}
