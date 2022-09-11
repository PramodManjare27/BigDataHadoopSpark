package org.simplilearn.analytics;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

// Credentials class with no access specifiers
class Credentials{
  //Instance Variables
    private String userName;
    private String password;

  //Contructor


    public Credentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    //getter setters for instance varaible
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

// custom methods
    public void printCredentials(){
        System.out.println("UserName: " + this.userName + "Password : " +this.password);
    }
//  validate creds
    protected boolean isCredValid()
    {
        return ! this.userName.equals(this.password);
    }

}
//class where we will use credentials class methods and objects
public class ClassAndObjects_Pramod {
    public static void main(String[] args) {
        Credentials user1 = new Credentials("Pramod", "Manjare");
        user1.printCredentials();
        System.out.println(user1.isCredValid());
        user1.getPassword();
        user1.setPassword("Manjare1");
        user1.getUserName();
        user1.setUserName("Pramod1");
        user1.printCredentials();
        System.out.println(user1.isCredValid());
        user1.setPassword("Pramod1");
        System.out.println(user1.isCredValid());
    }
}
