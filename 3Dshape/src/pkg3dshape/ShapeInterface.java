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

//interface for sub classes to override
public interface ShapeInterface {
    
    double GetVolume();
    double GetSurfaceArea();
    
    void VandSA();
    
}
