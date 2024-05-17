package ShapeHiearchyPt2;

import ShapeHiearchyPt2.TwoDimensionalShape;

/**
 * This class is a subclass of the abstract class TwoDimensionalShape. It will set the radius 
 * of a circle and provide a definition for the area function.
 */

/**
 * Author: Connor Robison
 * Date: 3-24-24
 */

public class Circle extends TwoDimensionalShape {
//create the constructor

    public Circle(int x, int y, int radius) {
        super(x, y, radius, radius);
    }
    
    public Circle(int radius){
        super(1,1,radius,radius);
    }

//Create a method to get the area
    @Override
    public int getArea() {
        int area = (int) (Math.PI * getDim1() * getDim1());
        return area;
    }

//Create a method to return name of shape
    @Override
    public String getName() {
        return "Circle";
    }
}
