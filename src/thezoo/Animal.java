/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thezoo;

/**
 *
 * @author Stephen
 */
public abstract class Animal
{
    private String      name;
    private String   species;
    private int          age;
    private int    habitatNo;
    private boolean  vaccine;

    public String getName()
    {
        return name;
    }

    public String getSpecies()
    {
        return species;
    }

    public int getAge()
    {
        return age;
    }

    public int getHabitatNo()
    {
        return habitatNo;
    }

    public boolean isVaccine()
    {
        return vaccine;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setHabitatNo(int habitatNo)
    {
        this.habitatNo = habitatNo;
    }

    public void setVaccine(boolean vaccine)
    {
        this.vaccine = vaccine;
    }

    @Override
    public String toString()
    {
        return "Animal{" + "name=" + name + ", species=" + species + ", age=" + age + ", habitatNo=" + habitatNo + ", vaccine=" + vaccine + '}';
    }
    
    
    
    
}
