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
public class Tetrahedron extends Shapes implements ShapeInterface{
    
    
    
    public Tetrahedron(){
        Side1 = 0;
        Side2 = 0;
        
    }
    
    public Tetrahedron(double l){
        Side1 = l;
        
    }
    
    @Override
    public double GetVolume(){
        return (Math.pow(Side1, 3))/(6*(Math.sqrt(2)));
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetSurfaceArea(){
        return (Math.sqrt(3))*(Math.pow(Side1, 2));
    }
    
    @Override
    public void VandSA(){
        System.out.println(GetVolume() + " cm^3");
        System.out.println(GetSurfaceArea() + " cm^2");
    }
}
