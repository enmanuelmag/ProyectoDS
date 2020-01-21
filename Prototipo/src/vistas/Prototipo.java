/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Msi
 */
public class Prototipo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("AdminPrincipal.fxml"));

        stage.initStyle(StageStyle.UNDECORATED);
        
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(e -> {
            
            if(e.getCode().equals(KeyCode.ESCAPE)){
                stage.close();
            }
        
        });
        stage.setScene(scene);
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
