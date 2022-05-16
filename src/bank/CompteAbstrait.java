package bank;

import java.time.LocalDate;



public abstract class CompteAbstrait {

	protected long RIB;
	Client client;
	double solde;
	Agence agence;
	LocalDate date_creation;
	
	

	public CompteAbstrait(long rIB, Client client, double solde, Agence agence, LocalDate date_creation) {
		super();
		RIB = rIB;
		this.client = client;
		this.solde = solde;
		this.agence = agence;
		this.date_creation = date_creation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public abstract boolean versement(double montant);

	public abstract boolean retrait(double montant);

	public abstract boolean virement(double montant, CompteAbstrait C);

	public LocalDate getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(LocalDate date_creation) {
		this.date_creation = date_creation;
	}
	

}
