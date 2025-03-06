package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.IOException;
import edu.westga.comp4420.grocery_list.model.GroceryItem;
import edu.westga.comp4420.grocery_list.Main;

public class MainWindow {   
	@FXML private ListView<GroceryItem> groceryItems;
	@FXML private AnchorPane guiPane;
	@FXML
	void addItem(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(Main.ADD_ITEM_WINDOW_RESOURCE));
			loader.load();
			Parent parent = loader.getRoot();
			Scene scene = new Scene(parent);
			Stage addItemStage = new Stage();
			addItemStage.setTitle(Main.WINDOW_TITLE);
			addItemStage.setScene(scene);
			addItemStage.initModality(Modality.APPLICATION_MODAL);
			AddItemWindow controller = (AddItemWindow) loader.getController();
			controller.setItemList(this.groceryItems.getItems());
			addItemStage.showAndWait();
		} catch (IOException error) {
			Alert errorBox = new Alert(AlertType.ERROR);
			errorBox.setContentText("Unable to open add window");
			errorBox.showAndWait();
		}
	}
	@FXML
	void removeItem(ActionEvent event) {
		GroceryItem selectedItem = this.groceryItems.getSelectionModel().getSelectedItem();
		if (selectedItem != null) {
			this.groceryItems.getItems().remove(selectedItem);
		}
	}
    @FXML
    void updateItem(ActionEvent event) {
        try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(Main.UPDATE_ITEM_WINDOW_RESOURCE));
			loader.load();
			Parent parent = loader.getRoot();
			Scene scene = new Scene(parent);
			Stage updateItemStage = new Stage();
			updateItemStage.setTitle(Main.WINDOW_TITLE);
			updateItemStage.setScene(scene);
			updateItemStage.initModality(Modality.APPLICATION_MODAL);
			UpdateItemWindow controller = (UpdateItemWindow) loader.getController();
			controller.setItemList(this.groceryItems.getItems());
			controller.setSelectedItem(this.groceryItems.getSelectionModel().getSelectedItem());
			updateItemStage.showAndWait();
			
			
        } catch (IOException error) {
			GroceryItem selectedItem = this.groceryItems.getSelectionModel().getSelectedItem();
            Alert errorBox = new Alert(AlertType.ERROR);
            errorBox.setContentText("Unable to open update window");
            errorBox.showAndWait();
        }
    }


    @FXML
    void initialize() {
        assert this.groceryItems != null : "fx:id=\"groceryItems\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.guiPane != null : "fx:id=\"guiPane\" was not injected: check your FXML file 'MainWindow.fxml'.";
    }
}