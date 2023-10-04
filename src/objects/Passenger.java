// This class represents passengers

package objects;

public class Passenger {
    private int numOfPassengers;
    private City destCity;

    public Passenger(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public void setDestination(City destCity) {
        this.destCity = destCity;
    }

    public City getDestination() {
        return destCity;
    }
}
