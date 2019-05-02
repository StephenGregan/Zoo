/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thezoo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Stephen
 */
public class SetUp
{
    Random rGen = new Random();
    
    ArrayList<Animal> filledAnimals = new ArrayList<>();
    
    DataStore dataStore = new DataStore();
    
    public ArrayList<Animal> returnedAnimals(ArrayList<Animal> inmates, int amount)
    {
        
        for(int i = 0; i < amount; i++)
        {
            int choice = rGen.nextInt(5);
            switch(choice)
            {
                case 0:
                    Mammals mammal = new Mammals();
                    dataStore.getMammals();
                    String[] temp = dataStore.getMammals();
                    mammal.setSpecies(temp[rGen.nextInt(temp.length)]);
                    mammal.setName(dataStore.getNames().get(rGen.nextInt(dataStore.getNames().size())));
                    mammal.setAge(rGen.nextInt(20) + 1);
                    mammal.setHabitatNo(rGen.nextInt(i));
                    mammal.setVaccine(rGen.nextBoolean());
                    inmates.add(mammal);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    Reptile reptile = new Reptile();
                    dataStore.getReptiles();
                    temp = dataStore.getReptiles();
                    reptile.setSpecies(temp[rGen.nextInt(temp.length)]);
                    reptile.setName(dataStore.getNames().get(rGen.nextInt(dataStore.getNames().size())));
                    reptile.setAge(rGen.nextInt(20) + 1);
                    reptile.setHabitatNo(rGen.nextInt(i));
                    reptile.setVaccine(rGen.nextBoolean());
                    inmates.add(reptile);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("You messed up, something went wrong!!!");
            }
        }
        return inmates;
    }
}
