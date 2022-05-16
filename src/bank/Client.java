package bank;

public  class  Client {
	
	private String nom,prenom;
	private long cin;
	private double salaire ;
	private static int nb_clients;
		
	public Client(String nom, String prenom, long cin, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.salaire = salaire;
		nb_clients++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Nom: "+this.nom+" Prenom: "+this.prenom +" Salaire: "+this.salaire);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public static int getNb_clients() {
		return nb_clients;
	}

	public static void setNb_clients(int nb_clients) {
		Client.nb_clients = nb_clients;
	}
	
}
