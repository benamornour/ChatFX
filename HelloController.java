package com.example.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

        private Stage stage;
        private Scene scene;
        @FXML
        private Parent root;

        public void switchToSignUp(ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("Sign-up.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Sign-up!");
            stage.show();
        }

        public void switchToSignIn(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("Sign-in.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Sign-in!");
            stage.show();
        }

        public void switchToChat(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ChatFile.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Chat");
        stage.show();
    }

        public void ForgotPassword(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ForgotPassword.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("ForgotPassword");
        stage.show();
    }

    public void exit(ActionEvent event) throws IOException {
        Platform.exit();
    }

}