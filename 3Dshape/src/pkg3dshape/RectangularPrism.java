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
    
    public RectangularPrism(){ //default constructor
        Side1 = 0;
        Side2 = 0;
        Side3 = 0;
    }
    
    
    public RectangularPrism(double l, double w, double h ){ //Main constructor
        Side1 = l;
        Side2 = w;
        Side3 = h;
        
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
