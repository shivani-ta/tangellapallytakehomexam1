/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_addition;
// When we use the same function name with different parameter then this is called method overloading like in my example 
// the method name is add and only difference is paramter of methods

/**
 *
 * @author Shivani tangellapally
 */
public class addition {

    private String Data;

    public void AddVar(int A, int B) {
        Data = (A + B) + "";
    }

    public void AddVar(int A, int B, int C) {
        Data = (A + B + C) + "";
    }

    public void AddVar(double A, double B) {
        Data = (A + B) + "";
    }

    public void AddVar(double A, double B, double C) {
        Data = (A + B + C) + "";
    }

    public void AddVar(String A, String B) {
        Data = (A + B);
    }

    public void AddVar(String A, String B, String C) {
        Data = (A + B + C);
    }

    @Override
    public String toString() {
        return Data;

    }
}
