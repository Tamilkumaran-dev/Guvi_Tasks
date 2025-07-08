package Task4Jul4.Task2;

public class Voter {
    public int voterId;
    public String name;
    public int age;

    public Voter(){};

    public Voter(int VoterId, String Name, int Age) {
        try {
            if (Age < 18) {
                throw new InvalidAgeException("The age is invalid");
            }
            this.voterId = VoterId;
            this.name = Name;
            this.age = Age;
            System.out.println("Successfully Voter id is created");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}



