package isep.info.clement.models;

public class Warrior extends Hero {
    //Mise en place des attributs Warrior//
    private String nom = "warrior";
    private int id;
    private int vie = 100;
    private static int attack = 20;
    private boolean defendBoolean = false;
    private int nombrePotions = 3;
    private int nombreLembas = 3;

    //On retourne les attributs en question//
    public Warrior(int id) {
        this.id = id;
        this.nom = nom;
        this.vie = vie;
        this.attack = attack;
        this.defendBoolean = defendBoolean;
        this.nombrePotions = nombrePotions;
        this.nombreLembas = nombreLembas;
    }
    //Retourne l'id//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Retourne le nom//
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Retourne les points de vie//
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }

    //Retourne l'attaque du Warrior//
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //Retourne la defense du Warrior//
    public boolean isDefendBoolean() {
        return defendBoolean;
    }
    public void setDefendBoolean(boolean defendBoolean) {
        this.defendBoolean = defendBoolean;
    }
}
