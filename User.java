
public class User {
    private String name;
    private String location;

    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

public class Ride {
    private User driver;
    private String departureTime;
    private String departureLocation;
    private String destination;
    private int seatsAvailable;
    private List<User> passengers;

    public Ride(User driver, String departureTime, String departureLocation, String destination, int seatsAvailable) {
        this.driver = driver;
        this.departureTime = departureTime;
        this.departureLocation = departureLocation;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
        this.passengers = new ArrayList<>();
    }

    public boolean addPassenger(User passenger) {
        if (passengers.size() < seatsAvailable) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public User getDriver() {
        return driver;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public List<User> getPassengers() {
        return passengers;
    }
}

public class Carpool {
    private Map<String, User> users;
    private List<Ride> rides;

    public Carpool() {
        users = new HashMap<>();
        rides = new ArrayList<>();
    }

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public boolean matchRide(User passenger, String departureLocation, String destination) {
        for (Ride ride : rides) {
            if (ride.getDepartureLocation().equals(departureLocation) && ride.getDestination().equals(destination)) {
                if (ride.addPassenger(passenger)) {
                    return true;
                }
            }
        }
        return false;
    }
}
