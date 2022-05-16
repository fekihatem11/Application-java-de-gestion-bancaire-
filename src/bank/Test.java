package bank;

import java.util.Scanner;



public class Test {

	static public void afficher_tableau(Compte[] tab, int n) {
		for (int j = 0; j < n; j++) {
			System.out.println("Voici le" + j + "ème compte: " + tab[j].toString());
		}
	}

	static void depot_montant(Compte[] tab, int n) {
		for (int i = 0; i < n; i++) {
			tab[i].versement(200 + 100 * 6);
		}
	}

	static void virement_tableau(Compte[] tab, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				tab[i].virement(20, tab[j]);
			}
		}

	}

	static void affiche_soldes(Compte[] tab, int n) {
		for (int i = 0; i < n; i++) {
			tab[i].affiche_solde();
		}

	}

	static void SoldeTotaleParCompte(Compte[] tab, int k, Scanner sc) {
		double totalsolde = 0;

		sc.nextLine();
		System.out.println("Veuillez entrer 1 pour donner cin 2 pour donner nom et 3 pour le prenom:");
		int c = sc.nextInt();

		if (c == 1) {

			System.out.println("Veuillez entrer le cin du client:");
			long n = sc.nextLong();

			for (int i = 0; i < k; i++) {
				if (tab[i].getClient().getCin() == n) {
					totalsolde += tab[i].getSolde();

				}
			}
			System.out.printf("le solde totale par compte du cin %d ,%f1", n, totalsolde);
		}

		else if (c == 2) {
			System.out.println("Veuillez entrer le nom du client:");

			sc.nextLine();
			String nom = sc.nextLine();

			for (int j = 0; j < k; j++) {

				if ((tab[j].getClient().getNom().equals(nom))) {
					totalsolde += tab[j].getSolde();
					System.out.println(totalsolde);

				}
			}
			System.out.printf("le solde totale par compte du nom %s ,%f 2\n", nom, totalsolde);
		} else if (c == 3) {
			System.out.println("Veuillez entrer le prenom du client:");

			sc.nextLine();
			String prenom = sc.nextLine();

			for (int e = 0; e < k; e++) {
				if (tab[e].getClient().getPrenom().equals(prenom)) {
					totalsolde += tab[e].getSolde();

				}
			}
			System.out.printf("le solde totale par compte du nom %s ,%f \n", prenom, totalsolde);
		} else {

			System.out.println("numero entrer n est pas valide");
		}
		sc.close();

	}

	public static void main(String[] args) {
		Agence a = new Agence("BT", "Tunis", 0, 0);
		/*
		 * Client C1=new Client("BenSalah","Ali",1234,1500); Client C2=new
		 * Client("Bouden","Najla",5678,1450); System.out.println(C1); // equivalent
		 * C1.toString() System.out.println(C2); //equivalent C2.toString()
		 */

		// Manipulation 1
		/*
		 * Compte Compt1=new Compte(986857,"Ben Salah","Ali",1234,1500,9500,a); Compte
		 * Compt2=new Compte(978387,"Bouden","Najla",5678,1450,10000,a);
		 * System.out.println("Solde du 1er compte avant versement: "+Compt1.getSolde())
		 * ;
		 * System.out.println("Solde du 2nd compte avant versement: "+Compt2.getSolde())
		 * ; Compt1.versement(800); Compt2.versement(1200);
		 * System.out.println("Solde du 1er compte aprés versement: "+Compt1.getSolde())
		 * ;
		 * System.out.println("Solde du 2nd compte aprés versement: "+Compt2.getSolde())
		 * ; Compt1.retrait(11000);
		 * System.out.println("Solde du 1er compte aprés retrait: "+Compt1.getSolde());
		 * Compt2.virement(400,Compt1);
		 * System.out.println("Solde du 1er compte aprés virement: "+Compt1.getSolde());
		 * System.out.println("Solde du 2nd compte aprés virement: "+Compt2.getSolde());
		 */

		// Manipulation 2
		Compte[] tab = new Compte[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Veuillez entrer le RIB du client:");
			long Rib = sc.nextLong();
			System.out.println("Veuillez entrer le nom du client:");
			sc.nextLine();
			String nom = sc.nextLine();
			System.out.println("Veuillez entrer le prenom du client:");
			String prenom = sc.nextLine();
			System.out.println("Veuillez entrer le cin du client:");
			long cin = sc.nextLong();
			System.out.println("Veuillez entrer le salaire du client:");
			double salaire = sc.nextDouble();
			System.out.println("Veuillez entrer le solde du client:");
			double solde = sc.nextDouble();
			tab[i] = new Compte(Rib, nom, prenom, cin, salaire, solde, a);

		}

		afficher_tableau(tab, 3);
		System.out.println("avant depot");
		afficher_tableau(tab, 3);
		depot_montant(tab, 3);
		System.out.println("après depot");
		afficher_tableau(tab, 3);
		System.out.println("avant virement");
		afficher_tableau(tab, 3);
		virement_tableau(tab, 3);
		System.out.println("après virement");
		afficher_tableau(tab, 3);
		affiche_soldes(tab, 3);
		Compte.compare_soldes(tab[0], tab[1]); // comparaison solde
		tab[0].compare_soldes(tab[1]);
		Compte.tri_comptes(tab);
		System.out.println("tableau apres tri");
		afficher_tableau(tab, 3);

		SoldeTotaleParCompte(tab, 3, sc);

	}
}
