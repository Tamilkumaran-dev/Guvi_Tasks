package Task1;

public class Createclass {
    public String name;
    public int age = 18;

    public Createclass(){

    }

    public Createclass(String name){
        this.name = name;
        Display();
    }

    public void Display(){
        System.out.println("name : " +name);
        System.out.println(" age : " + age);
    }


}
