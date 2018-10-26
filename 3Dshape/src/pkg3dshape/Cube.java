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

public class Cube extends Shapes implements ShapeInterface{
    
    
    
    public Cube(){ //Default constructor
       Side1 = 0;
    }
    
    public Cube(double y){ //Main Constructor
        
        Side1 = y;
        
    }
   
    //overriden interface methods
    
    @Override
    public double GetVolume(){ //Volume
        return Math.pow(Side1, 3);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetSurfaceArea(){ //Surface Area
        return 6*(Math.pow(Side1, 2));
    }
    
    @Override
    public void VandSA(){ //Helper Method
        System.out.println("The Volume is " + formatter.format(GetVolume()) + " cm^3");
        System.out.println("The Surface Area is " + formatter.format(GetSurfaceArea()) + " cm^2");
    }
    
}
