package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Hash {
    public HashSet<String> h=new HashSet<String>();
    public Set<Integer> i=new HashSet<Integer>();
    public Set n=new HashSet();

    Random rand=new Random();


    public void setHashSet(){

        h.add("Parth");
        h.add("Narth");
        h.add("Karth");
        h.add("Larth");
        h.add("Darth");

        i.add(rand.nextInt());
        i.add(rand.nextInt());
        i.add(rand.nextInt());
        i.add(5);

       for(Integer m:i){
           h.add(m.toString());
       }


    }
    public void printHashSet(){
        System.out.println(h);
        System.out.println(i);



    }


}
