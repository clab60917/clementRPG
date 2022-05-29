package isep.info.clement.models;

public class Game {
    private Hero hero;
    private BasicEnemy basicEnemy = new BasicEnemy(2);

    public BasicEnemy getBasicEnemy() {
        return basicEnemy;
    }

    public void setBasicEnemy(BasicEnemy basicEnemy) {
        this.basicEnemy = basicEnemy;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
