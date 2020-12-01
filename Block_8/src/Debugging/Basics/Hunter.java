package Debugging.Basics;

public class Hunter {
    private String firstName;
    private String lastName;
    private int age;

    //Getter Functions
    public String getFirstName() {return firstName;}
    public String getLastName() {return  lastName;}
    public int getAge() {return age;}

    //Setter Methods
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}

    Hunter(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
