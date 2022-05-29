package isep.info.clement.models;


public class Mage extends Hero {
    //Mise en place des attributs Mage//
    private String nom = "mage";
    private int id;
    private int vie = 100;
    private int mana = 45;
    private static int attack = 20;
    private boolean defendBoolean = false;
    private int nombreLembas = 2;
    private int nombrePotions = 7;

    //On retourne les attributs en question//
    public Mage(int id) {
        this.id = id;
        this.nom = nom;
        this.vie = vie;
        this.mana = mana;
        this.attack = attack;
        this.defendBoolean = defendBoolean;
        this.nombrePotions = nombrePotions;
        this.nombreLembas = nombreLembas;

    }
    //Retourne l'id du Mage//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Retourne le nom Mage//
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Retourne la vie du Mage//
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }

    //Retourne Mana//
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    //Retourne l'attaque du Mage//
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attaque) {
        this.attack = attaque;
    }

    //Retourne la defense du Mage//
    public boolean isDefendBoolean() {
        return defendBoolean;
    }
    public void setDefendBoolean(boolean defendBoolean) {
        this.defendBoolean = defendBoolean;
    }

}

