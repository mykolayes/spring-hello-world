package kma.practice3;

import java.util.ArrayList;

public class HelloWorld {
    private String name;
    private String surname;
    private ArrayList<String> favouriteAnimals;
    public HelloWorld(){
        this.surname = "DEFAULT_CONSTRUCTOR_SURNAME";
    }
    public HelloWorld(final String surname){
        this.surname = surname;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public void setFavouriteAnimals(final ArrayList favouriteAnimals){
        this.favouriteAnimals = favouriteAnimals;
    }
    public void printHello() {
        System.out.println("Spring Framework: Hello, " + name + " " + surname + "!");
        System.out.println(name + "'s favourite animals are:" );
        for (int i = 0; i < favouriteAnimals.size(); i++){
            System.out.println(favouriteAnimals.get(i));
        }
    }
}