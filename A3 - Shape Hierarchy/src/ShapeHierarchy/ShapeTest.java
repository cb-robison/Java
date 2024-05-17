package ShapeHierarchy;

/**
 * This program will test the shape class with 2D and 3D shapes.
 */

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class ShapeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Square  sq1 = new Square(5);
        Triangle tr1 = new Triangle(15,2);
        Sphere sp1 = new Sphere(4);
        Cube cb1 = new Cube(2);
        Tetrahedron t1 = new Tetrahedron(6);
        
        Shape[] list = {c1, sq1, tr1, sp1, cb1, t1};
        
        for (Shape element : list) {
            if (element instanceof TwoDimensionalShape)
                PrintInfo((TwoDimensionalShape)(element));
            else
                PrintInfo((ThreeDimensionalShape)(element));
            System.out.println();
        }
        
    }
    
    // utility function
    private static void PrintInfo( TwoDimensionalShape shape){
        System.out.printf("The area of this %s is %d units.%n",
                shape.getName(),shape.getArea());
    }
    
    private static void PrintInfo(ThreeDimensionalShape shape){
        System.out.printf("The surface area of this %s is %d units.%n",
                shape.getName(),shape.getArea());
        System.out.printf("The volume of this %s is %d units.%n",
                shape.getName(),shape.getVolume());
    }
    
}
