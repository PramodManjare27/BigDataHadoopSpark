package org.simplilearn.analytics;
/*
    Properties are of two types
        1.  instance variables
        2. Static Variables
    Behaviours are of two types
        1. Normal Methods
        2. Instance Methods
        3. Abstract Methods

 Constructors : COnstructors are special member functions which are used to initialize instance variables

 Rules for Constructors
 1. The Class Name and the constructor should be same
 2. Constructor don';t have return type
 */
class UserCredentials{
    // Properties / Variables
    private String userName;
    String password;

    UserCredentials(String userName,String password){
        this.userName=userName;
        this.password=password ;
    }

    // Behaviours / Methods
    public boolean isCrendetialsValid(){
        return !this.userName.equals(this.password);
    }
    public void printCredentials(){
        System.out.println("UserName "+userName+" Password: "+password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class ClassAndObjects_Demo01 {
    public static void main(String[] args) {
        // ClassName objReference = new ClassName()
        UserCredentials userCredentials1 = new UserCredentials("admin","Simplilearn123");
        userCredentials1.printCredentials();
        System.out.println(userCredentials1.isCrendetialsValid());
        userCredentials1.setUserName("adminadmin");
        System.out.println(userCredentials1.getUserName());

        UserCredentials userCredentials2 = new UserCredentials("ahamika","ahamika");
        System.out.println(userCredentials2.isCrendetialsValid());
    }
}
