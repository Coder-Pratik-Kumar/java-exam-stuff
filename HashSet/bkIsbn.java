package HashSet;
import java.util.HashSet;
import java.util.*;
class Book{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Set<String> set=new HashSet<>();
    String choice;
    do{
        System.out.println("Enter the Isbn:- ");
        String isbn=sc.nextLine();
        if(set.contains(isbn)){
            System.out.println("Book with ISBN "+isbn+" already exists.");
        }else{
            set.add(isbn);
            System.out.println("Book with ISBN "+isbn+" added successfully.");
        }
        System.out.println("you want to add another book? (yes/no)");
        choice=sc.nextLine().trim().toLowerCase();
    }while(choice.equals("yes"));
    System.out.println("Books with ISBNs: "+set);
}

}