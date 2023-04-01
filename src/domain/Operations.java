package domain;

    public class Operations {
        //Methode de l'addition
        public static void deposerSolde(Compte compte, int montant) {
            int soldeActuel = compte.getSoldeCompte();
            compte.setSoldeCompte(soldeActuel + montant);
        }
         //Methode de la soustraction
        public static void retirerSolde(Compte compte, int montant) {
            int soldeActuel = compte.getSoldeCompte();
            compte.setSoldeCompte(soldeActuel - montant);
        }
    }

