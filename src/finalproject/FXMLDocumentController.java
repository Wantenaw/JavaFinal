
package finalproject;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable{
    File f = new File("tv.txt");
    ArrayList<TV> tv = new ArrayList(); //loadFileTV(f);
    File f2 = new File("mov.txt");
    ArrayList<Movie> mov = new ArrayList(); //loadFileMOV(f2);
    // Toggle ListView
    @FXML
    RadioButton movieToggle = new RadioButton();
    @FXML
    RadioButton tvToggle = new RadioButton();
    ToggleGroup type = new ToggleGroup();
            
    // Filters
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
    Slider ratingFilter =  new Slider(0, 10, 0);
    @FXML
    ChoiceBox<Genres> genreFilter = new ChoiceBox();
    
    @FXML
    TextField seasonCount = new TextField();
    Integer seasons = Integer.parseInt(seasonCount.getText());
    
    // ListView and Sorting
    @FXML
    private ComboBox<String> sortCombo;
    @FXML
    private ListView<String> list;
    
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
        //list.remove(list.SelectedItems());
    }
    @FXML
    private Button addBtn;
    @FXML
    private void handleAddButtonAction(ActionEvent event) {

    } 
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // configure radio buttons
        movieToggle.setToggleGroup(type);
        movieToggle.setSelected(true);
        tvToggle.setToggleGroup(type);
        if(movieToggle.isSelected()){
            list.setItems(FXCollections.observableArrayList(mov));
        } else {
            list.setItems(FXCollections.observableArrayList(tv));
        }
        // Title Filter
        if(!title.isEmpty()){
        if(movieToggle.isSelected()){
            list.getItems().clear();
            for(int x = 0 ; x >= mov.size() ; x++){
                Movie temp = mov.get(x);
                String ep = temp.getTitle();
                if(Pattern.compile(Pattern.quote(title), Pattern.CASE_INSENSITIVE).matcher(ep).find())
                    list.getItems().add(ep);
                }
            }
            //if(list.getItems() == 0){
                
            }
        
        }
        
        
        // configure slider
/*
        ratingFilter.setShowTickLabels(true);
        ratingFilter.setBlockIncrement(1);
        ratingFilter.getValue();
        int rating = (int)(ratingFilter.getValue());
        // Set genres to enum
        genreFilter.setItems(FXCollections.observableArrayList(Genres.values()));
*/    
}    
    

