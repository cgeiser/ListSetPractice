package listsetpractice;

import java.util.ArrayList;
import java.util.List;

/*
 * The problem with creating a List of different types of Objects is that you
 * lose access to each type's specific methods because you have to use a
 * "common denominator" object type of List...in this case I tried to use a List
 * of Objects.  I was limited to the Object methods only.  Access to the 
 * Employee and Dog methods was no longer an option.
 * 
 * I can see two ways to overcome that challenge.
 * 1) Use only Lists of the same type of specific object.
 * 2) Use an Interface to "group" them together by common parameters and
 * methods.
 */
public class Lab3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("s1", "Bill Smith", 39);
        Employee e2 = new Employee("f1", "Sally Fields", 25);
        Employee e3 = new Employee("v1", "Darth Vadar", 82);
        Dog d1 = new Dog("Ralph", 10, "r29");
        Dog d2 = new Dog("Rascal", 2, "r39");
        
        // Initial attempt...
        // If you use a List of Objects, there is very little you can access easily.
        List<Object> list = new ArrayList<Object>();
        list.add(e1);
        list.add(e2);
        list.add(d1);
        list.add(e3);
        
        for (Object o : list) {
            
            System.out.println(o.toString() );
        }
        
        
        // Second attempt...
        // If you use an interface to group them together and ensure they have
        // common methods, then you can access those common parameters.
        List<LivingThing> list2 = new ArrayList<LivingThing>();
        list2.add(e1);
        list2.add(e2);
        list2.add(d1);
        list2.add(e3);
        
        for (LivingThing thing : list2) {
            System.out.println("Name: " + thing.getName()
                    + "   ID: " + thing.getId());
        }
    }
    
    
}
