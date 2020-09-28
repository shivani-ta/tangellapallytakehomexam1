/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_fan;

/**
 *
 * @author Shivani tangellapally
 */
public class fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int Speed;
    private boolean On;
    private double Radius;
    private String Color;

    public fan() {
        super();
        Speed = SLOW;
        On = true;
        Radius = 0;
    }
     public int getSLOW() {
        return SLOW;
    }
      public int getMEDIUM() {
        return MEDIUM;
    }
     public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return Speed;
    }
     public boolean isOn() {
        return On;
    }
     public double getRadius() {
        return Radius;
    }
     public String getColor() {
        return Color;
    }
     public void setSpeed(int speed) {
        Speed = speed;
    }
     public void setOn(boolean on) {
        On = on;
    }
     public void setRadius(double radius) {
        Radius = radius;
    }
     public void setColor(String color) {
        Color = color;
    }
     @Override
     public String toString() {
        return "Fan [" + "Speed=" + Speed + ", Fan is " + (On ? "On" : "Off") + ", Radius=" + Radius + ", Color=" + Color + "]";
    }
}
