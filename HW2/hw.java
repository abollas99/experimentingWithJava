package HW2;

import java.util.ArrayList;

/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Anthony Bollas, CPS 2232, 01
* Homework 1
* Program Description: OOP
*************************************************************************/


public class hw implements Comparable{
    public static <E> void main(String[] args){
        ArrayList array = new ArrayList<E>();
        Dog Dog1 = new Dog("Toby", "Husky", 5, 70.5, "White");
        Dog Dog2 = new Dog("Max", "Yorkie", 14, 20.9, "Black");
        Dog Dog3 = new Dog("Ellie", "Poodle", "Golden");
        Dog Dog4 = new Dog();
        Dog Dog5 = new Dog("Buddy", "Yorkie", "Golden");
        array.add(Dog1);
        array.add(Dog2);
        array.add(Dog3);
        array.add(Dog4);
        array.add(Dog5);
 //       min(array);


        String[] stringArr = new String[5];
        stringArr[0] = "apples";
        stringArr[1] = "bannana";
        stringArr[2] = "Mango";
        stringArr[3] = "pineapple";
        stringArr[4] = "grapes";
        System.out.println(min(stringArr));
        int[] intarr = new int[5];
        intarr[0] = 5;
        intarr[1] = 1;
        intarr[2] = -2;
        intarr[3] = 10;
        intarr[4] = -7;
        //System.out.println(min(intarr));
        Dog[] dogArr = new Dog[5];
        dogArr[0] = Dog1;
        dogArr[1] = Dog2;
        dogArr[2] = Dog3;
        dogArr[3] = Dog4;
        dogArr[4] = Dog5;
        //System.out.println(min(dogArr));



    }
    public static <E extends Comparable<E>> E min(E [] list) {
        E min = list[0];
        for(E index: list){
            if(index.compareTo(min) < 0){
                index = min;
            }
        }
        return min; 
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}