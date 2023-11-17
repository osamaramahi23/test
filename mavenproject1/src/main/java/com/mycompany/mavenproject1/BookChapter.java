package com.mycompany.mavenproject1;

public class BookChapter {
    
    private String bookname;
    private int numOfSubjects;
    private int numOfPages;
    private static int count;

    
    BookChapter() {
        bookname = "";
        numOfPages = 0;
        numOfSubjects = 0;
        count = 0;
    }

    
    BookChapter(String bookname, int numOfSubjects) {
        this.bookname = bookname;
        this.numOfSubjects = numOfSubjects;
        this.numOfPages = numOfSubjects / 3;
        count = count + 1;
    }

   
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    
    public static int getCount() {
        return count;
    }

    
    int calculatePrice() {
        
        int price = 50;
       
        if (numOfPages > 20)
           
            price += ((numOfPages - 20) * 30);
        
        return price;
    }

    
    public static void main(String[] args) {
        
        BookChapter bch2 = new BookChapter("The world of Data", 21);
        
        System.out.println(BookChapter.getCount());
    }
}