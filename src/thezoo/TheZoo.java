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
public class TheZoo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
//        Mammals m1 = new Mammals();
//        SetUp s1 = new SetUp();
//        System.out.println("Animals: " + s1.filledAnimals);
//        DataStore d1 = new DataStore();
//        System.out.println("All names: " + d1.getNames());
        
        
        // Mark
        DataStore ds = new DataStore();
        ds.getNames().forEach((s) ->
        {
            System.out.println(s);
        });
    }
    
}
