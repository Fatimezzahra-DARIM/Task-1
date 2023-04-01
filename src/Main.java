

//import domain.Compte;
//import domain.Operations;
import domain.*;

import static domain.Operations.deposerSolde;
import static domain.Operations.retirerSolde;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bonjour Anas! c'est mon 1er challenge \n => Merci infiniment \n");

        Compte monCompte = new Compte("MaBanque", "Fatimezzahra", 100);
        System.out.println("Solde initial: " + monCompte.getSoldeCompte());

        // Ajouter 50 dhs
        deposerSolde(monCompte, 50);
        System.out.println("Solde après ajout: " + monCompte.getSoldeCompte());

        // Retirer 20 dhs
        retirerSolde(monCompte, 60);
        System.out.println("Solde après retrait: " + monCompte.getSoldeCompte());
    }
}
