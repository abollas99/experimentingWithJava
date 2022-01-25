package dataStructures.AssignmentOne;

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
        Dog Dog1 = new Dog("Toby", "Husky", 5, 70, "White");
        Dog Dog2 = new Dog("Max", "Yorkie", 14, 20, "Black");
        Dog Dog3 = new Dog("Ellie", "Poodle", "Golden");
        Dog Dog4 = new Dog();
        
        Dog[] arr = new Dog[Dog4.getNumberOfDogs()];
        arr[0] = Dog1;
        arr[1] = Dog2;
        arr[2] = Dog3;
        arr[3] = Dog4;

        System.out.println(Dog1.dogDescription());
        System.out.println(Dog2.dogDescription());
        System.out.println(Dog3.dogDescription());
        System.out.println(Dog4.dogDescription());


        System.out.println(Dog1.eat());
        System.out.println(Dog2.sleep());
        System.out.println(Dog3.bark());
        System.out.println(Dog4.goForWalk() );

        for(int i = 0 : arr){

        }
    }
}