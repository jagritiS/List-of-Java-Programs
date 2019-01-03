package inheritance;

public class MountainBike extends Bicycle  {
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        //calling super class constructor with super keyword
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public void display(){
        System.out.println("start Height"+seatHeight);
        System.out.println("cadence from superclass"+cadence);
    }
}
