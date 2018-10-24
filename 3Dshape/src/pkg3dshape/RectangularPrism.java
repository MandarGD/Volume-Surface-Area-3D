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
public class RectangularPrism extends Shapes{
    
    /*public RectangularPrism(){
        Side1 = 0;
        Side2 = 0;
        Side3 = 0;
    }
    */
    
    public RectangularPrism(double x, double y, double z){
        Side1 = x;
        Side2 = y;
        Side3 = z;
    }
    
    
    public double GetVolume(){
        return Side1 * Side2 * Side3;
    }
    
    public double GetSurfaceArea(){
        return 2*((Side1*Side2) + (Side1*Side3) + (Side2 * Side3));
    }
    
    public void VandSA(){
        System.out.println(GetVolume());
        System.out.println(GetSurfaceArea());
    }
}
