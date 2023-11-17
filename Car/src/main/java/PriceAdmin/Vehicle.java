/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriceAdmin;

import Q1_b.Seat;
import javax.print.DocFlavor;

/**
 *
 * @author osama
 */
public abstract class Vehicle implements PriceAdmin , VehcileAdmin{

    protected Wheel [] warr= new Wheel[4];
    protected Seat [] sarr=new Seat[5];
    protected Engine e;
    
    public Vehicle(){
        
        for (int i = 0; i < warr.length; i++) {
            warr[i]=new Wheel();
        }
        for (int i = 0; i < sarr.length; i++) {
            sarr[i]=new Seat();
            
        }
        
    }
    
    
    @Override
    public String toString (){
        
        return this.getClass().getSimpleName();
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public double calcualtePrice() {
        return 0;
    }

    @Override
    public void DescribeCar() {
       
    }
    
    
}
