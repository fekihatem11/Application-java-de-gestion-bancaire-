package bank;

public class Agence {
	private String nom, adresse;
	public static double credit_global_banque, debit_global_banque;
	public double credit_global_agence, debit_global_agence;

	public Agence(String nom, String adresse, double credit_global_agence, double debit_global_agence) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.credit_global_agence = credit_global_agence;
		this.debit_global_agence = debit_global_agence;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public static double getCredit_global_banque() {
		return credit_global_banque;
	}

	public static void setCredit_global_banque(double credit_global_banque) {
		Agence.credit_global_banque = credit_global_banque;
	}

	public static double getDebit_global_banque() {
		return debit_global_banque;
	}

	public static void setDebit_global_banque(double debit_global_banque) {
		Agence.debit_global_banque = debit_global_banque;
	}

	public double getCredit_global_agence() {
		return credit_global_agence;
	}

	public void setCredit_global_agence(double credit_global_agence) {
		this.credit_global_agence = credit_global_agence;
	}

	public double getDebit_global_agence() {
		return debit_global_agence;
	}

	public void setDebit_global_agence(double debit_global_agence) {
		this.debit_global_agence = debit_global_agence;
	}

	public boolean crediter(double montant) {
		credit_global_agence += montant;
		credit_global_banque += montant;
		return true;

	}

	public boolean debiter(double montant) {
		debit_global_agence -= montant;
		debit_global_banque -= montant;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Nom agence: " + this.nom + "Adresse de l'agence: " + this.adresse);
	}

}
