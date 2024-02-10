package com.softwareDesign.main.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.softwareDesign.main.implementation.Activity;
import com.softwareDesign.main.implementation.Destination;
import com.softwareDesign.main.implementation.Passenger;
import com.softwareDesign.main.implementation.PassengerType;
import com.softwareDesign.main.implementation.TravelPackage;

public class TravelPackageTest {

    @Test
    public void addPassengerTest1() {
	TravelPackage travelPackage = new TravelPackage("Test Package", 10);
	Passenger passenger1 = new Passenger("John", 1, 100.0, PassengerType.STANDARD);
	Passenger passenger2 = new Passenger("Jane", 2, 150.0, PassengerType.PREMIUM);
	travelPackage.addPassenger(passenger1);
	assertEquals(1, travelPackage.getPassengers().size());
	travelPackage.addPassenger(passenger2);
	assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    public void removePassengerTest1() {
	TravelPackage travelPackage = new TravelPackage("Test Package", 10);
	Passenger passenger1 = new Passenger("John", 1, 100.0, PassengerType.STANDARD);
	travelPackage.addPassenger(passenger1);
	assertEquals(1, travelPackage.getPassengers().size());
	travelPackage.removePassenger(passenger1);
	assertEquals(0, travelPackage.getPassengers().size());
    }

    @Test
    public void addPassengerTest2() {
	TravelPackage travelPackage = new TravelPackage("Test Package", 2);
	Passenger passenger1 = new Passenger("John", 1, 100.0, PassengerType.STANDARD);
	Passenger passenger2 = new Passenger("Jane", 2, 150.0, PassengerType.PREMIUM);
	Passenger passenger3 = new Passenger("Alice", 3, 200.0, PassengerType.GOLD);

	travelPackage.addPassenger(passenger1);
	travelPackage.addPassenger(passenger2);

	travelPackage.addPassenger(passenger3);

	assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    public void removePassengerTest2() {
	TravelPackage travelPackage = new TravelPackage("Test Package", 3);
	Passenger passenger1 = new Passenger("John", 1, 100.0, PassengerType.STANDARD);
	Passenger passenger2 = new Passenger("Jane", 2, 150.0, PassengerType.PREMIUM);
	Passenger passenger3 = new Passenger("Alice", 3, 200.0, PassengerType.GOLD);

	travelPackage.addPassenger(passenger1);
	travelPackage.addPassenger(passenger2);
	travelPackage.addPassenger(passenger3);

	travelPackage.removePassenger(passenger2);

	assertFalse(travelPackage.getPassengers().contains(passenger2));

	assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    public void printItineraryTest1() {
	TravelPackage travelPackage = new TravelPackage("Test Package", 2);
	Destination destination1 = new Destination("Destination 1");
	Destination destination2 = new Destination("Destination 2");
	Activity activity1 = new Activity("Activity 1", "Description 1", 50.0, 10);
	Activity activity2 = new Activity("Activity 2", "Description 2", 100.0, 20);

	destination1.addActivity(activity1);
	destination2.addActivity(activity2);

	travelPackage.addDestination(destination1);
	travelPackage.addDestination(destination2);

	travelPackage.printItinerary();
    }

}
