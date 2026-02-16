package funint;

import javax.swing.plaf.synth.SynthConstants;

@FunctionalInterface  //Annotation- which gives extra information to the compiler.
interface Add{
    int calculate(int n1, int n2);  //can have only one abstract method.
}

public class MainFunctionalInterface {
     
     public static void main(String[] args){
        Add a = new Add() {

            @Override
            public int calculate(int n1, int n2){
                return n1 + n2;
            }
        };
        System.out.println("Sum: " + a.calculate(24, 39));

        Add a1 = (int n1, int n2) -> (n1 + n2); //Lamda Expression.
        System.out.println("Sum: " + a.calculate(23, 86));
     }
}


