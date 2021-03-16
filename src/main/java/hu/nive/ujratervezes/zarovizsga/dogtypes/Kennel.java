package hu.nive.ujratervezes.zarovizsga.dogtypes;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs(){
        return dogs;
    }

    public void addDog (Dog dog){
        dogs.add(dog);
    }

   public void feedAll (){
        for (Dog dog:dogs){
            dog.feed();
        }
    }
    public Dog findByName(String name){
        for (Dog dog:dogs){
            if (dog.getName().equals(name)){
                return dog;
            }
            else throw new IllegalArgumentException("Dog not found");
        }
    return null;
    }

   public void playWith (String name, int hours){
        for (Dog dog:dogs){
            if (dog.getName().equals(name)){
                dog.play(hours);
            }
        }
    }

   public List<String> getHappyDogNames(int minHappiness){
        List<String> happierDogs= new ArrayList<>();
        for (Dog dog:dogs){
            if (dog.happiness>minHappiness){
                happierDogs.add(dog.getName());
            }
        }
        return happierDogs;
    }

}
