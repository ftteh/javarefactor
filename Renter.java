public class Renter {

    private String name;
    private String matric;
    private String phoneNum;

    public Renter() {
    }

    public Renter(String name, String matric, String phoneNum) {
        this.name = name;
        this.matric = matric;
        this.phoneNum = phoneNum;
    }

    public Renter(String name, String matric, String phoneNum, String address, String gender, String yearofStudy,
            String faculty) {
        this.name = name;
        this.matric = matric;
        this.phoneNum = phoneNum;
    }

    // overloading my method
    public void showResults() {
        System.out.println("====================");
        System.out.println("User information");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Matric: " + matric);
        System.out.println("====================");
        System.out.println("");
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatric() {
        return matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public String getphoneNum() {
        return phoneNum;
    }

    public void setphoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}