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
public interface Bike {
    
    void changeCadence(int newValue);
    
    void changeGear(int newValue);
    
    void speedUp(int increment);
    
    void applyBrakes(int decrement);
    
}
