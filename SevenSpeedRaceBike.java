
public class SevenSpeedRaceBike implements Bike {
    public double getBikeAmt(String rentalDuration) {
        return 13.0 * Integer.parseInt(rentalDuration);
    }
}