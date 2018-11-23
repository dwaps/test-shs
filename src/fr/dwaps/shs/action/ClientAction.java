package fr.dwaps.shs.action;

import java.util.List;

import fr.dwaps.shs.model.bean.Client;
import fr.dwaps.shs.model.manager.ClientManager;

public class ClientAction {
	private ClientManager cm = new ClientManager();

	private List<Client> clients;
	private Client client;
	private int clientId;
	
	public List<Client> getClients() { return clients; }
	public Client getClient() { return client; }
	public void setClient(Client client) { this.client = client; }
	public int getClientId() { return clientId; }
	public void setClientId(int clientId) { this.clientId = clientId; }
	
	public String allClient() {
		clients = cm.findAll();
		return "success";
	}
	
	public String oneClient() {
		client = cm.find(clientId);
		return "success";
	}
	
	public String newClient() {
		if (client != null) {
			cm.updateOrCreate(client);
			return "success";
		}
		return "input";
	}
	
	public String editClient() {
		client = cm.find(clientId);
		return "success";
	}
	
	public String deleteClient() {
		cm.remove(clientId);
		return "success";
	}
}
