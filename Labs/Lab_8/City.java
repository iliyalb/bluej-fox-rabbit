import java.util.ArrayList;
import java.util.Scanner;

public class City
{
    private String cityName, cityDescription;
    private ArrayList<Building> buildings;
    
    public City(String name,String description)
    {
        this.cityName = name;
        this.cityDescription = description;
        buildings = new ArrayList<Building>();
    }
    
    public static void main(String args[])
    {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Get values
        System.out.println("Enter city name: ");
        String cn = input.nextLine();
        System.out.println("Enter city description: ");
        String cd = input.nextLine();
        System.out.println("Enter building name: ");
        String bn = input.nextLine();
        System.out.println("Enter building description: ");
        String bd = input.nextLine();
        System.out.println("Enter building rooms: ");
        int br = input.nextInt();
        
        //Create objects
        City C = new City(cn,cd);
        Building B = new Building(bn,bd,br);
        
        //Result
        System.out.printf("City: %s, City Description: %s Building: %s, Description: %s, Room(s): %d \n", cn, cd ,bn ,bd ,br);
    }
    
    public void addBuilding(Building building)
    {
        buildings.add(building);
    } 
    
}
