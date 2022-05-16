package bank;

import java.time.LocalDate;

public class CompteSalariee extends CompteAbstrait {

	public CompteSalariee(long rIB, Client client, double solde, Agence agence, LocalDate date_creation) {
		super(rIB, client, solde, agence, date_creation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean versement(double montant) {
		
		
			solde+=montant;
			agence.crediter(montant);
			return true;
	}

	@Override
	public boolean retrait(double montant) {
	
		if(this.solde>=montant)
		{
			solde-=montant;
			agence.debiter(montant);
			return true;
	}
		return false; 
	}

	@Override
	public boolean virement(double montant, CompteAbstrait C) {
		if(this.retrait(montant))
		{
	
			C.versement(montant);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CompteSalariee [RIB=" + RIB + ", client=" + client + ", solde=" + solde + ", agence=" + agence
				+ ", date_creation=" + date_creation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
