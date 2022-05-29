module isep.info.clement {
    requires javafx.controls;
    requires javafx.fxml;


    opens isep.info.clement to javafx.fxml;
    exports isep.info.clement;
}