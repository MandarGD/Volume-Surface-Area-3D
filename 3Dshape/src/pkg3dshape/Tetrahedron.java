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

//subclass of shapes for a Tetrahedron
public class Tetrahedron extends Shapes implements ShapeInterface{
    
    
    
    /*public Tetrahedron(){ //default constructor
        Side1 = 0;
        
        
    }
    */
    public Tetrahedron(){ //main Constructor
        System.out.println("Enter the length of the Tetrahedron");
        
        while (true){ //test Side1 for something that is not a number
            
            try{
                Side1 = input.nextDouble();
                break;
            }
            catch(Exception e){
                input.next();
                System.out.println("Enter a number please");
            }
        }
        
        while (Check(Side1) != true){ //check if Side2 is negative
        
            System.out.println("Please enter a POSITIVE number");
            Side1 = input.nextDouble();
        
        }  
    }
    
    //overriden interface methods
    
    @Override
    public double GetVolume(){ //Volume 
        return (Math.pow(Side1, 3))/(6*(Math.sqrt(2)));
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetSurfaceArea(){ //Surface Area
        return (Math.sqrt(3))*(Math.pow(Side1, 2));
    }
    
    @Override
    public void VandSA(){ //helper method
       System.out.println("The Volume is " + formatter.format(GetVolume()) + " cm^3");
       System.out.println("The Surface Area is " + formatter.format(GetSurfaceArea()) + " cm^2");
    }
}
