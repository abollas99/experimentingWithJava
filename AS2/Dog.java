package AS2;

/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Anthony Bollas, CPS 2232, 01
* Homework 1
* Program Description: OOP
*************************************************************************/

public class Dog{

    public String name;
    public String breed;//Husky, yorkie, poodle
    public int age;
    public double weight;
    public String color;//black, white, golden, brown
    public static int numberOfDogs;
    
    Dog(){
        numberOfDogs++;

    }
    Dog(String name, String breed, String color){
        this.name = name;
        this.breed= breed;
        this.color = color;
        numberOfDogs++;
    }

    Dog(String name,String breed, int age, double weight, String color){ 
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
        numberOfDogs++;
    }
    //Dog Activities
    public String bark(){
        String responce = this.name + " is barking";
        return responce;
    }
    public String sleep(){
        String responce = this.name + " has fallen asleep";
        return responce;
    }
    public String eat(){
        String responce = this.name + " is hungry";
        return responce;
    }
    public String goForWalk(){
        String responce = this.name + " brought you their leash and would like to go for a walk.";
        return responce;
    }
    //Getters
    public int getNumberOfDogs(){
        return numberOfDogs;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
}

