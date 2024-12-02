package HashSet;
import java.util.*;
class Team{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Set<String> set= new HashSet<>();
        String choice;
        do{
            System.out.println("Enter the player name:- ");
            String name=sc.nextLine();

            if(set.contains(name)){
                System.out.println("Player already exist....");
            }
            else{
                set.add(name);
                System.out.println("Player Added Successfully");
            }
            System.out.println("Do you want to add another player?(yes/no)");
            choice=sc.nextLine().trim().toLowerCase();
        }while(choice.equals("yes"));

        System.out.println(set);
    }
}