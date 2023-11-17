
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    Scanner s = new Scanner (System.in);
        int count = 0;
        int num = 0;
        
        for (int i = 1 ; i > 0; i++) 
            System.out.println("please enter the number :");
           int a = s.nextInt();
            if (a%2==1)
                count++;
            
            else  
              
            num++;
        
            
            if (a<0)
                System.exit(0);
        
            
        System.out.println("odd ="+count);
        
        System.out.println("even"+num);
    */
    
   /* Scanner s=new Scanner(System.in);
    int c1=0;
    int c2 =0;
    int a=s.nextInt();
    while (a>0){
        if(a%2==0)
            c1++;
        else
            c2++;
        a=s.nextInt();
    }
        System.out.println("even"+c1);
        System.out.println("odd"+c2);
   
   
         Scanner s=new Scanner(System.in);
         System.out.println("please enter the number : ");
         double a = s.nextDouble();
         double sum =0 ;
         double count =0;
         double avg =0;
        while (a!=-22){
            sum+=a;
            count++;
             a = s.nextDouble();
        }
        
         avg=sum / count;
         
         if(avg>90)
             System.out.println("grater ");
         else if (avg<90 && avg>80)
             System.out.println("very good");
         else 
             System.out.println("fair");
         
   
         Scanner s =new Scanner (System.in);
         System.out.println("please enter the num :");
         char c = s.next().charAt(0);
         int count =0;
         while (c!='$'){
             count++;
           c = s.next().charAt(0);   
         }
             if (count >10)
                 System.out.println("good entry");
             else
                 System.out.println("bad entry");
             
             */
   
        /* for (int i = 50; i <= 100; i++) {
            if (i%2==1)
                System.out.println("odd"+i);
            
            
        }
   
             
            int count =0;

        for (int i = 100; i <= 200; i++) { 

            if (i%2==0)
                count++;
            
            
        }
                        System.out.println("even num ="+ count);
 
             
        Scanner s = new Scanner (System .in );
        System.out.println("please enter the grades :");
        int avg =0;
        int sum = 0;
        int count = 0 ;
        
        for (int i = 0; i < 10; i++) {
            
            int g = s.nextInt();
           sum +=g; // sum = sum +g 90 80 70
            count ++; //1 2 3
          
            
            
            
        }
         avg = sum/count;
         if (avg >50)
             System.out.println("pass");
         else 
             System.out.println("fail");
   
            
        Scanner s = new Scanner (System.in);
        System.out.println(" plz enter the degree :");
        
        int count =0;
        int count1 =0 ;
        
                        
        for (int i = 0; i < 20; i++) {
            int a = s.nextInt();
            if (a>=0 )
                count++;
            else if (a<0)
                count1++;
            
            
        }
        
            if(count>=10)
                System.out.println("frezz");
            else
                System.out.println("spring");
            
        
        
        Scanner s = new Scanner (System.in);
        System.out.println("plz enter the values :");
        
        int count=0;
        int count1 =0;
        for (int i = 0; i < 20; i++) {
        char c =s.next().charAt(0);
        if (c=='j')
            count++;
        else if (c=='s')
            count1++;
            
        }
            if (count1>=10)
                count+=3;
            
            System.out.println(count);
            System.out.println(count1);
        
        
    
        
    
        int [] a=new int[10];
        Scanner s = new Scanner (System .in);
        int sum =0 ;
        for (int i = 0; i < a.length; i++) {
           sum +=a[i]; 
            
        }
        System.out.println(sum);
    */
        String [] a = new String [5];
        String z="";
        Scanner s = new Scanner (System .in);
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextLine();
            //osama omar ahmad mohammad zaid
            z+=a[i];
        
            
        }
        System.out.println(z);
    
    
    
    }
            
            
            
            
        

      //  new GUI();
        
   
//new Grid();
//new micro();
//new micro1();

    
    
    
        


    
    
    
    
    
    
    }
    

