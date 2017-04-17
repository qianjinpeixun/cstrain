
import java.util.ArrayList;
import java.util.Calendar;
public class CalculateSystem {
	private ArrayList<CarReceipt> allVehicals = new ArrayList<CarReceipt>();
	public CalculateSystem() {
		allVehicals = new ArrayList<CarReceipt>();
	}
	public double fuelEconomy(CarReceipt car) {
		double fuelEconomy1 = car.getAmountOfGas()-car.getCurrentGas();
		double fuelEconomy2	= car.getDistance()/100;
		System.out.println("fuelEconomy2="+fuelEconomy2);
		double fuelEconomy3 = fuelEconomy1/fuelEconomy2;
		return fuelEconomy3;
	}
	public double distance(CarReceipt car) {
		CalculateSystem calculate = new CalculateSystem();
		Calendar a = Calendar.getInstance();
		int y = a.get(Calendar.YEAR);
		int m = a.get(Calendar.MONTH)+1;
		int d = a.get(Calendar.DATE);
		int day = (y-car.getYear()) * 365 + (m - car.getMonth()) * 36 + (d - car.getDate());
		System.out.println("day="+day);
		double distance = car.getDistance() / day;
		return distance;
	}

}
