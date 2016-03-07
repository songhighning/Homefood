package HomefoodEater;

public class Food {
	private String foodName;
	private double foodPrice;
	
	Food(String foodName, double foodPrice){
		this.foodName = (foodName);
		this.foodPrice = (foodPrice);
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
}
