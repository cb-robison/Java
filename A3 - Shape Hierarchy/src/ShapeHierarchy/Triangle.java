package ShapeHierarchy;

import ShapeHierarchy.TwoDimensionalShape;

/**
 * This class is a subclass of the abstract class TwoDimensionalShape. It will set the base and height 
 * of a triangle and provide a definition for the area function.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Triangle extends TwoDimensionalShape {
    
    // constructors
    public Triangle(int x, int y, int base, int height){
        super(x,y,base,height);
    }
    
    public Triangle(int base, int height){
        super(1,1,base,height);
    }
    
    // override methods
    @Override
    public int getArea(){
        int area = (int)(0.5 * getDim1() * getDim2());
        return area;
    }
    
    @Override
    public String getName(){
        return "Triangle";
    }
}
