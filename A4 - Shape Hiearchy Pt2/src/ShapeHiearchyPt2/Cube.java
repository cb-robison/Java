package ShapeHiearchyPt2;

import ShapeHiearchyPt2.ThreeDimensionalShape;

/**
 * This class is a subclass of the abstract class ThreeDimensionalShape. It will set the edge length 
 * of a cube and provide definition for the surface area and volume functions.
 */

/**
 * Author: Connor Robison
 * Date: 3-24-24
 */

public class Cube extends ThreeDimensionalShape {
    // constructors
    public Cube(int x, int y, int side){
        super(x,y,side,side,side);
    }
    
    public Cube(int side){
        super(1,1,side,1,1);
    }
    
    // override methods
    @Override
    public int getArea(){
        int surfaceArea = (int)(6 * Math.pow(getDim1(), 2));
        return surfaceArea;
    }
    
    @Override
    public int getVolume(){
        int volume = (int)(Math.pow(getDim1(), 3));
        return volume;
    }
    
    @Override
    public String getName(){
        return "Cube";
    }
    
}
