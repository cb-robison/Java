package ShapeHiearchyPt2;

/**
 * This program with test the shape class with multiple shape objects.
 */

/**
 * Author: Connor Robison
 * Date: 3-24-24
 */

public class ShapeTest {

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Square  sq1 = new Square(5);
        Triangle tr1 = new Triangle(15,2);
        Sphere sp1 = new Sphere(4);
        Cube cb1 = new Cube(2);
        Tetrahedron t1 = new Tetrahedron(6);
        
        Shape[] list = {c1, sq1, tr1, sp1, cb1, t1};
        
        for (Shape element : list) {
            PrintInfo(element);
        }
        
    }
    
    // utility function
    private static void PrintInfo(Shape shape){
        if (shape instanceof TwoDimensionalShape temp) {
            System.out.printf("The area of this %s is %d units.%n",
                    temp.getName(), temp.getArea());
        } 
        else {
            ThreeDimensionalShape temp = (ThreeDimensionalShape)shape;
            System.out.printf("The surface area of this %s is %d units.%n",
                    temp.getName(), temp.getArea());
            System.out.printf("The volume of this %s is %d units.%n",
                temp.getName(), temp.getVolume());
        }
        
        System.out.println();
        
    }
    
}
