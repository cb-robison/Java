package ShapeHierarchy;

import ShapeHierarchy.TwoDimensionalShape;

/**
 * This class is a subclass of the abstract class TwoDimensionalShape. It will set the side length 
 * of a square and provide a definition for the area function.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Square extends TwoDimensionalShape {
    
    //Create the constructor
    public Square(int x, int y, int side) {
        super(x, y, side, side);
    }
    
    public Square(int side){
        super(1,1,side,side);   
    }

    //create getArea that returns the area of the square
    @Override
    public int getArea() {
        int area = getDim1() * getDim1();
        return area;
    } 

    //create the method 'getName()' which returns the name of the shape
    @Override
    public String getName() {

        return "Square";
    }
}
