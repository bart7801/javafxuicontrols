package pl.sda.academy.javalon1.javafxuicontrols;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CountDown extends Application {
    @Override
    public void start(Stage stage) {
        //creating labels
        Text text1 = new Text("1st letter");
        Text text2 = new Text("2nd letter");
        Text text3 = new Text("3th letter");
        Text text4 = new Text("4th letter");
        Text text5 = new Text("5th letter");
        Text text6 = new Text("6th letter");
        Text text7 = new Text("7th letter");
        Text text8 = new Text("8th letter");
        Text text9 = new Text("9th letter");
        Text text10 = new Text("I found the following words:");
        Text text11 = new Text("Choose 9 letters");

        //Creating Text Filed for email
        TextField textField1 = new TextField();

        //Choice box for location
        ChoiceBox locationchoiceBox1 = new ChoiceBox();
        locationchoiceBox1.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox2 = new ChoiceBox();
        locationchoiceBox2.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox3 = new ChoiceBox();
        locationchoiceBox3.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox4 = new ChoiceBox();
        locationchoiceBox4.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox5 = new ChoiceBox();
        locationchoiceBox5.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox6 = new ChoiceBox();
        locationchoiceBox6.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox7 = new ChoiceBox();
        locationchoiceBox7.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox8 = new ChoiceBox();
        locationchoiceBox8.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        ChoiceBox locationchoiceBox9 = new ChoiceBox();
        locationchoiceBox9.getItems().addAll("A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

        //Creating Buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");


        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(800, 600);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(text11, 1, 0);
        gridPane.add(text1, 0, 2);
        gridPane.add(locationchoiceBox1, 1, 2);
        gridPane.add(text2, 0, 3);
        gridPane.add(locationchoiceBox2, 1, 3);
        gridPane.add(text3, 0, 4);
        gridPane.add(locationchoiceBox3, 1, 4);
        gridPane.add(text4, 0, 5);
        gridPane.add(locationchoiceBox4, 1, 5);
        gridPane.add(text5, 0, 6);
        gridPane.add(locationchoiceBox5, 1, 6);
        gridPane.add(text6, 0, 7);
        gridPane.add(locationchoiceBox6, 1, 7);
        gridPane.add(text7, 0, 8);
        gridPane.add(locationchoiceBox7, 1, 8);
        gridPane.add(text8, 0, 9);
        gridPane.add(locationchoiceBox8, 1, 9);
        gridPane.add(text9, 0, 10);
        gridPane.add(locationchoiceBox9, 1, 10);

        gridPane.add(button1, 0, 11);
        gridPane.add(button2, 1, 11);

        gridPane.add(text10, 0, 12);
        gridPane.add(textField1, 1, 12);

        //Styling nodes
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        text5.setStyle("-fx-font: normal bold 20px 'serif' ");
        text6.setStyle("-fx-font: normal bold 20px 'serif' ");
        text7.setStyle("-fx-font: normal bold 20px 'serif' ");
        text8.setStyle("-fx-font: normal bold 20px 'serif' ");
        text9.setStyle("-fx-font: normal bold 20px 'serif' ");
        text10.setStyle("-fx-font: normal bold 20px 'serif' ");
        text11.setStyle("-fx-font: normal bold 20px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("COUNTDOWN  made by BART'S ©®");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}