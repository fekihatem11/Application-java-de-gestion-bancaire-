package bank;

public class ClientVIP extends Client {
	String nom_entreprise;
	double chiffre_affaire;
	int nbre_emploues;
	public ClientVIP(String nom, String prenom, long cin, double salaire, String nom_entreprise, double chiffre_affaire,
			int nbre_emploues) {
		super(nom, prenom, cin, salaire);
		this.nom_entreprise = nom_entreprise;
		this.chiffre_affaire = chiffre_affaire;
		this.nbre_emploues = nbre_emploues;
	}
	public String getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}
	public double getChiffre_affaire() {
		return chiffre_affaire;
	}
	public void setChiffre_affaire(double chiffre_affaire) {
		this.chiffre_affaire = chiffre_affaire;
	}
	public int getNbre_emploues() {
		return nbre_emploues;
	}
	public void setNbre_emploues(int nbre_emploues) {
		this.nbre_emploues = nbre_emploues;
	}
	

}
