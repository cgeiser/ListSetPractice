package listsetpractice;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        List<String> hobbyItems = new ArrayList<String>();
        hobbyItems.add("Table Saw");
        hobbyItems.add("Cordless Drill");
        hobbyItems.add("Router");
        hobbyItems.add("Pocket Screw Jig");
        
        for (int i = 0; i < hobbyItems.size(); i++) {
            System.out.println((String)hobbyItems.get(i));
        }
        
    }
}
