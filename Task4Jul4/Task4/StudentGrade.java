package Task4Jul4.Task4;

import java.util.*;

public class StudentGrade {
     HashMap<String,Integer> StdGrade = new HashMap<>();
    public static void main(String[] args){

        StudentGrade studentGrade = new StudentGrade();
        studentGrade.add(new Student("Kumaran",2));

        studentGrade.add(new Student("Tamil",1));
        studentGrade.add(new Student("Akash",3));
        studentGrade.add(new Student("Harish",5));
        studentGrade.add(new Student("Sathya",7));

        System.out.println();
        System.out.println("Before removing the value");
        studentGrade.Display();

        studentGrade.romove("Harish");

        System.out.println();
        System.out.println("Before removing the value");
        studentGrade.Display();

        }

        public void add(Student student){
            StdGrade.put(student.name,student.grade);
    }

        public void romove(String name){
            StdGrade.remove(name);
        }

        public void Display(){
            List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(StdGrade.entrySet());

            System.out.println(list);

            list.sort(Map.Entry.comparingByValue());


            for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        }
}

