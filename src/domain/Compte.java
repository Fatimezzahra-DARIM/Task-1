package domain;
//Class la 1er lettre toujours majuscule --Public
public class Compte {
//Attributs tjrs private & camelCase
    private String nomBank;
    private String nomTitulaire;
    private Integer soldeCompte;
    public Compte(String nomBank, String nomTitulaire, Integer soldeCompte){
        this.nomBank = nomBank;
        this.nomTitulaire=nomTitulaire;
        this.soldeCompte= soldeCompte;
    }
// pour ajouter getters et setters =>"Press Alt + Insert"
    public String getNomBank() {
        return nomBank;
    }

    public void setNomBank(String nomBank) {
        this.nomBank = nomBank;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public Integer getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(Integer soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
