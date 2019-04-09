import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class GatorRider {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        List<Ride> ridesAvailable = new ArrayList<>();

        String name;
        String age;
        String gender ="";
        String userName;
        String passWord;
        System.out.println("welcome to gator rider");
        System.out.println("Please enter your data.");


        System.out.println("Please enter your name: ");
        name = scnr.next();

        System.out.println("Please enter your age: ");
        age = scnr.next();

        System.out.println("Please enter your gender, enter M or F. ");
        String response = scnr.next();
        if (response.equals("M")) {
            gender = "male";
        } else if (response.equals("F")) {
            gender = "female";
        }

        Person user = new Person(name, age, gender);

        System.out.println("User profile: ");
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getGender());

        System.out.println("Click any button to proceed");
        String next = scnr.next();

        System.out.println("Please set a username: ");
        userName = scnr.next();

        boolean isPasswordMatch = false;

        while (!isPasswordMatch) {
            System.out.println("Please choose a password:");
            passWord = scnr.next();

            System.out.println("Please reenter your password: ");
            String pw2 = scnr.next();

            if (passWord.equals(pw2)) {
                System.out.println("Thank you for registering with Gator Rider!");
                isPasswordMatch = true;
            } else {
                System.out.println("Passwords do not match, please try again.");
            }
        }

        Ride newRide = user.offerRide();
        newRide.Print();
        ridesAvailable.add(newRide);

        user.isRideAvailable(ridesAvailable);




    }
}
