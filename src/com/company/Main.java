package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ввод в лист A");
        ArrayList<String> namesA=new ArrayList<>();
        Scanner inA=new Scanner(System.in);
        namesA.add(inA.nextLine());
        namesA.add(inA.nextLine());
        namesA.add(inA.nextLine());
        namesA.add(inA.nextLine());
        namesA.add(inA.nextLine());
        Iterator<String> iterA = namesA.iterator();
        while(iterA.hasNext()){
            System.out.println(iterA.next());
        }

        System.out.println("\nВвод в лист B");
        ArrayList<String> namesB=new ArrayList<>();
        Scanner inB=new Scanner(System.in);
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        Iterator<String> iterB = namesB.iterator();
        while(iterB.hasNext()){
            System.out.println("["+iterB.next()+"]");
        }


        System.out.println("\nЛист C");
        Collections.reverse(namesB);
        ArrayList<String> namesC=new ArrayList<>();
        iterA=namesA.iterator();
        iterB=namesB.iterator();
        while(iterA.hasNext()&&iterB.hasNext()){
            String a=iterA.next();
            String b=iterB.next();
            namesC.add(a);
            namesC.add(b);
        }

        Iterator<String> iterC = namesC.iterator();
        while(iterC.hasNext()){
            System.out.println(iterC.next());
        }
        namesC.sort(Comparator.comparing(String::length));

        System.out.println("Отсортированный лист");
        iterC=namesC.iterator();
        while(iterC.hasNext()){
            System.out.println(iterC.next());
        }
    }
}