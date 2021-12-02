package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    float firstoperand = 0f;
    int operation=0 ;
    @FXML
    private Button add;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private TextField display;

    @FXML
    private Button mul;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button sub;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

        if (event.getSource()==one){
            display.setText(display.getText()+"1");
        }

        else if (event.getSource()==two){
            display.setText(display.getText()+"2");
        }

        else if (event.getSource()==three){
            display.setText(display.getText()+"3");
        }

        else if (event.getSource()==four){
            display.setText(display.getText()+"4");
        }

        else if (event.getSource()==five){
            display.setText(display.getText()+"5");
        }

        else if (event.getSource()==six){
            display.setText(display.getText()+"6");
        }

        else if (event.getSource()==seven){
            display.setText(display.getText()+"7");
        }

        else if (event.getSource()==eight){
            display.setText(display.getText()+"8");
        }

        else if (event.getSource()==nine){
            display.setText(display.getText()+"9");
        }

        else if (event.getSource()==zero){
            display.setText(display.getText()+"0");
        }

        else if (event.getSource()==add){
            firstoperand = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        }

        else if (event.getSource()==sub){
            firstoperand = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        }

        else if (event.getSource()==mul){
            firstoperand = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        }

        else if (event.getSource()==div){
            firstoperand = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        }

        else if (event.getSource()==equal){
             float secondoperand = Float.parseFloat(display.getText());
            switch (operation){
                case 1 :
                    float ans = firstoperand + secondoperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2 :
                     ans = firstoperand - secondoperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3 :
                     ans = firstoperand * secondoperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4 :
                    ans =0f;
                     try{
                         ans = firstoperand / secondoperand;
                     }catch (Exception e){
                         display.setText("!!!!ERROR!!!!");
                     }
                    display.setText(String.valueOf(ans));
                    break;
            }
        }
        if (event.getSource()==clear){
            display.setText(" ");
        }
    }
}