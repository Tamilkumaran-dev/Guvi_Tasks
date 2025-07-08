package Task4Jul4.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    public int rollNo;
    public String name;
    public int age;
    public String course;

    public Student(){}
    public Student(int rollNo, String name, int age, String course){
        try{
            String regex = "[^a-zA-Z ]";
            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(name);

            if(!(age >= 15 && age <=21)) {
                throw new AgeInvalidException("age is invalid");
            }
            else if(match.find()){
                throw new NameNotValidException("name is invalid");
            }

            else{
                this.name = name;
                this.rollNo = rollNo;
                this.age = age;
                this.course = course;
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        }

    }
}

class AgeInvalidException extends Exception {
    public AgeInvalidException(String m) {
        super(m);
    }
}class  NameNotValidException extends Exception {
    public NameNotValidException(String m) {
        super(m);
    }
}
