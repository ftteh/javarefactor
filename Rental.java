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

    public void showResults() {
        // Display these results when method is called
        System.out.println(
                "Hello " + getName() + ", thanks for renting " + bikeType + " for " + rentalDuration + " hours");

        // insurance
        if (insurance == 0) {
            extraAmount += 5;
            System.out.println("Insurance: " + " Required ");
        } else if (insurance == 1) {
            extraAmount += 0;
            System.out.println("Insurance: " + " Not Needed");
        }

        // Bike Gps
        if (bikeGps == 0) {
            extraAmount += 5;
            System.out.println("GPS: " + " Required ");
        } else if (bikeGps == 1) {
            extraAmount += 0;
            System.out.println("GPS: " + " Not Needed");
        }

        // Selecting Bike Type and computing
        switch (bikeType) {
            case "Mountain bike":
                bikeAmount = 10.5 * Integer.parseInt(rentalDuration);
                break;
            case "7-speed race bike":
                bikeAmount = 13.0 * Integer.parseInt(rentalDuration);
                break;
            case "Tandem bike":
                bikeAmount = 15.0 * Integer.parseInt(rentalDuration);
                break;
            default:
                System.out.println("No Bike Type");
        }

        // computing rental subtotal for renting the bike
        rentalSubTotal = bikeAmount + extraAmount;
        System.out.println("Rental Subtotal: RM" + rentalSubTotal); // outputs it to the console

        // computing rental Tax for borrowing the tax and the tax rate is 6% of the
        // amount
        rentTax = rentalSubTotal * 6 / 100;
        System.out.println("Tax Amount: RM" + rentTax);

        // computing the total Amount of everything tax including subtotal and tax
        totalAmount = rentTax + rentalSubTotal;
        System.out.println("Total Amount: RM" + totalAmount);
    }

    // Getters and Setters
    public String getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(String rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int isInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int isBikeGps() {
        return bikeGps;
    }

    public void setBikeGps(int bikeGps) {
        this.bikeGps = bikeGps;
    }

    public double getRentalSubTotal() {
        return rentalSubTotal;
    }

    public void setRentalSubTotal(double rentalSubTotal) {
        this.rentalSubTotal = rentalSubTotal;
    }

    public double getRentTax() {
        return rentTax;
    }

    public void setRentTax(double rentTax) {
        this.rentTax = rentTax;
    }
}
