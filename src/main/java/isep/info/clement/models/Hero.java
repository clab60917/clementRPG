package isep.info.clement.models;

public class Hero {
    //on definit les différentes classes pour tous les héros//
    private String nomDuHero;
    private int vie;
    private int id;
    private int weaponDamage;

    //On definit les actions possibles par le héro//
    private static int attack;
    private boolean defendBoolean;
    private int nombrebPotions;
    private int nombreLembas;

    //On veut retourner le nom, la vie et l'id du hero//
    public String getNomDuHero() {
        return nomDuHero;
    }
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }
    public int getId(){
        return id;
    }


//Mise en place ATTAQUE et DEFENSE//

    //Set Attaque//
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attaque) {
        this.attack = attaque;
    }
    public void attack(){

    }
    //Set Defense //
    private void defend(){
    }
    public boolean isDefendBoolean() {
        return defendBoolean;
    }
    public void setDefendBoolean(boolean defendBoolean) {
        this.defendBoolean = defendBoolean;
    }
    //Utilise la class Consumable pour l'utiliser avec tous les heros//
    private void useConsumable(Consumable consumable) {

    }
    //On veut retourner le nombre de Lembas//
    public int getNombreLembas() {
        return nombreLembas;
    }
    public void setNombreLembas(int nombreLembas) {
        this.nombreLembas = nombreLembas;
    }
    //On veut retourner le nombre de Potions//
    public int getNombrebPotions() {
        return nombrebPotions;
    }
    public void setNombrebPotions(int nombrebPotions) {
        this.nombrebPotions = nombrebPotions;
    }

}

