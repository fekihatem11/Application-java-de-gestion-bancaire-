package bank;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;



public class CompteEpargne extends CompteAbstrait {

	private LocalDate date_dernier_versement;
	private double montant_cumule_mois;
	boolean actif;

	public CompteEpargne(long rIB, Client client, double solde, Agence agence, LocalDate date_creation) {
		super(rIB, client, solde, agence, date_creation);
		this.date_dernier_versement = LocalDate.now();
		this.montant_cumule_mois = 0;
		this.actif = true;
	}

	@Override
	public boolean versement(double montant) {
		LocalDate date_jour = LocalDate.now();
		Period p = Period.between(date_jour, this.date_dernier_versement);
		if (this.actif) {
			if ((p.getYears() == 0)) {
				if ((p.getMonths() == 1)) {
					if (this.montant_cumule_mois < 20) {
						System.out.print("Votre compte a été bloqué !");
						this.actif = false;
						return false;
					} else {
						this.date_dernier_versement = LocalDate.now();
						agence.crediter(montant);
						this.montant_cumule_mois = montant;
						this.solde += montant;
						return true;
					}
				} else if ((p.getMonths() == 0)) {
					this.date_dernier_versement = LocalDate.now();
					agence.crediter(montant);
					this.montant_cumule_mois += montant;
					this.solde += montant;
					return true;
				} else {
					System.out.print("Votre compte a été bloqué 1!");
					System.out.println();
					
					this.actif = false;
					return false;
				}

			}
		}
		System.out.print("Votre compte a été bloqué 2!");
		System.out.println();
		this.actif = false;
		return false;
	

	}

	@Override
	public boolean retrait(double montant) {
		LocalDate date_jour = LocalDate.now();

		Period p = Period.between( this.date_creation,date_jour);
		System.out.println(p.getYears()+"7895552");
		if ((solde > montant) && (p.getYears() >= 1) && (this.solde > 2000) && (this.actif)) {
			solde -= montant;
			agence.debiter(montant);
			return true;
		}
		System.out.println("retrait impossible!!!!!");
		System.out.println();
		
		return false;
		
	}

	@Override
	public boolean virement(double montant, CompteAbstrait C) {
        System.out.println("on ne peut pas faire un virement d un compte epargne ");
		return false;
	}

	@Override
	public String toString() {
		return "CompteEpargne [date_dernier_versement=" + date_dernier_versement + ", montant_cumule_mois="
				+ montant_cumule_mois + ", actif=" + actif + ", RIB=" + RIB + ", client=" + client + ", solde=" + solde
				+ ", agence=" + agence + ", date_creation=" + date_creation + "]";
	}

	public LocalDate getDate_dernier_versement() {
		return date_dernier_versement;
	}

	public void setDate_dernier_versement(LocalDate date_dernier_versement) {
		this.date_dernier_versement = date_dernier_versement;
	}

	public double getMontant_cumule_mois() {
		return montant_cumule_mois;
	}

	public void setMontant_cumule_mois(double montant_cumule_mois) {
		this.montant_cumule_mois = montant_cumule_mois;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}
	

}

