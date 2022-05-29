package isep.info.clement.models;

public class Hunter extends Hero {
    //Mise en place des attributs Hunter//
    private String nom = "hunter";
    private int id;
    private int vie = 100;
    private int fleche = 10;
    private static int attack = 20;
    private boolean defendBoolean = false;
    private int nombrePotions = 2;
    private int nombreLembas = 4;

    //On retourne les attributs en question//
    public Hunter(int id) {
        this.id = id;
        this.nom = nom;
        this.vie = vie;
        this.fleche = fleche;
        this.attack = attack;
        this.defendBoolean = defendBoolean;
        this.nombreLembas = nombreLembas;
        this.nombrePotions = nombrePotions;
    }
    //Retourne l'id//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Retourne le nom de Hunter//
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Retourne la vie du Hunter//
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }

    //Retourne attaque fleche//
    public int getAttack() {
        return fleche;
    }
    public void setAttack(int fleche) {
        this.fleche = fleche;
    }

    //Retourne la defense du Hunter//
    public boolean isDefendBoolean() {
        return defendBoolean;
    }
    public void setDefendBoolean(boolean defendBoolean) {
        this.defendBoolean = defendBoolean;
    }

}
