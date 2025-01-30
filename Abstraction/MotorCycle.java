package Abstraction;

public class MotorCycle extends Vehicle{
	public double dailyRate;
	   public double mileage;
	   public MotorCycle(String id,double dailyRate,double mileage)
	   {
		   super(id);
		   this.dailyRate=dailyRate;
		   this.mileage=mileage;
	   }
	   @Override
	   public double getRentalCost(int days) {
		   return days*dailyRate;
	   }
	   public double getMileage() {
		   return mileage;
	   }
}
    

