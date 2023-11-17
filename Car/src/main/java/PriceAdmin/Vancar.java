/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriceAdmin;

/**
 *
 * @author osama
 */
public class Vancar extends Car{
    @Override
    public double calcualtePrice(){
        double tax;
        int pass=35000;
        int point;
        if (e.getnumeng()<=1500){
           tax=pass*0.14;
        point=1000;}
        else if(e.getnumeng()==2000){
            tax=pass*0.16;
        point=1500;}
        else{
        tax=pass*0.18;
        point=2000;
        }
            return pass+tax+point;
            
    }
    @Override
     public void DescribeCar(){
         
         System.out.println(calcualtePrice());
         
     }
     
     public boolean equals(Vancar r){
         
         
         if (r instanceof Vancar)
             Vancar =(Vancar)r;
        return true ;
         
         
         
     }
     
     
     
     
}