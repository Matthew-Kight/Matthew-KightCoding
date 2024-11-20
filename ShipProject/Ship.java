// Matthew Kight
public class Ship {

    // instance variables
    private String name;
    private String launchDate;

    // constructors
    public Ship()
    {
        this.name = "unknown";
        this.launchDate = "unknown";
    }

    public Ship(String xName, String xDate)
    {
        this.setName(xName);
        this.setLaunchDate(xDate);
    }

    // accessors
    public String getName()
    {
        return this.name;
    }

    public String getLaunchDate()
    {
        return this.launchDate;
    }

    // mutators
    public void setName(String xName)
    {
        this.name = xName;
    }

    public void setLaunchDate(String xDate) 
    {
        String subyear = xDate.substring(6, 10);
        int year = 0;

        try {
            year = Integer.parseInt(subyear);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (year >= 1990 && year <= 2019) {
            this.launchDate = xDate;
        }
        else {
            System.out.println("Invalid value entered for launch date!");
        }
    }

    // toString method
    public String toString()
    {
        return "Ship Name: "+this.name+
        "\nLaunch Date: "+this.launchDate;
    }

}