package HomefoodEater;
import java.util.ArrayList;
import java.util.Date;

public class Order {
	private int orderId;
	private Date orderTime;
	private HomefoodMaker theHomefoodMaker;
	private HomefoodEater theHomefoodEater ;
	private ArrayList<Food> foodNameList = new ArrayList<Food>();
	private ArrayList<Integer> foodQuantity = new ArrayList<Integer>();
	
	static int orderIDIncrementor = 100000;
	
	Order (){
		this.orderId = generateOrderID();
	}
	
	static private int generateOrderID(){
		orderIDIncrementor = orderIDIncrementor + 1;
		return orderIDIncrementor;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public HomefoodMaker getTheHomefoodMaker() {
		return theHomefoodMaker;
	}
	public void setTheHomefoodMaker(HomefoodMaker theHomefoodMaker) {
		this.theHomefoodMaker = theHomefoodMaker;
	}
	public HomefoodEater getTheHomefoodEater() {
		return theHomefoodEater;
	}
	public void setTheHomefoodEater(HomefoodEater theHomefoodEater) {
		this.theHomefoodEater = theHomefoodEater;
	}
	public ArrayList<Food> getFoodNameList() {
		return foodNameList;
	}
	public void setFoodNameList(ArrayList<Food> foodNameList) {
		this.foodNameList = foodNameList;
	}
	public ArrayList<Integer> getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(ArrayList<Integer> foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	public void addFoodToOrder(Food theFood, int quantity){
		foodNameList.add(theFood);
		foodQuantity.add(quantity);
	}
	

}
