package bank;
import java.time.LocalDate;
import java.time.Month;


public class test1 {
public static void main ( String [] args) {
	LocalDate date_jour1 = LocalDate.now();
	
	Agence a = new Agence("BT", "Tunis", 0, 0);
	CompteAbstrait tab []=new CompteAbstrait[3];
	Client C1=new ClientSalariee("BenSalah","mohamed",1234,1500); 
	Client C2=new Client("ahmed","zioudi",5678,1450);
	ClientVIP C3=new ClientVIP("ahmed","zioudi",5678,1450,"google",100, 789456);
	tab[0]=new CompteSalariee(6240,C1,876,a,date_jour1);
	//tab[1]=new CompteEpargne(445566,C2,500,a,LocalDate.of(2020,Month.DECEMBER, 5));
	tab[1]=new CompteEpargne(445566,C2,500,a,LocalDate.of(2019,Month.DECEMBER, 5));
	tab[2]=new CompteVIP(8745,C3,10,a,LocalDate.of(2020,Month.DECEMBER, 5));
	for (int i = 0; i < 3; i++) {
		System.out.println(tab[i]);
	}
/*******
	((CompteEpargne) tab[1]).setDate_dernier_versement(LocalDate.of(2021,Month.OCTOBER, 20));	//-q'un mois + montant
	((CompteEpargne) tab[1]).setMontant_cumule_mois(10);
	((CompteEpargne) tab[1]).versement(100);
	*//////////////////////////////
	
	((CompteEpargne) tab[1]).setDate_dernier_versement(LocalDate.of(2021,Month.OCTOBER, 10));	//+ q'un mois +20
      ((CompteEpargne) tab[1]).setMontant_cumule_mois(10);
  	((CompteEpargne) tab[1]).versement(3000);
	System.out.println(tab[1]);
  	/****
 ((CompteEpargne) tab[1]).setDate_creation(LocalDate.of(2021,Month.OCTOBER, 10)); -q'une annee
 ((CompteEpargne) tab[1]).retrait(25);
  	 */
  	/******
  	 ((CompteEpargne) tab[1]).setDate_creation(LocalDate.of(2020,Month.OCTOBER, 10));	+ une annnee ,<2000
  	((CompteEpargne) tab[1]).retrait(120);
  	*///////////////////
	((CompteEpargne) tab[1]).setActif(true);
	((CompteEpargne) tab[1]).setSolde(3000);
	System.out.println(tab[1]);
 	 ((CompteEpargne) tab[1]).setDate_creation(LocalDate.of(2020,Month.OCTOBER, 10));	//+ une annnee ,>2000
 	((CompteEpargne) tab[1]).retrait(2500);
	System.out.println(tab[1]);
	
	
	
	
	
	((CompteVIP) tab[2]).versement(90);
	System.out.println(tab[2]);
	
	
	
	//((CompteVIP) tab[2]).retrait(105);//retrait possible
	((CompteVIP) tab[2]).retrait(115);//retrait impossible
	System.out.println(tab[2]);
	//((CompteVIP) tab[2]).virement(10,tab[0]);//retrait possible 
	((CompteVIP) tab[2]).virement(200,tab[0]);//virement impossible 
	
	System.out.println(tab[2]);
	System.out.println(tab[0]);


	
}
}
