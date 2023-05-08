module com.example.comp1011week1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1011week1 to javafx.fxml;
    exports com.example.comp1011week1;
}