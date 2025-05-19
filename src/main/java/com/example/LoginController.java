package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    Label usernamelabel;

    @FXML
    Label passwordlabel;

    @FXML
    TextField usernametextfield;

    @FXML
    TextField passwordtextfield;

    @FXML
    Button loginbutton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void loginbuttonHandler(ActionEvent event) throws IOException{

        String uname = usernametextfield.getText();
        String pword = passwordtextfield.getText();

        User user = new User(uname, pword, "", "");

        File accountsfile = new File("accounts.txt");

        if (accountsfile.exists()) {
            Scanner filescanner = new Scanner(accountsfile);

            while (filescanner.hasNextLine()) {

                String data = filescanner.nextLine();
    
                String username_from_file = data.split(",")[0];
                String password_from_file = data.split(",")[1];

                if (username_from_file.equals(user.getUsername()) && password_from_file.equals(user.getPassword())) {
                    
                    System.out.println("Login successful");
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                    root = loader.load();

                    // Load stage and scene
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }     
            }
        }
    }
}