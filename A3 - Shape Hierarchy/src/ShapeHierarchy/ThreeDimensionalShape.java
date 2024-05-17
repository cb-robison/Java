package ShapeHierarchy;

import ShapeHierarchy.Shape;

/**
 * This abstract class is a subclass of Shape. This class can set and get dimensions of a 3D solid. 
 * It will also declare some abstract functions for surface area and volume.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public abstract class ThreeDimensionalShape extends Shape {
    //Declare the variables
    private int dim1;
    private int dim2;
    private int dim3;

    public ThreeDimensionalShape(int x, int y, int d1, int d2, int d3) {
        super(x, y);
        dim1 = d1;
        dim2 = d2;
        dim3 = d3;
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
    
    public void setDim3(int d3){
        dim3 = d3;
    }
    
    public int getDim3(){
        return dim3;
    }
    
    //Create an abstract area method
    public abstract int getArea();
    
    public abstract int getVolume();
    
}
