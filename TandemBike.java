
public class TandemBike implements Bike {
    public double getBikeAmt(String rentalDuration) {
        return 15.0 * Integer.parseInt(rentalDuration);
    }
}