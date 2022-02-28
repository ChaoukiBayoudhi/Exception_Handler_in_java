package Application;

import productMgt.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setLabel("xyz");
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter a string :  ");
//        String ch=scanner.nextLine();
//        System.out.println(ch.length());
//        ch=ch.trim();
//        System.out.println(ch.length());

        //Example of use of HashMap :
        Map<String, Double> studentsMarks = new HashMap<>();
        //Map<Key,Value> : Ahmed, 12.75; Bochra, 17.2
        studentsMarks.put("Ahmed",12.75);
        studentsMarks.put("Bochra",17.2);
        studentsMarks.put("Mohamed",19.7);
        System.out.println("size = "+studentsMarks.size());
        System.out.println("Map content"+studentsMarks);
        //print the map using forEach
        studentsMarks.forEach((key,value) -> System.out.println(key+":"+value));
        studentsMarks.remove("Bochra");
        System.out.println("After Delete : ");
        studentsMarks.forEach((key,value) -> System.out.println(key+":"+value));
        studentsMarks.put("Ahmed",18.6);
        System.out.println("After updating :");
        studentsMarks.forEach((key,value) -> System.out.println(key+":"+value));
        studentsMarks.replace("Mohamed",19.7,16.8);
        System.out.println("After updating with replace :");
        studentsMarks.forEach((key,value) -> System.out.println(key+":"+value));
        if(studentsMarks.containsKey("Ahmed"))
            System.out.println("this key exists");
        else
            System.out.println("Not exists");

        System.out.println("Mark of Ahmed = "+studentsMarks.get("Ahmed"));
        //loop using Iterator
        Iterator it = studentsMarks.entrySet().iterator();
        while(it.hasNext()){
            it.next();

        }



    }
}
