package isep.info.clement;

import isep.info.clement.models.Healer;
import isep.info.clement.models.Hunter;
import isep.info.clement.models.Mage;
import isep.info.clement.models.Warrior;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class LobbyController {
    public Button startGame;
    public ToggleGroup radioGroup;
    private String toggleGroupValue = "Hunter";

    @FXML
    public void StartGame(ActionEvent actionEvent) throws IOException {
        switch (toggleGroupValue) {
            case "Hunter":
                Hunter hunter = new Hunter(1);
                HelloApplication.game.setHero(hunter);
                break;
            case "Warrior":
                Warrior warrior = new Warrior(1);
                HelloApplication.game.setHero(warrior);
                break;
            case "Mage":
                Mage mage = new Mage(1);
                HelloApplication.game.setHero(mage);
                break;
            case "Healer":
                Healer healer = new Healer(1);
                HelloApplication.game.setHero(healer);
                break;
        }
        System.out.println(toggleGroupValue);
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void GetRole(ActionEvent actionEvent) throws IOException {
        RadioButton selectedRadioButton = (RadioButton) radioGroup.getSelectedToggle();
        toggleGroupValue = selectedRadioButton.getText();
    }
}
