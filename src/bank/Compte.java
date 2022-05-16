package bank;
import java.util.Arrays;
import java.util.Comparator;
public  class Compte {
	private long RIB;
	Client client;
	double solde;
	Agence agence;
	
	
	public Compte(long rIB,String nom_client , String prenom_client ,long cin_client ,double client_salaire, double solde,Agence a) {
		super();
		this.RIB = rIB;
		this.agence=a;
		this.client =new Client(nom_client,prenom_client,cin_client,client_salaire);
		this.solde = solde;
	}
	
	
	






	@Override
	public String toString() {
		return "Compte [RIB=" + RIB + ", nom=" + client.getNom() +", prenom=" + client.getPrenom() + ", cin=" + client.getCin() +", salaire=" + client.getSalaire()+", solde" + solde + "]";
	}




	public long getRIB() {
		return RIB;
	}


	public void setRIB(long rIB) {
		RIB = rIB;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Agence getAgence() {
		return agence;
	}


	public void setAgence(Agence agence) {
		this.agence = agence;
	}


	public boolean versement (double montant)
	{
		solde+=montant;
		agence.crediter(montant);
		return true;
	}
	
	public boolean retrait (double montant)
	{
		if(this.solde>=montant)
		{
			solde-=montant;
			agence.debiter(montant);
			return true;
		}
		return false;
	}
	
	public boolean virement (double montant,Compte C)
	{
		if(retrait(montant))
		{
			//this.retrait(montant);
			C.versement(montant);
			return true;
		}
		return false;
	}
	public void affiche_solde() {
		System.out.printf("solde du client %d est %.2f \n",this.getRIB(),this.getSolde());
	}
   public int compare_soldes(Compte c) {
	   if (this.getSolde()>c.getSolde()) {
			System.out.printf("le compte du rib %d possède plus d'argent que le compte du rib %d \n",this.getRIB(),c.getRIB());
			return 1;
		}
		else if (this.getSolde()<c.getSolde()) {
			System.out.printf("le compte du rib %d possède plus d'argent que le compte du rib %d\n",c.getRIB(),this.getRIB());
			return -1;
		}
		else {
			System.out.printf("le compte du rib %d possède le meme nombre  d'argente que le compte du rib %d\n",c.getRIB(),this.getRIB());
		return 0;
		}
	   
   }

public static 	int compare_soldes (Compte c1,Compte c2)
{
	if (c1.getSolde()>c2.getSolde()) {
		System.out.printf("le compte du rib %d possède plus d'argent que le compte du rib %d\n",c1.getRIB(),c2.getRIB());
		return 1;
	}
	else if (c1.getSolde()>c2.getSolde()) {
		System.out.printf("le compte du rib %d possède plus d'argent que le compte du rib %d\n",c2.getRIB(),c1.getRIB());
		return -1;
	}
	else {
		System.out.printf("le compte du rib %d possède le meme nombre  d'argente que le compte du rib %d\n",c1.getRIB(),c2.getRIB());
		return 0;
	}
}
static public void tri_tableau(Compte []tab,int n)
{
boolean permutation=true;
while(permutation)
{
permutation=false;
for (int i=0;i<n-1;i++)
{
if(Compte.compare_soldes(tab[i],tab[i+1])>0)
{
Compte aux;
aux=tab[i];
tab[i]=tab[i+1];
tab[i+1]=aux;
permutation=true;

}
}
}

}
public static void  tri_comptes (Compte []tab) {
	Arrays.sort(tab, new Comparator<Compte>(){

		@Override
		public int compare(Compte o1, Compte o2) {
			return (Compte.compare_soldes(o1,o2));
		
	
}});}


}

