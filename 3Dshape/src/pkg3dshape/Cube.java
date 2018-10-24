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

public class Cube extends Shapes{
    
    //public Cube(){
      //  Side1 = 0;
    //}
    
    public Cube(double x){
        Side1 = x;
    }
    
    public double GetVolume(){
        return Math.pow(Side1, 3);
    }
    
    public double GetSurfaceArea(){
        return 6*(Math.pow(Side1, 2));
    }
    
    public void VandSA(){
        System.out.println(GetVolume());
        System.out.println(GetSurfaceArea());
    }
    
}
