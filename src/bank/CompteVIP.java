package bank;

import java.time.LocalDate;


public class CompteVIP extends CompteAbstrait{

	public CompteVIP(long rIB, ClientVIP client, double solde, Agence agence, LocalDate date_creation) {
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
		
		if (solde+0.005*((ClientVIP)this.client).getChiffre_affaire()>=montant ) {
			solde-=montant;
			agence.debiter(montant);
			return true;
		}
		System.out.println("retrait impoosible!!!!!!");
		return false;
	}

	@Override
	public boolean virement(double montant, CompteAbstrait C) {
		if(this.retrait(montant))
		{
	
			C.versement(montant);
			return true;
		}
		System.out.println("virement impossible !!!!");
		return false;
		
	}

	@Override
	public String toString() {
		return "CompteVIP [RIB=" + RIB + ", client=" + client + ", solde=" + solde + ", agence=" + agence
				+ ", date_creation=" + date_creation  + "]";
	}
	


	}


