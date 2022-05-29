package isep.info.clement.models;

public class Healer extends Hero {
    //Mise en place des attributs Healer//
    private String nom = "healer";
    private int id;
    private int vie = 100;
    private static int CapaspecialeSoin = 15;
    private int attack = 5;
    private boolean defendBoolean = false;
    private int nombrePotions = 2;
    private int nombreLembas = 4;

    //On retourne les attributs en question//
    public Healer(int id) {
        this.id = id;
        this.vie = vie;
        this.nom = nom;
        this.attack = attack;
        this.CapaspecialeSoin = CapaspecialeSoin;
        this.defendBoolean = defendBoolean;
        this.nombrePotions = nombrePotions;
        this.nombreLembas = nombreLembas;
    }
    //Retourne l'id du Healer//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Retourne le nom Healer//
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Retourne la vie du Healer//
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }

    //Retourne la capacite speciale Soin//
    public static int getCapaspecialeSoin() {
        return CapaspecialeSoin;
    }
    public void setSoin(int soin) {
        this.CapaspecialeSoin = soin;
    }


}
