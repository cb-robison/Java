package ShapeHiearchyPt2;

import ShapeHiearchyPt2.Shape;

/**
 * This abstract class is a subclass of Shape. This class can set and get dimensions of a 2D shape. 
 * It will also declare some abstract function for area.
 */

/**
 * Author: Connor Robison
 * Date: 3-24-24
 */

public abstract class TwoDimensionalShape extends Shape {
    //Declare the variables
    private int dim1;
    private int dim2;

    public TwoDimensionalShape(int x, int y, int d1, int d2) {
        super(x, y);
        dim1 = d1;
        dim2 = d2;
    }
    
    //Create the accessor methods for dim1 and dim2
    public void setDim1(int d1){
        dim1 = d1;
    }
    
    public int getDim1(){
        return dim1;
    }
    
    public void setDim2(int d2){
        dim2 = d2;
    }
    
    public int getDim2(){
        return dim2;
    }
    
    //Create an abstract area method
    public abstract int getArea();
    //NOTE: For ThreeDimensionalShape add the dim3 variable and add getVolume method
}
