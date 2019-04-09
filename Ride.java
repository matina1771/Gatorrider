
public class Ride {

    final String[] locations = {"Gainesville" , "Ocala", "Orlando", "Jacksonville", "Sarasota", "Miami", "Tallahassee"};
    private String origin;
    private String destination;
    private String spots;
    private String isPetOK;
    private String price;
    private String driver;

    public Ride (String _origin, String _destination, String _spots, String _price, String driverName) {
        origin = _origin;
        destination = _destination;
        spots = _spots;
        price = _price;
        driver = driverName;

    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getSpots() {
        return spots;
    }

    /*public void decreaseSpot () {
        spots -= 1;
    }*/ // figure later

    public String getPrice() {
        return price;
    }



    public void Print() {
        System.out.println(driver + " is offering a ride from " + origin + " to " + destination);
        System.out.println("there are " + spots + " spots left in the car.");
        System.out.println("$" + price + " per person.");
    }
}
