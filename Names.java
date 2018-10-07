package namegenerator;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author BionicBarry
 */
public class Names{
    //Lists of nouns:
    //0 - Land animals
    //1 - Inanimate Objects
    //2 - Generic Occupations
    //3 - Meme Names
    private ArrayList<List<String>> nouns = new ArrayList<List<String>>();
    //Lists of Adjectives:
    //0 - Silly adjectives
    //1 - Generic Adjectives
    //2 - 'Cool' Adjectives
    //3 - Nationalities
    private ArrayList<List<String>> adjectives = new ArrayList<List<String>>();
    
    public Names(){
        //Constructor populates main noun and adjective array lists from files.  2D array lists
        //are used for scalability with future addition of noun and adjective lists
        try{
            //Populating noun Array list with Array Lists of words
            this.nouns.add(this.addSub("animals.txt"));
            this.nouns.add(this.addSub("objects.txt"));
            this.nouns.add(this.addSub("occupations.txt"));
            this.nouns.add(this.addSub("memenames.txt"));
            //Populating the adjective Array List with Array Lists of words
            this.adjectives.add(this.addSub("funny.txt"));
            this.adjectives.add(this.addSub("genericadj.txt"));
            this.adjectives.add(this.addSub("serious.txt"));
            this.adjectives.add(this.addSub("nationalities.txt"));
        }catch (IOException e){
            System.out.println("Error: File not found.");
        }
    }
    //Local method for adding a new list to either nouns or adjectives
    private ArrayList<String> addSub(String filePath) throws FileNotFoundException, IOException{
        //TO-DO: Add remote import for .txt
        //URL url = (Names.class.getClassLoader().getResource(filePath));
        //URL url = Names.class.getClassLoader().getResource(filePath);
        //ClassLoader c1 = ClassLoader.getSystemClassLoader();
        //File in = new File(c1.getResource(filePath).getFile());
        //System.out.println(in.getPath());
        //BufferedReader txtReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filePath)));
        ArrayList <String> temp = new ArrayList<>();
        Scanner scan = new Scanner(new InputStreamReader(getClass().getResourceAsStream(filePath)));
        while(scan.hasNextLine()){
            temp.add(scan.nextLine());
        }
        scan.close();
        return temp;
    }
    
    //Public method to initiate the name generation local methods and return the generated username
    public String startGeneration(boolean animal, boolean objects, boolean occ, boolean meme, boolean silly, boolean generic, boolean cool, boolean nation){
        return this.generatedName(this.nounChoises(animal, objects, occ, meme), this.adjChoises(silly, generic, cool, nation));
    }
    //Method compiling chosen noun and adjective types into single lists, and randomly 
    //pulling a word out of the arraylist
    private String generatedName(ArrayList <String> n, ArrayList<String> a){
        //New Array Lists containing desired subject nouns and adjectives
        ArrayList<String> usableNouns = n;
        ArrayList<String> usableAdj = a;
        //System.out.println(usableNouns.toString());
        //System.out.println(usableAdj.toString());
        //Random Numbers generated according to the size of each array list
        int ai = ThreadLocalRandom.current().nextInt(0, usableAdj.size());
        int ni = ThreadLocalRandom.current().nextInt(0, usableNouns.size());
        //Random numberGen = new Random();
        String adj,noun,username;
        adj = usableAdj.get(ai);
        noun = usableNouns.get(ni);
        username = adj + noun;
        return username;
    }
    //method selecting type of nouns the user selected
    private ArrayList<String> nounChoises(boolean animal, boolean objects, boolean occ, boolean meme){
        ArrayList<String> chosenNouns = new ArrayList<String>();
        if(animal){
            for(int i = 0; i < this.nouns.get(0).size(); i++){
                chosenNouns.add(this.nouns.get(0).get(i));
            }
        }
        if(objects){
            for(int i = 0; i < this.nouns.get(1).size(); i++){
                chosenNouns.add(this.nouns.get(1).get(i));
            }
        }
        if(occ){
            for(int i = 0; i < this.nouns.get(2).size(); i++){
                chosenNouns.add(this.nouns.get(2).get(i));
            }
        }
        if(meme){
            for(int i = 0; i < this.nouns.get(3).size(); i++){
                chosenNouns.add(this.nouns.get(3).get(i));
            }
     } 
        return chosenNouns;
    }
    //method selecting adjectives the user selected
    private ArrayList<String> adjChoises(boolean funny, boolean generic, boolean serious, boolean nation){
        ArrayList<String> chosenAdj = new ArrayList<String>();
        if(funny){
            for(int i = 0; i < this.adjectives.get(0).size(); i++){
                chosenAdj.add(this.adjectives.get(0).get(i));
            }
        }
        if(generic){
            for(int i = 0; i < this.adjectives.get(1).size(); i++){
                chosenAdj.add(this.adjectives.get(1).get(i));
            }
        }
        if(serious){
            for(int i = 0; i < this.adjectives.get(2).size(); i++){
                chosenAdj.add(this.adjectives.get(2).get(i));
            }
        }
        if(nation){
            for(int i = 0; i < this.adjectives.get(3).size(); i++){
                chosenAdj.add(this.adjectives.get(3).get(i));
            }
     } 
        return chosenAdj;
    }
    
    public void showLists(){
        System.out.println("Nouns:");
        for (int i = 0; i < this.nouns.size(); i++){
            System.out.println(this.nouns.get(i).toString());
        }
        System.out.println("Adjectives: ");
        for (int i = 0; i < this.adjectives.size(); i++ ){
            System.out.println(this.adjectives.get(i).toString());
        }
    }
    
    
}
