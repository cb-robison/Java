package ShapeHierarchy;

import ShapeHierarchy.ThreeDimensionalShape;

/**
 * This class is a subclass of the abstract class ThreeDimensionalShape. It will set the edge length 
 * of a tetrahedron and provide definition for the surface area and volume functions.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Tetrahedron extends ThreeDimensionalShape {
    // constructors
    public Tetrahedron(int x, int y, int edge){
        super(x,y,edge,edge,edge);
    }
    
    public Tetrahedron(int edge){
        super(1,1,edge,1,1);
    }
    
    // override methods
    @Override
    public int getArea(){
        int surfaceArea = (int)(Math.sqrt(3) * Math.pow(getDim1(), 2));
        return surfaceArea;
    }
    
    @Override
    public int getVolume(){
        int volume = (int)((Math.pow(getDim1(),3)) / (6 * Math.sqrt(2)));
        return volume;
    }
    
    @Override
    public String getName(){
        return "Tetrahedron";
    }
}
