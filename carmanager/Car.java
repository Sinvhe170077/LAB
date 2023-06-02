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
public class Car {
private String Colour;
private int EnginePower;
private boolean convertible;
private boolean ParkingBrake;
  

   public Car() {
       
   }
    public Car(String Colour, int EnginePower, boolean convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.convertible = convertible;
        this.ParkingBrake = ParkingBrake;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    public void pressAccerlatorButton() {
        System.out.println("You have pressed the Accerlation button");
    }
    public void output() {
        System.out.println(this.Colour);
        System.out.println(this.EnginePower);
        System.out.println(this.ParkingBrake);
        System.out.println(this.convertible);
    }

}
