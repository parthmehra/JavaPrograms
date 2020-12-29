package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	GenericClass<String> gc1=new GenericClass<String>("Parth");
	    Integer array[]={3,1,2,3,54,1,};
	    genericFunc(array);
	   String array1[]={"Parth", "Kaushik", "ananth"};
	   genericFunc(array1);


    }
    static <T> void  genericFunc(T[] arr){
        for(T ele:arr){
            System.out.println(ele);

        }

    }

}
class GenericClass<T>{
    T obj;



    public GenericClass(T obj) {
        this.obj = obj;

    }

    public T getObj() {
        return obj;
    }
}
