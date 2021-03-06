
package Gestionnaire;


public class Champ {
	
	public Client clients = null;
	private int id = 0;
	private String type = "";
	private String coordGps = "";
	private int surface = 0;
	private String polygone = "";
	private String adresse = "";

	

	public Champ(int id, String adresse, int surface, String type, String coordGps, String polygone, Client clients) {
		super();
		this.clients = clients;
		this.id = id;
		this.type = type;
		this.coordGps = coordGps;
		this.surface = surface;
		this.polygone = polygone;
		this.adresse = adresse;
	}


	public Client getClients() {
		return this.clients;
	}

	
	public void setClients(Client newClients) {
		this.clients = newClients;
	}

	
	public int getId() {
		return this.id;
	}

	
	public void setId(int newId) {
		this.id = newId;
	}

	
	public String getType() {
		return this.type;
	}

	
	public void setType(String newType) {
		this.type = newType;
	}

	
	public String getCoordGps() {
		return this.coordGps;
	}
	
	public double getCenterLat() {
		return Double.parseDouble(this.coordGps.split(",")[0]);
	}
	public double getCenterLong() {
		return Double.parseDouble(this.coordGps.split(",")[1]);
	}
	
	public void setCoordGps(String newCoordGps) {
		this.coordGps = newCoordGps;
	}

	
	public int getSurface() {
		return this.surface;
	}

	
	public void setSurface(int newSurface) {
		this.surface = newSurface;
	}

	
	public String getPolygone() {
		return this.polygone;
	}

	
	public void setPolygone(String newPolygone) {
		this.polygone = newPolygone;
	}

	
	public String getAdresse() {
		return this.adresse;
	}

	
	public void setAdresse(String newAdresse) {
		this.adresse = newAdresse;
	}


	@Override
	public String toString() {
		return "Champ [clients=" + clients.toString() + ", id=" + id + ", type=" + type + ", coordGps=" + coordGps + ", surface="
				+ surface + ", polygone=" + polygone + ", adresse=" + adresse + "]";
	}

}
