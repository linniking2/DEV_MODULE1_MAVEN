package goitdevpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Oleksandr", "Linnik");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json  = gson.toJson(person);
        System.out.println(json);

    }
}
class Person{
    private String name;
    private String lastName;
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }
}
