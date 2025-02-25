import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book a = new Book();
        a.display();
    }
}

class Book
{
    String title;
    float price;
    Book()
    {
        title="Java Programming";
        price=100;
    }
    void display()
    {
        System.out.println("Book Title : "+title);
        System.out.println("Book Price : "+price);
    }
}

