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

//subclass of shapes for a Cylinder

public class Cylinder extends Shapes implements ShapeInterface{
    
    public Cylinder(){ //default contructor
        Side1 = 0;
        Side2 = 0;
    }
    
    
    public Cylinder(double radius, double height){ //Main Constructor
        Side1 = radius;
        Side2 = height;
        
    }
    
    /**
     *
     * @return
     */
    
    //overriden interface methods
    
    @Override
    public double GetVolume(){ //Volume
        return (Math.PI)*(Math.pow(Side1, 2))*(Side2);
    }
    
    @Override
    public double GetSurfaceArea(){ //Surface Area
        return (2*(Math.PI)*(Side1)*(Side2)) + (2*(Math.PI)*(Math.pow(Side1, 2)));
    }
    
   
    @Override
    public void VandSA(){ //Helper Method
        System.out.println("The Volume is " + formatter.format(GetVolume()) + " cm^3");
        System.out.println("The Surface Area is " + formatter.format(GetSurfaceArea()) + " cm^2");
    }
}
