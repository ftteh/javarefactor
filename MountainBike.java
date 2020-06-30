
public class MountainBike implements Bike {
    public double getBikeAmt(String rentalDuration) {
        return 10.5 * Integer.parseInt(rentalDuration);
    }
}