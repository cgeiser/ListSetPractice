package listsetpractice;

import java.util.ArrayList;
import java.util.List;


public class Example1 {


    public static void main(String[] args) {
        
//        List groceryList = new ArrayList();
//        groceryList.add("Beer");
//        groceryList.add("Milk");
//        groceryList.add("Asiago Bagel");
//        groceryList.add("Oreos");
//        groceryList.add("Pizza");
//        
//        String item = (String)groceryList.get(1);
//        System.out.println(groceryList.size());
//        groceryList.remove(3);
//        System.out.println(groceryList.size());
//        
//        for (int i=0; i < groceryList.size(); i++) {
//            String s = (String)groceryList.get(i);
//            System.out.println(s);
//        }
//        
        
        
        List<String> groceryList = new ArrayList<String>();
        groceryList.add("Beer");
        groceryList.add("Milk");
        groceryList.add("Asiago Bagel");
        groceryList.add("Oreos");
        groceryList.add("Pizza");
        groceryList.add("Beer");

        String item = groceryList.get(1);

        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());

        groceryList.add("Doritos");
        groceryList.add(0, "Mountain Dew");
        System.out.println();
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());

        groceryList.remove("Milk");
        System.out.println();
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());
        
        groceryList.remove(4);
        System.out.println();
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());

        groceryList.set(1, "Eggs");
        System.out.println();
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());

        
        
        groceryList.clear();
        System.out.println();
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("Size is " + groceryList.size());

    }
}
