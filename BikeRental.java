import javax.swing.*;

public class BikeRental {

    public static void main(String[] args) {
        // instantiate rental
        Rental rental = new Rental();

        JFrame frame = new JFrame("Input Diaglog Example");

        // prompt the user to their name
        String name = JOptionPane.showInputDialog(frame, "Please Enter Your Name?");

        // prompt the user to their matric
        String matric = JOptionPane.showInputDialog(frame, "Please Enter Your Matric?");

        // prompt the user to their phoneNum
        String phoneNum = JOptionPane.showInputDialog(frame, "Please Enter Your Phone Number?");

        // instantiate user
        Renter user = new Renter(name, matric, phoneNum);

        // prompt the user to enter Number of hours
        String hours = JOptionPane.showInputDialog(frame, "How many hours do you want to rent?");
        rental.setRentalDuration(hours);

        // Choose Bike Type
        String[] choices = { "Mountain bike", "7-speed race bike", "Tandem bike" };
        String input = (String) JOptionPane.showInputDialog(null, "1:Mountain bike, 2:7-speed race bike, 3:Tandem bike",
                "Choosing a Bike Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        rental.setBikeType(input);

        // Insurance
        int insurance = JOptionPane.showConfirmDialog(null, "Do you need Insurance?", "INSURANCE",
                JOptionPane.YES_NO_CANCEL_OPTION);
        rental.setInsurance(insurance);

        // GPS dialog
        int gps = JOptionPane.showConfirmDialog(null, "Do you need a GPS?", "GPS", JOptionPane.YES_NO_CANCEL_OPTION);
        rental.setBikeGps(gps);

        user.showResults();
        rental.showResults();

        // prompt the user to rate
        String rate = JOptionPane.showInputDialog(frame, "Please rate our service from 1-10 (10= Most satisfied)?");
        Feedback feedback = new Feedback(rate);

    }
}
