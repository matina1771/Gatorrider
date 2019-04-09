


import java.util.Scanner;
import java.util.List;
public class Person {




    Scanner scnr = new Scanner(System.in);
    private String name;
    private String age;
    private String gender;
    private String userName;
    private String password;
    final String[] locations = {"Gainesville" , "Ocala", "Orlando", "Jacksonville", "Sarasota", "Miami", "Tallahassee"};

    public Person ( String _name, String _age, String _gender) {
        name = _name;
        age = _age;
        gender = _gender;
    }

    public void setName (String newName) {
        name = newName;
    }

    public String getName () {
        return name;
    }

    public void setAge (String newAge) {
        age = newAge;
    }

    public String getAge () {
        return age;
    }

    public void setGender (String _gender) {
        gender = _gender;
    }

    public String getGender () {
        return gender;
    }

    public void setUserName (String newUserName) {
        userName = newUserName;
    }

    public void setPassword (String newPassword) {
        password = newPassword;
    }

    public Ride offerRide() {

        System.out.println("Enter your starting point: ");
        String origin = scnr.next();

        System.out.println("Enter your final destination: ");
        String destination = scnr.next();

        System.out.println("How many spots in your car?");
        String spots = scnr.next();

        System.out.println("how much will you charge per person?");
        String price = scnr.next();


        String driverName = name;

        return new Ride(origin, destination, spots, price, driverName);
    }

    public void isRideAvailable(List<Ride> ridesAvailable) {
        System.out.println("Where are you leaving from: ");
        String origin = scnr.next();
        System.out.println("Wheter are you heading to: ");
        String destination = scnr.next();
        System.out.println("How many people in total? ");
        String ppl = scnr.next();
        System.out.println("How much are you willing to pay? ");
        String pay = scnr.next();

        findRide(ridesAvailable, origin, destination, ppl, pay);
    }

    public boolean findRide( List<Ride> ridesAvailable, String origin, String destination, String spots, String price) {
        for (int i = 0 ; i < ridesAvailable.size() ; i++) {
            if(origin.equals(ridesAvailable.get(i).getOrigin()) &&
                    destination.equals(ridesAvailable.get(i).getDestination()) &&
                    ((Integer.parseInt(spots) <= Integer.parseInt(ridesAvailable.get(i).getSpots())) &&
                            (Integer.parseInt(ridesAvailable.get(i).getPrice())) <= Integer.parseInt(price))) {
                System.out.println("Ride found");
                //ridesAvailable.get(i).decreaseSpot(); figure out later
                ridesAvailable.get(i).Print();
                return true;
            }
        }
        return false;
    }




}