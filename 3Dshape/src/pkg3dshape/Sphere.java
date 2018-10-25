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
public class Sphere extends Shapes implements ShapeInterface{
    
    public Sphere(){
        Side1 = 0;
    }
    
    public Sphere(double radius){
        Side1 =radius;
    }
    
    @Override
    public double GetVolume(){
        return (4/3)*(Math.PI)*(Math.pow(Side1, 3));
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetSurfaceArea(){
        return 4*(Math.PI)*(Math.pow(Side1, 2));
    }
    
    @Override
    public void VandSA(){
        System.out.println(GetVolume() + " cm^3");
        System.out.println(GetSurfaceArea() + " cm^2");
    }
    
}
