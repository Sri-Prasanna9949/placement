import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book a = new Book("The Life","Shakespeare",150);
        a.display();
    }
}

class Book
{
    String title;
    String author;
    float price;
    Book(String title,String author,float price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("The Title is : "+title);
        System.out.println("The Author Name is : "+author);
        System.out.println("The price is : "+price);
    }
    
}

