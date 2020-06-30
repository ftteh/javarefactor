public class Rental extends Renter {
    String rentalDuration;
    String bikeType;
    int insurance;
    int bikeGps;
    double rentalSubTotal;
    double rentTax;
    double totalAmount;
    double bikeAmount;
    double extraAmount; // for GPS or Insurance
    String insuranceResult;
    String gpsResult;
    Bike bike;

    public void showResults() {
        // Display these results when method is called
        System.out.println("Hello " + getName() + ", thanks for renting " + bikeType + " for " + rentalDuration + " hours");

        // insurance
        if (insurance == 0) {
            extraAmount += 5;
            insuranceResult = "Required";
        } else if (insurance == 1) {
            insuranceResult = "Not Needed";
        }

        // Bike Gps
        if (bikeGps == 0) {
            extraAmount += 5;
            gpsResult = "Required";
        } else if (bikeGps == 1) {
            gpsResult = "Not Needed";
        }

        System.out.println("Insurance: " + insuranceResult);
        System.out.println("GPS: " + gpsResult);

        // Selecting Bike Type
        switch (bikeType) {
            case "Mountain bike":
                bike = new MountainBike();
                break;
            case "7-speed race bike":
                bike = new SevenSpeedRaceBike();
                break;
            case "Tandem bike":
                bike = new TandemBike();
                break;
            default:
                System.out.println("No Bike Type");
        }
        // computing rental subtotal for renting the bike
        bikeAmount = bike.getBikeAmt(rentalDuration);
        rentalSubTotal = bikeAmount + extraAmount;
        System.out.println("Rental Subtotal: RM" + rentalSubTotal); // outputs it to the console

        // computing rental Tax for borrowing the tax and the tax rate is 6% of the amount
        rentTax = rentalSubTotal * 6 / 100;
        System.out.println("Tax Amount: RM" + rentTax);

        // computing the total Amount of everything tax including subtotal and tax
        System.out.println("Total Amount: RM" + (Double) (rentTax + rentalSubTotal));
    }

    // Getters and Setters
    public String getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(final String rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(final String bikeType) {
        this.bikeType = bikeType;
    }

    public int isInsurance() {
        return insurance;
    }

    public void setInsurance(final int insurance) {
        this.insurance = insurance;
    }

    public int isBikeGps() {
        return bikeGps;
    }

    public void setBikeGps(final int bikeGps) {
        this.bikeGps = bikeGps;
    }

    public double getRentalSubTotal() {
        return rentalSubTotal;
    }

    public void setRentalSubTotal(final double rentalSubTotal) {
        this.rentalSubTotal = rentalSubTotal;
    }

    public double getRentTax() {
        return rentTax;
    }

    public void setRentTax(final double rentTax) {
        this.rentTax = rentTax;
    }
}
