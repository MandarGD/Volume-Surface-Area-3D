/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dshape;

/**
 *
 * @author mandar
 */
public class RectangularPrism extends Shapes implements ShapeInterface{
    
    /*public RectangularPrism(){ //default constructor
        Side1 = 0;
        Side2 = 0;
        Side3 = 0;
    }
    */
    
    public RectangularPrism(){ //Main constructor
        System.out.println("Enter the Length of the Prism");
        
        while (true){//test Side1 for something that is not a number
            
            try{
                Side1 = input.nextDouble();
                break;
            }
            catch(Exception e){
                input.next();
                System.out.println("Enter a number please");
            }
        }
    
        while (Check(Side1) != true){ //check if Side1 is negative
        
            System.out.println("Please enter a POSITIVE number");
            Side1 = input.nextDouble();
        
        }
        
        System.out.println("Enter the Width of the Prism");
        while (true){ //test Side2 for something that is not a number
            
            try{
                Side2 = input.nextDouble();
                break;
            }
            catch(Exception e){
                input.next();
                System.out.println("Enter a number please");
            }
        }
        
        
        while (Check(Side2) != true){ //check if Side2 is negative
        
            System.out.println("Please enter a POSITIVE number");
            Side2 = input.nextDouble();
        
        }
        
        System.out.println("Enter the Height of the Prism");
        
        while (true){ //test Side3 for something that is not a number
            
            try{
                Side3 = input.nextDouble();
                break;
            }
            catch(Exception e){
                input.next();
                System.out.println("Enter a number please");
            }
        }
        
        
        while (Check(Side3) != true){ //check if Side3 is negative
        
            System.out.println("Please enter a POSITIVE number");
            Side3 = input.nextDouble();
        
        }
        
    }
    
    //to make further calculations easier
    private double GetArea(){
        return Side1 * Side2;
    }
    
    //overriden interface methods
    
    @Override
    public double GetVolume(){ //Volume
        return (GetArea()) * Side3;
    }
    
    @Override
    public double GetSurfaceArea(){ //Surface Area
        return 2*((GetArea()) + (Side1*Side3) + (Side2 * Side3));
    }
    
    @Override
    public void VandSA(){ //Helper Method
        System.out.println("The Volume is " + formatter.format(GetVolume()) + " cm^3");
        System.out.println("The Surface Area is " + formatter.format(GetSurfaceArea()) + " cm^2");
    }
}
