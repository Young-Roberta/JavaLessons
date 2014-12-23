/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 *
 * @author Roberta
 */
public class Water {
    int temp = 60;
    int freezing = -32;
    int boiling = 212;
    String state = "";
    
    void changeTemp (int newTemp){
        temp = newTemp;
    }
    
    void changeState (String newState){
        state = newState;
    }
    
    void heatUp(int increment){
        temp = temp + increment;
    }
    
    void coolDown(int decrement){
        temp = temp - decrement;
    }
    
    
}
