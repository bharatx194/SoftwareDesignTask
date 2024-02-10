package com.softwareDesign.main.implementation;

import java.util.List;

public class TravelPackage {

    private String name;

    private Integer passengerCapacity;

    private List<Passenger> passengers;

    private List<Destination> itinerary;

    public TravelPackage(String name, Integer passengerCapacity) {
	this.name = name;
	this.passengerCapacity = passengerCapacity;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getPassengerCapacity() {
	return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
	this.passengerCapacity = passengerCapacity;
    }

    public List<Passenger> getPassengers() {
	return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
	this.passengers = passengers;
    }

    public List<Destination> getItinerary() {
	return itinerary;
    }

    public void setItinerary(List<Destination> itinerary) {
	this.itinerary = itinerary;
    }

    public void addPassenger(Passenger passenger) {
	if (passengers.size() < passengerCapacity) {
	    passengers.add(passenger);
	} else {
	    System.out.println("The travel package is full. Cannot add more passengers.");
	}
    }

    public void removePassenger(Passenger passenger) {
	passengers.remove(passenger);
    }

    public void printItinerary() {
	System.out.println("Travel Package: " + name);
	for (Destination destination : itinerary) {
	    System.out.println("Destination: " + destination.getName());
	    for (Activity activity : destination.getActivities()) {
		System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() + ", Capacity: "
			+ activity.getCapacity());
	    }
	}
    }

    public void printPassengerList() {
	System.out.println("Travel Package: " + name);
	System.out.println("Passenger Capacity: " + passengerCapacity);
	System.out.println("Number of Passengers Enrolled: " + passengers.size());
	for (Passenger passenger : passengers) {
	    System.out.println("Passenger: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
	}
    }

    public void printPassengerDetails(Passenger passenger) {
	passenger.printDetails();
    }

    public void printAvailableActivities() {
	System.out.println("Available Activities:");
	for (Destination destination : itinerary) {
	    for (Activity activity : destination.getActivities()) {
		if (activity.getCapacity() > 0) {
		    System.out.println("Activity: " + activity.getName() + ", Capacity: " + activity.getCapacity());
		}
	    }
	}
    }
    
    public void addDestination(Destination destination) {
	itinerary.add(destination);
    }

}
