package co.grandcircus.Demo.objects;

import java.util.ArrayList;
import java.util.List;

public class Car {

	public static List<Car> cars = new ArrayList<Car>();
	
	private String make;
	private String model;
	private int year;
	private int miles;
	
	public Car(String make, String model, int year, int miles) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.miles = miles;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public static List<Car> getCars() {
		return cars;
	}

	public void populateCars() {
		cars.add(new Car("Ford","Explorer",1999,200000));
		cars.add(new Car("Honda","Fit",2021,0));
		cars.add(new Car("Honda","Civic",2013,500000));
		cars.add(new Car("Hyundai","Veloster",2020,150));
		cars.add(new Car("Toyota","RAV-4",2009,180000));
		cars.add(new Car("Subaru","Forester",2021,0));
	}
	
}
