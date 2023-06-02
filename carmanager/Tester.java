/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

/**
 *
 * @author Nguyen Van Si
 */
public class Tester {
    public static void main(String[] args) {
        Car  c= new Car();
        c.pressStartButton(); 
        c.pressAccerlatorButton();
        c.output();
        Car c2 = new Car("red", 100, true, true);
        c2.pressStartButton();
        c2.pressAccerlatorButton();
        c2.setColour("Black");
        System.out.println("Colour of c2 : " +c2.getColour());
        c2.output();
        
    }
}
