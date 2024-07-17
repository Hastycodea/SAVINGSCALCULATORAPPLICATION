module savings.application {
    requires javafx.controls;
    requires javafx.fxml;

    opens savings.application to javafx.fxml;
    exports savings.application;
}
