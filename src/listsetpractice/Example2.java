package listsetpractice;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 3, "A");
        Dog dog2 = new Dog("Max", 2, "B");
        Dog dog3 = new Dog("Fido", 3, "A");
        
        if (dog1.equals(dog3)) {
            System.out.println("Dog1 and Dog3 are equal.");
        }
        else {
            System.out.println("They are not equal.");
        }
        
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
        System.out.println(dogs.size());
    }
}
