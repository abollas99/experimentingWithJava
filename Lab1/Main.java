package dataStructures.Lab1;

public class Main extends Dog{

/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Anthony Bollas, CPS 2232, 01
* Homework 1
* Program Description: OOP
*************************************************************************/

    
    public static void main(String[] args){
        //Order for Constructor (Name, Breed, Age, Weight, Color)
        //Creates 4 dog objects
        Dog Dog1 = new Dog("Toby", "Husky", 5, 70.5, "White");
        Dog Dog2 = new Dog("Max", "Yorkie", 14, 20.9, "Black");
        Dog Dog3 = new Dog("Ellie", "Poodle", "Golden");
        Dog Dog4 = new Dog();
        
        //Creates Object array and places each of the Dog Objects inside the array
        Dog[] arr = new Dog[Dog4.getNumberOfDogs()];
        arr[0] = Dog1;
        arr[1] = Dog2;
        arr[2] = Dog3;
        arr[3] = Dog4;

        //Calls for the Dogs to perform activities
        System.out.println(Dog1.eat());
        System.out.println(Dog2.sleep());
        System.out.println(Dog3.bark());
        System.out.println(Dog4.goForWalk());


        //Uses for-each loop to create a table like layout
        System.out.println("Name\tBreed\tAge\tWeight\tColor");
        for(Dog var : arr){
            System.out.println(var.getName()+"\t"+var.getBreed()+"\t"+var.getAge()+"\t"+var.getWeight()+"\t"+var.getColor());
        }
    }
}