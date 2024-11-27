import java.util.*;

class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }
    public String geyAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
}
}
class BookInfo{
    public static void main(String[] args){
        ArrayList<Book> book= new ArrayList<>();
        book.add(new Book("Math","Pratik",500));
        book.add(new Book("PCPH","Aditya",300));
        book.add(new Book("English","Amitesh",400));
        book.add(new Book("SE","Sumit",700));
        book.add(new Book("CO","DADA",600));

        for(Book books: book){
            System.out.println("Title is " +books.getTitle());
            System.out.println("Author is "+books.geyAuthor());
            System.out.println("Price is "+books.getPrice());
        }
    }
}