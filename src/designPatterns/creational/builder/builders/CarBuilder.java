package designPatterns.creational.builder.builders;

import designPatterns.creational.builder.cars.Car;
import designPatterns.creational.builder.cars.CarType;
import designPatterns.creational.builder.components.Engine;
import designPatterns.creational.builder.components.GPSNavigator;
import designPatterns.creational.builder.components.Transmission;
import designPatterns.creational.builder.components.TripComputer;

// Concrete builders implement steps defined in the common interface.
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
