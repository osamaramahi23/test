
import javax.xml.crypto.Data;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author osama
 */
public class Account {
    
    private int id=0;
    private double balance=0.0;
    private double annuallnterestRate=0.0;
    private Data data;
    
    public Account(){
       
          id = 0;
        balance = 0.0;
        annuallnterestRate=0.0;
        data=new Data() {};
      
    }
    
    Account(int id , double balance , double annuallnterestRate){
        
        
        
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public Data getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraws(double amount){
        
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("You don't have enough money in your account.\nbalance: " + balance);
        }
        
    }
    
    
}
