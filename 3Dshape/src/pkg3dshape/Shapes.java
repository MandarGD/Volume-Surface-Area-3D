/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dshape;
import java.util.Scanner;
/**
 *
 * @author mandar
 */
public class Shapes{

    /**
     * @param args the command line arguments
     */
    
    double Side1;
    double Side2;
    double Side3;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Which shape do you want to get Volume and Surface Area");
        System.out.println("[1] Cube");
        System.out.println("[2] Rectangular Prism");
        System.out.println("[3] Cylinder");
        System.out.println("[4] Sphere");
        System.out.println("[5] Tetrahedron");
        
        String choice = input.next();
        
        switch(choice){
            case "1" :
                System.out.println("Enter the side length of the cube");
                Cube CUBE = new Cube(input.nextInt());
                CUBE.VandSA();
                break;
            case "2":
                System.out.println("What are the dimensions of the Rectangular Prism");
                RectangularPrism RP = new RectangularPrism(input.nextInt(), input.nextInt(), input.nextInt());
                RP.VandSA();
                break;
            case "3":
                System.out.println("Enter the radius followed by the height of the Cylinder");
                Cylinder CYLINDER = new Cylinder(input.nextInt(),input.nextInt());
                CYLINDER.VandSA();
                break;
            case "4":
                System.out.println("Enter the radius of the Sphere");
                Sphere SPHERE = new Sphere(input.nextInt());
                SPHERE.VandSA();
                break;
            case "5":
                System.out.println("Enter a side length of the Tetrahedral");
                Tetrahedron TETRAHEDRON = new Tetrahedron(input.nextInt());
                TETRAHEDRON.VandSA();
                break;
            default:
                System.out.println("WHY");
            
        }
        
    }
    
}
