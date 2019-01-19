
public class Building
{
    // instance variables
    private String buildingName, buildingDescription;
    private int rooms;
    
    /**
     * Constructor for objects of class City
     */
    public Building(String name, String description)
    {
        // initialise instance variables
        this.buildingDescription = description;
        this.buildingName = name;
    }
    
    public void addRoom(int room)
    {
        this.rooms = room;
    }

}
