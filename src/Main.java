import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {

        var root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getStyleClass().add("root"); // Tambahkan kelas CSS untuk root

        var lbl = new Label("Silahkan pilih contact service yang ingin di hubungi");
        lbl.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        lbl.setTextFill(Color.web("#333"));
        lbl.setId("infoLabel");

        var chbox = new ChoiceBox<>(FXCollections.observableArrayList(
                "First", "Second", "Third", "Fourth", "Fifth"));
        chbox.getStyleClass().add("modernChoiceBox");

        chbox.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue != null) {
                switch (newValue) {
                    case "First":
                        lbl.setText("NAMA   : MUHAMMAD ROHISUL IMAN\n"
                                  + "NIM    : 20230801000\n"
                                  + "EMAIL  : rohisul@example.com\n"
                                  + "GITHUB : github.com/rohisul");
                        break;
                    case "Second":
                        lbl.setText("NAMA   : MUHAMMAD JAREZ\n"
                                  + "NIM    : 20230801001\n"
                                  + "EMAIL  : jarez@example.com\n"
                                  + "GITHUB : github.com/jarez");
                        break;
                    case "Third":
                        lbl.setText("NAMA   : BIMA SETYA RAMADHAN\n"
                                  + "NIM    : 20230801002\n"
                                  + "EMAIL  : bima@example.com\n"
                                  + "GITHUB : github.com/bima");
                        break;
                    case "Fourth":
                        lbl.setText("NAMA   : MUHAMMAD IQBAL AL KAUTSAR\n"
                                  + "NIM    : 20230801003\n"
                                  + "EMAIL  : iqbal@example.com\n"
                                  + "GITHUB : github.com/iqbal");
                        break;
                    case "Fifth":
                        lbl.setText("NAMA   : DINI FEBRIANI SARI\n"
                                  + "NIM    : 20230801004\n"
                                  + "EMAIL  : dini@example.com\n"
                                  + "GITHUB : github.com/dini");
                        break;
                    default:
                        lbl.setText("Pilihan tidak dikenal");
                        break;
                }
            }
        });

        root.getChildren().addAll(chbox, lbl);

        var scene = new Scene(root, 500, 350);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("Modern ChoiceBox UI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
