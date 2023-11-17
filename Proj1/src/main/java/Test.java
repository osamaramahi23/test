/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class Test {
    
    public static void main(String avgs[] ){
        
        Proj1 r1=new Proj1();
        System.out.println(r1.getHeught());
        System.out.println(r1.getWidth());
       
        r1.setWidth(10);
        Proj1 r2=new Proj1(4,40);
        System.out.println(r2.getHeught());
        System.out.println(r2.getWidth());
        System.out.println(Proj1.getColor("red"));
        
    }
    
}
