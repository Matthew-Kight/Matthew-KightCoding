// Matthew Kight
public class CruiseShip extends Ship {

        // instance variables
        private int capacity;
        private int crewSize;
    
        // constructors
        public CruiseShip()
        {
            super();
            this.capacity = 0;
            this.crewSize = 0;
        }
    
        public CruiseShip(String xName, String xDate, int xCapacity, int xSize)
        {
            super(xName, xDate);
            this.setCapacity(xCapacity);
            this.setCrewSize(xSize);
        }
    
        // accessors
        public int getCapacity()
        {
            return this.capacity;
        }
    
        public int getCrewSize()
        {
            return this.crewSize;
        }
    
        // mutators
        public void setCapacity(int xCapacity)
        {
            if (xCapacity > 0) {
                this.capacity = xCapacity;
            }
            else {
                System.out.println("Invalid value entered for capacity!");
            }
        }
    
        public void setCrewSize(int xSize)
        {
            if (xSize > 0) {
                this.crewSize = xSize;
            }
            else {
                System.out.println("Invalid value entered for crew size!");
            }
        }
    
        // toString method
        public String toString()
        {
            return "Name: "+super.getName()+
            "\nCrew Size: "+this.crewSize+
            "\nCapacity: "+this.capacity;
        }
    
}
