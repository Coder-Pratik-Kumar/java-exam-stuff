import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getname(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class StudentList{
    public static void main(String[] args){
        ArrayList<Student> students= new ArrayList<>();

        students.add(new Student("Pratik",18));
        students.add(new Student("Sumit",23));
        students.add(new Student("Brajdeep",25));

System.out.println(students);
        for(Student student : students){
            if(student.getAge()>18){
                System.out.println(student.getname());
            }
        }
    }
}