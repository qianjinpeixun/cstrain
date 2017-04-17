
public class CarReceipt {
	private int year;
	private int month;
	private int date;
	private double cost;
	private double amountOfGas;
	private double currentGas;
	private double distance;
	private int gasType;
	public CarReceipt(int year, int month, int date, double cost, double amountOfGas, double currentGas, double distance, int gasType) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.amountOfGas = amountOfGas;
		this.currentGas = currentGas;
		this.gasType = gasType;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getAmountOfGas() {
		return amountOfGas;
	}
	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getGasType() {
		return gasType;
	}
	public void setGasType(int gasType) {
		this.gasType = gasType;
	}
	public double getCurrentGas() {
		return currentGas;
	}
	public void setCurrentGas(double currentGas) {
		this.currentGas = currentGas;
	}
	
}
