package isep.info.clement;

import isep.info.clement.models.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public Stage gameWindow = new Stage();
    public Stage lobbyWindow = new Stage();
    public static Game game = new Game();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader lobbyLoader = new FXMLLoader();
        lobbyLoader.setLocation(getClass().getResource("lobby.fxml"));
        Parent lobbyRoot = lobbyLoader.load();
        Scene lobbyScene = new Scene(lobbyRoot);
        lobbyWindow.setResizable(false);
        lobbyWindow.setScene(lobbyScene);
        lobbyWindow.showAndWait();

        //Afficher la fenêtre du jeu
        FXMLLoader gameLoader = new FXMLLoader();
        gameLoader.setLocation(getClass().getResource("game.fxml"));
        Parent gameRoot = gameLoader.load();
        Scene gameScene = new Scene(gameRoot);
        gameWindow.setResizable(false);
        gameWindow.setScene(gameScene);
        gameWindow.show();
    }

    public static void main(String[] args) {
        launch();
    }
}