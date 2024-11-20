// Matthew Kight
public class CargoShip extends Ship {

    // instance variables
    private double tonnage;
    private double maxSpeed;

    // constructors
    public CargoShip()
    {
        super();
        this.tonnage = 0;
        this.maxSpeed = 0;
    }

    public CargoShip(String xName, String xDate, double xTonnage, double xSpeed)
    {
        super(xName, xDate);
        this.setTonnage(xTonnage);
        this.setMaxSpeed(xSpeed);
    }

    // accessors
    public double getTonnage()
    {
        return this.tonnage;
    }

    public double getMaxSpeed()
    {
        return this.maxSpeed;
    }

    // mutators
    public void setTonnage(double xTonnage)
    {
        if (xTonnage > 0) {
            this.tonnage = xTonnage;
        }
        else {
            System.out.println("Invalid value entered for tonnage!");
        }
    }

    public void setMaxSpeed(double xSpeed)
    {
        if (xSpeed > 0) {
            this.maxSpeed = xSpeed;
        }
        else {
            System.out.println("Invalid value entered for speed!");
        }
    }

    // toString method
    public String toString()
    {
        return "Name: "+super.getName()+
        "\nTonnage: "+this.tonnage+
        "\nMax Speed: "+this.maxSpeed;
    }
    
}
