package Main;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String street;
    private String city;
    private int PLZ;

    //Getter Functions
    public String getFirstName() {return firstName;}
    public String getLastName() {return  lastName;}
    public int getAge() {return age;}
    public String getStreet() {return street;}
    public String getCity() {return city;}
    public int getPLZ() {return PLZ;}

    //Setter Methods
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public void setStreet(String street) {this.street = street;}
    public void setCity(String city) {this.city = city;}
    public void setPLZ(int PLZ) {this.PLZ = PLZ;}
}
