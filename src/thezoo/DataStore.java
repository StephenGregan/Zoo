/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thezoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class DataStore
{
     private final ArrayList<String> names;
    
    private final String[] mammals = {"GIANT ANTEATER","SOUTHERN THREE-BANDED ARMADILLO","HOFFMANN'S TWO-TOED SLOTH",
                                "ANDEAN BEAR","AMUR LEOPARD","AMUR TIGER","BAT-EARED FOX","BUSH DOG","CHEETAH",
                                "DWARF MONGOOSE","FENNEC FOX","GRIZZLY BEAR","JAGUAR","KINKAJOU","LION",
                                "MALAYAN SUN BEAR","NORTH AMERICAN RIVER OTTER","PAINTED DOG","POLAR BEAR",
                                "PUMA","RED PANDA","SLENDER-TAILED MEERKAT","SNOW LEOPARD","SPOTTED HYENA",
                                "TASMANIAN DEVIL","ADDAX","BABIRUSA","BACTRIAN CAMEL","BANTENG","BLACK RHINOCEROS",
                                "CENTRAL CHINESE GORAL","COTSWOLD SHEEP","DOMESTIC GOAT","DWARF ZEBU","GERENUK",
                                "GREVY'S ZEBRA","HIPPOPOTAMUS","LESSER KUDU","OKAPI","RED RIVER HOG","RETICULATED GIRAFFE",
                                "SOEMMERRING'S GAZELLE","SOMALI WILD ASS","SPEKE'S GAZELLE","SICHUAN TAKIN","TRANSCASPIAN URIAL",
                                "VISAYAN WARTY PIG","ALLEN'S SWAMP MONKEY","GUEREZA COLOBUS MONKEY","BLACK AND WHITE RUFFED LEMUR",
                                "BLACK LEMUR","BLACK-HANDED SPIDER MONKEY","CHIMPANZEE","COQUEREL'S SIFAKA","COTTON-TOP TAMARIN",
                                "FRANCOIS LANGUR","GOELDI'S MONKEY","GOLDEN LION TAMARIN","MONGOOSE LEMUR","RING-TAILED LEMUR",
                                "SPECTACLED LANGUR","SUMATRAN ORANGUTAN","WESTERN LOWLAND GORILLA","WHITE-FACED SAKI",
                                "MATSCHIE'S TREE KANGAROO","OPOSSUM","RED KANGAROO","TAMMAR WALLABY","BLACK-TAILED PRAIRIE DOG",
                                "CAPYBARA","DEGU","GUINEA PIG","KANGAROO RAT","LONG-TAILED CHINCHILLA","MEXICAN HAIRY PORCUPINE",
                                "NAKED MOLE RAT","PREVOST'S SQUIRREL","SPRINGHAAS","ST. VINCENT'S AGOUTI","WOODCHUCK",
                                "CALIFORNIA SEA LION","HARBOR SEAL","HEDGEHOG","RABBIT","ELEPHANT"};
    // list of Mammals at The Saint Louis Zoo
    
    private final String[] reptiles = {"American Alligator","Chinese Alligator","Cuban Crocodile","Dwarf Caiman",
                                "Malayan Gharial","Banded Gila Monster","Black Tree Monitor","Blue Spiny Lizard",
                                "Blue-tongued Skink","Chinese Crocodile Lizard","Green Iguana","Henkel's Leaftailed Gecko",
                                "Inland Bearded Dragon","Leopard Gecko","Mexican Beaded Lizard","New Caledonia Giant Gecko",
                                "Scheltopusik","Warren's Girdled Lizard","Western Chuckwalla","Anatolian Viper","Armenian Viper",
                                "Aruba Island Rattlesnake","Ball Python","Black Milk Snake","Black Rat Snake","Black-headed Python",
                                "Boelen's Python","Bolkar Viper","Brazilian Rainbow Boa","Caucasus Viper","Central American Bushmaster",
                                "Central Asian Cobra","Corn Snake","Dumeril's Boa","Eastern Diamondback Rattlesnake","Emerald Tree Boa" };
    // list of Reptiles at The Saint Louis Zoo 

    //constructor
    public DataStore() {this.names = fillNames();}
    
    ///////  methods  \\\\\\\
    
    // Names from a txt file (http://listofrandomnames.com)  
    private ArrayList <String> fillNames() 
    {  
        ArrayList<String> filled = new ArrayList<>();
        File file = new File("Names.txt");
        
        try (Scanner scan = new Scanner(file)) 
        {
            while(scan.hasNextLine())
            {
                filled.add(scan.nextLine());
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("No such File: " + e);
        }
        return filled;
    }
    
// just getters required
    public ArrayList<String> getNames() 
    {
        return names;
    }

    public String[] getMammals() 
    {
        return mammals;
    }

    public String[] getReptiles() 
    {
        return reptiles;
    }      
}
