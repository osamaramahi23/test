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
public class linklist {
    
    node head;
    node tail;
    int count;
    
    public linklist(){
        
        head=null;
        tail=null;
        count=0;
        
    }
    public boolean isEmpty(){
        
        if (head==null)
            return true;
        else
            return false;
        
        
    }
    public void insertToHead (int val){
        if (isEmpty()){
            head =new node();
            head.data=val;
            head.next=null;
            tail = head;
            count++;
            
           // System.out.println(head.data);
            //System.out.println(tail.data);
            //System.out.println(head.next);
            //System.out.println(tail.next);
            //System.out.println(head);
            //System.out.println(tail);//place in memory=adrees
            //System.out.println(head.next.data);//null= no data error
            //System.out.println(head.next.data);//null=no data error
        }
        else {
            node nn=new node();
            nn.data=val;
            nn.next=head; //adrees to head
            head=nn;//new node =head
            count++;
        }
    } 
    
    public void insertToTail(int val){
       if (isEmpty())
        insertToHead(val);
       else {
           node nn=new node();
           nn.data=val;
           nn.next=null;           
           tail.next=nn;
           tail=nn;
           count++;
       }
        
    }
    public void insertToPos(int pos , int val){
        if(pos<1 || pos> count+1)
            return;
        else if (pos ==1)
            insertToHead(val);
        else if (pos== count+1)
            insertToTail(val);
        else {
            node t=head;
            for(int i=1; i<pos-1; i++)
             t=t.next;
            node nn=new node();
            nn.data=val;
            nn.next=t.next;
            t.next=nn;
            count++;
        }
        
        
    }
    
    
    
}
