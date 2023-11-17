/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author osama
 */
public class NewClass2 {
     public static void main(String[] args){
         
    linklist A = new linklist();//new =linklist
    
    A.insertToHead(5);
    A.insertToHead(3);
    A.insertToHead(10);
    for(int i=15;i<=20;i++)// 9 8 7 6 5 4 3 2 1 10 3 5
        A.insertToHead(i);
    A.insertToTail(35);
   A.insertToPos(4,150);
    node temp=A.head;
    for(int i=1; i<=A.count; i++){
        System.out.println(temp.data);
        temp= temp.next;
    }
   
     
         /* System.out.println(A.head.data);
            System.out.println(A.tail.data);
            System.out.println(A.head.next);//adrres head
            System.out.println(A.tail.next);//adrres tail=null
            System.out.println(A.head.next.data);
            System.out.println(A.head.next.next.data);
            System.out.println(A.head.next.next);//adrees tail
            System.out.println(A.tail);
         */
         
         
     }
    
    
    
}
