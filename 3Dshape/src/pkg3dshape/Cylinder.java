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
public class Cylinder extends Shapes implements ShapeInterface{
    
    public Cylinder(){
        Side1 = 0;
        Side2 = 0;
    }
    
    public Cylinder(double radius, double height){
        Side1 = radius;
        Side2 = height;
    }
    
    /**
     *
     * @return
     */
    
    @Override
    public double GetVolume(){
        return (Math.PI)*(Math.pow(Side1, 2))*(Side2);
    }
    
    @Override
    public double GetSurfaceArea(){
        return (2*(Math.PI)*(Side1)*(Side2)) + (2*(Math.PI)*(Math.pow(Side1, 2)));
    }
    
   
    @Override
    public void VandSA(){
        System.out.println(GetVolume() + " cm^3");
        System.out.println(GetSurfaceArea() + " cm^2");
    }
}
