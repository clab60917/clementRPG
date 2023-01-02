package isep.info.clement;
//lalalalalallalaalalalalalalaalalaa
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameController {
    public Button fightButton;
    public Button defendButton;
    public Button consumableButton;
    public Label storyLabel;
    public Label enemyHealth;
    public Label heroHealth;

    @FXML
    private void Fight() {
        storyLabel.setText("You chose to attack !");
        HelloApplication.game.getBasicEnemy().setVie(HelloApplication.game.getBasicEnemy().getVie()-HelloApplication.game.getHero().getAttack());
        enemyHealth.setText(String.valueOf(HelloApplication.game.getBasicEnemy().getVie()));
        Issue();
    }

    private void Issue() {
        int heroVie = HelloApplication.game.getHero().getVie();
        int enemyVie = HelloApplication.game.getBasicEnemy().getVie();
        if (heroVie<=0) {
            storyLabel.setText("YOU LOST...");
            fightButton.setDisable(true);
            consumableButton.setDisable(true);
            defendButton.setDisable(true);
        }
        else if (enemyVie<=0){
            storyLabel.setText("YOU WON !!!");
            fightButton.setDisable(true);
            consumableButton.setDisable(true);
            defendButton.setDisable(true);
        }
        else {
            storyLabel.setText("The enemy struck hard!");
        }
    }

    @FXML
    private void Consumable() {
        storyLabel.setText("You chose to use a consumable !");
        // Attack with model Hero ?
    }

    @FXML
    private void Defend() {
        storyLabel.setText("You chose to defend !");
        HelloApplication.game.getHero().setVie(HelloApplication.game.getHero().getVie()-HelloApplication.game.getBasicEnemy().getPointsAttack());
        heroHealth.setText(String.valueOf(HelloApplication.game.getHero().getVie()));
        Issue();

    }
}
