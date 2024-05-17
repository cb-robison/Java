package ShapeHierarchy;

import ShapeHierarchy.ThreeDimensionalShape;

/**
 * This class is a subclass of the abstract class ThreeDimensionalShape. It will set the radius 
 * of a sphere and provide definition for the surface area and volume functions.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Sphere extends ThreeDimensionalShape {
    
    // constructors
    public Sphere(int x, int y, int radius){
        super(x,y,radius,radius,radius);
    }
    
    public Sphere(int radius){
        super(1,1,radius,1,1);
    }
    
    // override methods
    @Override
    public int getArea(){
        int surfaceArea = (int)(4 * Math.PI * Math.pow(getDim1(), 2));
        return surfaceArea;
    }
    
    @Override
    public int getVolume(){
        int volume = (int)(((4* Math.PI * Math.pow(getDim1(),3)) / 3));
        return volume;
    }
    
    @Override
    public String getName(){
        return "Sphere";
    }
    
}
