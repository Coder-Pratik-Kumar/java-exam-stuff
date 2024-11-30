package HashMap;

import java.util.*;
class basicOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> student= new HashMap<String,Integer>();

        student.put("Pratik" , 90);
        student.put("Yash",75);
        student.put("Sumit",80);
        student.put("Dada",85);
        student.put("Brajdeep",60);

        System.out.println("Initial records are:-  ");
        for(Map.Entry<String,Integer> entry:student.entrySet()){
            System.out.println("Student:- "+entry.getKey()+" , marks:-"+entry.getValue());
        }

        System.out.println("Enter the name:- ");
        String name=sc.nextLine();
        if(student.containsKey(name)){
            System.out.println(name+", has the marks:- "+student.get(name));
        }
        else{
            System.out.println("student not found");
        }

        System.out.println("enter the student name:- ");
        String studentName=sc.nextLine();

        if(student.containsKey(studentName)){
            System.out.println("Enter the updated marks:- ");
            int updateMark=sc.nextInt();

            student.put(studentName,updateMark);
            System.out.println("Updated Marks are:- "+student.get(studentName));
            for(Map.Entry<String,Integer> entry:student.entrySet()){
                System.out.println("Student:- "+entry.getKey()+" , marks:-"+entry.getValue());
            }
        }else{
            System.out.println("student is not found!");
        }

        System.out.println("Enter the student name which yoy want to remove:- ");
        String removename=sc.nextLine();
        if(student.containsKey(removename)){
            student.remove(removename);
            System.out.println("Student removed successfully!");
            for(Map.Entry<String,Integer> entry:student.entrySet()){
                System.out.println("Student:- "+entry.getKey()+" , marks:-"+entry.getValue());
            }
        }else{
            System.out.println("Student not found!");
        }
    }
}