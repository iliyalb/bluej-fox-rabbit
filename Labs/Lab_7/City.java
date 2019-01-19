import java.util.ArrayList;

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
    
    public void addBuilding(Building building)
    {
        buildings.add(building);
    } 
    
}
