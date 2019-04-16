
package finalproject2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable {
    // Toggle ListView
    @FXML
    RadioButton movieToggle = new RadioButton();
    @FXML
    RadioButton tvToggle = new RadioButton();
    ToggleGroup type = new ToggleGroup();/*
    movieToggle.setToggleGroup(type);
    movieToggle.setSelected(true);
    tvToggle.setToggleGroup(type);*/
    
    // Filters
    @FXML
    TextField titleFilter = new TextField();
    String title = titleFilter.getText();
    // read file to find title
    @FXML
    TextField dirFilter = new TextField();
    String director = dirFilter.getText();
    // read file for director
    @FXML
    TextField yearFilter = new TextField();
    Integer year = Integer.parseInt(yearFilter.getText());
    // read file for year
    @FXML
    Slider ratingFilter =  new Slider(0, 10, 0);/*
    ratingFilter.setShowTickLabels(true);
    ratingFilter.setBlockIncrement(1);
    ratingFilter.getValue();
    int rating = ratingFilter.getValue(); */
    @FXML
    ChoiceBox<String> genreFilter = new ChoiceBox();
    // reads enum and fills with options
    @FXML
    TextField seasonCount = new TextField();
    Integer seasons = Integer.parseInt(seasonCount.getText());
    
    // Buttons
    @FXML
    private Button editBtn;
    @FXML
    private void handleEditButtonAction(ActionEvent event) {

    }
    @FXML
    private Button delBtn;
    @FXML
    private void handleDelButtonAction(ActionEvent event) {

    }
    @FXML
    private Button addBtn;
    @FXML
    private void handleAddButtonAction(ActionEvent event) {

    } 
    // ListView and Sorting
    @FXML
    private ComboBox<String> sortCombo;
    @FXML
    private ListView<String> list;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
