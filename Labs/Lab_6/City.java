/**
 * Class city which implements UML
 *
 * @author Lesani
 * @version 0.5.7
 */

import java.util.ArrayList;

// Part الف

public class City
{
    // instance variables
    private String cityName, cityDescription;
    private ArrayList<Building> buildings;
    private Boolean flag;
    
    /**
     * Constructor for objects of class City
     */
    public City(String name,String description)
    {
        // initialise instance variables
        this.flag = false;
        this.cityName = name;
        this.cityDescription = description;
        buildings = new ArrayList<Building>();
    }

    public String getCityDescription()
    {
        return this.cityDescription;
    }
    
    public void addBuilding(Building building)
    {
        buildings.add(building);
    }
    
    public int getCurrentNumberOfBuildings()
    {
        return buildings.size();
    }
    
    // Part ب
    
    public void describeBuilding(int buildingNumber)
    {
        
        if(buildingNumber >= 0 && buildingNumber < buildings.size()) 
        { 
           System.out.printf("Building: %s, Description: %s, Room(s): %d", 
           buildings.get(buildingNumber).getBuildingName(),
           buildings.get(buildingNumber).getBuildingDescription(),
           buildings.get(buildingNumber).getCurrentNumberOfRooms()
           );

        }
        else
            System.out.println("Error"); 
    }
    
    // Part ج
    
    public void searchBuilding(String search)
    {
        for(int i = 0; i <= buildings.size() - 1; i++)
        {
            
            if(flag == false)
            {
                if(search.equals(buildings.get(i).getBuildingName()))
                {
                    System.out.println("Found: " + search);
                    flag = true;
                    break;
                }
                else if(search.contains(buildings.get(i).getBuildingName()))
                {
                    System.out.println("Similar result found: " + buildings.get(i).getBuildingName());
                    flag = true;
                    break;
                }
                else if(buildings.get(i).getBuildingName().startsWith(search) || 
                buildings.get(i).getBuildingName().endsWith(search))
                {
                    System.out.println("Not found, similar result: " + buildings.get(i).getBuildingName());
                    flag = true;
                    break;
                }
                else
                {
                    System.out.println("Nothing to be found"); 
                    flag = true;
                    break;
                }
            }
            else
            {
                System.out.println("Error"); 
                break;
            }
        }
        flag = false;
    }
    
    // Part د
    
    public void printCityInfo()
    {
        for(int i = 0; i <= buildings.size() - 1; i++)
        {
            System.out.printf("City: %s, City Description: %s Building: %s, Description: %s, Room(s): %d \n", 
            this.cityName, this.cityDescription,
            buildings.get(i).getBuildingName(),
            buildings.get(i).getBuildingDescription(),
            buildings.get(i).getCurrentNumberOfRooms()
           );
        }
    }
    
}
