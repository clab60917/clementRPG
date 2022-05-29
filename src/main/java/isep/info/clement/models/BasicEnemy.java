package isep.info.clement.models;

public class BasicEnemy {
    private int vie = 50;
    private int id;
    private int PointsAttack = 10;
    public BasicEnemy(int id) {
        this.id = id;
        this.vie = vie;
        this.PointsAttack = PointsAttack;
    }public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPointsAttack() {
        return PointsAttack;
    }
    public void setPointsAttack(int pointsAttack) {
        this.PointsAttack = pointsAttack;
    }
}
