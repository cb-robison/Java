package ShapeHierarchy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author razor
 */
public abstract class Shape {
    //Declare the variables
    private int x;
    private int y;
    
    //The Constructor will pass in the x and y values
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Abstract String getName();
    public abstract String getName(); 

    //Create the get and set mutator and accessor methods for variables x and y
    public void SetX(int x){
        this.x = x;
    }
    
    public int GetX(){
        return x;
    }
    
    public void SetY(int x){
        this.y = y;
    }
    
    public int GetY(){
        return y;
    }

}
