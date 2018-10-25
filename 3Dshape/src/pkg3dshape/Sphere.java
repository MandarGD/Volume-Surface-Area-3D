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

//subclass of shapes for a sphere
public class Sphere extends Shapes implements ShapeInterface{
    
    public Sphere(){ //default contructor
        Side1 = 0;
    }
    
    public Sphere(double radius){ //main Constructor
       Side1 = radius;
    }
    
    //overriden interface methods
    
    @Override
    public double GetVolume(){ //Volume
        return (4/3)*(Math.PI)*(Math.pow(Side1, 3));
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetSurfaceArea(){ //Surface Area
        return 4*(Math.PI)*(Math.pow(Side1, 2));
    }
    
    @Override
    public void VandSA(){ //Helper method
        System.out.println("The Volume is " + formatter.format(GetVolume()) + " cm^3");
        System.out.println("The Surface Area is " + formatter.format(GetSurfaceArea()) + " cm^2");
    }
    
}
