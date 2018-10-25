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
    
    
    double Side1; //class vairables to be inherited
    double Side2;
    double Side3;
    
    public static boolean Check(double y){
        if (y<0){
            
            return false;
        } 
        else {
            return true;
        }
    }
    
    public static double DoubleCheck(double x){
        Scanner input = new Scanner(System.in);
        while (true){ //test input for something that is not a number
            
            try{
                x = input.nextDouble();
                break;
            }
            catch(Exception e){
                input.next();
                System.out.println("Enter a number please");
            }
        }
        
        while (Check(x) != true){ //Check if input is negative
            System.out.println("Please enter a POSITIVE number");
            x = input.nextDouble();
        
        }
        return x;
    }
    
    
    public static void main(String[] args) {
        double length;
        double width;
        double height;
        double radius;
        
        double side = 0;
        
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
                System.out.println("Enter the length of the Cube");
                
                length = DoubleCheck(side);
                
                Cube CUBE = new Cube(length);
                CUBE.VandSA(); //invoke helper method
                break;
            
            case "2":
                //Rectangular Prism
                System.out.println("Enter the length of the Prism in cm");
                
                length = DoubleCheck(side);
                
                System.out.println("Enter the width of the Prism in cm");
                
                width = DoubleCheck(side);
                
                System.out.println("Enter the height of your Prism in cm");
                
                height = DoubleCheck(side);
                
                RectangularPrism RP = new RectangularPrism(length, width, height);
                RP.VandSA();
                break;
            
            case "3":
                //Cylinder
                System.out.println("Enter the radius of the Cylinder in cm");
                
                radius = DoubleCheck(side);
                
                System.out.println("Enter the height of the Cylinder in cm");
                
                height = DoubleCheck(side);
                
                Cylinder CYLINDER = new Cylinder(radius, height);
                CYLINDER.VandSA();
                break;
            
            case "4":
                //Sphere
                
                System.out.println("Enter the radius of the sphere in cm");
                
                radius = DoubleCheck(side);
                
                Sphere SPHERE = new Sphere(radius);
                SPHERE.VandSA();
                break;
            
            case "5":
                //Tetrahedron
                
                System.out.println("Enter the side length of the Tetrahedron in cm");
                
                length = DoubleCheck(side);
                
                Tetrahedron TETRAHEDRON = new Tetrahedron(length);
                TETRAHEDRON.VandSA();
                break;
            
            default:
                System.out.println("WHY");
            
        }
        
    }
    
}
