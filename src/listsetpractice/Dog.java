package listsetpractice;

import java.util.Objects;

public class Dog implements LivingThing {
    private String name;
    private int age;
    private String rabiesId;

    public Dog(String name, int age, String rabiesId) {
        this.name = name;
        this.age = age;
        this.rabiesId = rabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.rabiesId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rabiesId, other.rabiesId)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return rabiesId;
    }

    public void setId(String id) {
        this.rabiesId = id;
    }
    
    
    
    
}
