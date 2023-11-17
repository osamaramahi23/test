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
public class Car extends Vehicle{
    protected static int carcount=0;
    protected static String [] manfuctrurename= {"Toyota","Nissan","Honda","Hondai"};
    public Car(){
        
        carcount++;
        
    }
    @Override
     public String toString (){
         
         return "2019"+super.toString();
         
     }      
    
    
}
