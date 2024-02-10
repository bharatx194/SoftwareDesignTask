package com.softwareDesign.main.implementation;

import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private String name;

    private Integer passengerNumber;

    private Double balance;

    private PassengerType type;

    private List<Activity> activities;

    public Passenger(String name, Integer passengerNumber, Double balance, PassengerType type) {
	this.name = name;
	this.passengerNumber = passengerNumber;
	this.balance = balance;
	this.type = type;
	this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
	activities.add(activity);
    }

    public void removeActivity(Activity activity) {
	activities.remove(activity);
    }

    public void printDetails() {
	System.out.println("Passenger: " + name);
	System.out.println("Passenger Number: " + passengerNumber);
	if (type.equals(PassengerType.STANDARD) || type.equals(PassengerType.GOLD)) {
	    System.out.println("Balance: " + balance);
	}
	System.out.println("Activities:");
	for (Activity activity : activities) {
	    System.out.println(
		    "Activity: " + activity.getName() + ", Destination: " + ", Price: " + calculatePrice(activity));
	}
    }

    private double calculatePrice(Activity activity) {
	if (type == PassengerType.STANDARD) {
	    return balance >= activity.getCost() ? activity.getCost() : 0;
	} else if (type == PassengerType.GOLD) {
	    double discountedCost = activity.getCost() * 0.9;
	    return balance >= discountedCost ? discountedCost : 0;
	} else {
	    return 0; // Premium passenger, price is always free
	}
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getPassengerNumber() {
	return passengerNumber;
    }

    public void setPassengerNumber(Integer passengerNumber) {
	this.passengerNumber = passengerNumber;
    }

    public Double getBalance() {
	return balance;
    }

    public void setBalance(Double balance) {
	this.balance = balance;
    }

    public PassengerType getType() {
	return type;
    }

    public void setType(PassengerType type) {
	this.type = type;
    }

    public List<Activity> getActivities() {
	return activities;
    }

    public void setActivities(List<Activity> activities) {
	this.activities = activities;
    }
}
