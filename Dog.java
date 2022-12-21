package pract1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;
    private String owner;

    public Dog(String inp_name, int inp_age, String inp_owner){
        name = inp_name;
        age = inp_age;
        owner = inp_owner;
    }
    public Dog(String inp_name, String inp_owner){
        name = inp_name;
        age = 0;
        owner = inp_owner;
    }
    public Dog(String inp_name){
        name = inp_name;
        age = -1; //неизвестно
        owner = "homeless pup";
    }
    public Dog(){
        name = "Tramp pup";
        age = -1;
        owner = "homeless pup";
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public String toString(){
        return "Information about pup: name - "+this.name+", age - "+
                this.age+", owner - "+this.owner;
    }
    public String dogAgeIntoHumanAge() {
        return name + "'s age in human years is " + age * 7 + " years";
    }
    public String isPupHasHome()
    {
        if(owner!="homeless pup")
        {
            return "this pup("+name+") is homely and happy";
        }
        else {
            return "this pup("+name+") is homeless :'(";
        }
    }
}
