package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MinesweeperController {

	//The only stage we are using
	protected static Stage stage;
	
	//The instances of the Scenes we will use and their controllers
	protected static Scene difficulty_scene;
	protected static DifficultyController difficulty_controller;

	//Setting up the difficulty and game scene and coupling them with their controllers
	public static void init(Stage primaryStage) {
		
		//Saving instance of the stage being shown
		stage = primaryStage;
		
		try {
			//Loading difficulty_scene
			FXMLLoader difficulty_loader = new FXMLLoader();
			difficulty_loader.setLocation(MinesweeperController.class.getResource("/view/Difficulty.fxml"));
			Parent difficulty_root = difficulty_loader.load();
			difficulty_scene = new Scene(difficulty_root);
			difficulty_controller = difficulty_loader.getController();
			//Loading game_scene
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		stage.setTitle("Welcome to Jake Zhou's Minesweeper!");
		stage.setResizable(false);
		stage.setScene(difficulty_scene);
		stage.show();
		
	}
	
}
