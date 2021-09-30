module org.lundcomputing {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.lundcomputing to javafx.fxml;
    exports org.lundcomputing;
}
