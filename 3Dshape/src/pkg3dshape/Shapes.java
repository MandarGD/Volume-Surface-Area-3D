/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dshape;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author mandar
 */
public class Shapes{

    /**
     * @param args the command line arguments
     */
    
    DecimalFormat formatter = new DecimalFormat("#.##"); //format all calculations to hundreths
    Scanner input = new Scanner(System.in);
    
    double Side1; //class vairables to be inherited
    double Side2;
    double Side3;
    
    
    
    public static void main(String[] args) {
        
        Scanner Choice = new Scanner(System.in);
        
        //determine what shape
        System.out.println("Which shape do you want to get Volume and Surface Area (enter the number)");
        System.out.println("[1] Cube");
        System.out.println("[2] Rectangular Prism");
        System.out.println("[3] Cylinder");
        System.out.println("[4] Sphere");
        System.out.println("[5] Tetrahedron");
        
        String choice = Choice.next();
        
        //switch to instantiate object based on choice
        switch(choice){
            case "1" :
                //Cube
                Cube CUBE = new Cube();
                CUBE.VandSA(); //invoke helper method
                break;
            case "2":
                //Rectangular Prism
                RectangularPrism RP = new RectangularPrism();
                RP.VandSA();
                break;
            case "3":
                //Cylinder
                Cylinder CYLINDER = new Cylinder();
                CYLINDER.VandSA();
                break;
            case "4":
                //Sphere
                Sphere SPHERE = new Sphere();
                SPHERE.VandSA();
                break;
            case "5":
                //Tetrahedron
                Tetrahedron TETRAHEDRON = new Tetrahedron();
                TETRAHEDRON.VandSA();
                break;
            default:
                System.out.println("WHY");
            
        }
        
    }
    
}
