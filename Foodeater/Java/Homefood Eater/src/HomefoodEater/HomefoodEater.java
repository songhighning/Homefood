package HomefoodEater;

import java.util.ArrayList;

public class HomefoodEater {
	private String email;
	private String customerName;
	private int homeFoodEaterID;
	private Order currentOrderSession = new Order();
	private HomefoodSystem theHomefoodSystem;
	private ArrayList<Order> orderHistory = new ArrayList<Order>();
	
	static int homefoodEaterIDIncrementor = 100000;

	HomefoodEater(String email, String customerName, HomefoodSystem theSystem){
		this.email = email;
		this.customerName = customerName;
		this.theHomefoodSystem = theSystem;
		this.homeFoodEaterID = generateFoodEaterID();
		theSystem.addHomefoodEater(this);
	}
	
	static private int generateFoodEaterID(){
		return homefoodEaterIDIncrementor++;
	}
	
	public void confirmOrder(){
		theHomefoodSystem.sendOrderToFoodMaker(getCurrentOrderSession());
		addOrderToHistory(getCurrentOrderSession());
		currentOrderSession = new Order();
	}
	
	public void addOrderToHistory(Order theOrder){
		orderHistory.add(theOrder);
	}
	
	public ArrayList<HomefoodMaker> viewHomefoodMakerList(){
		return theHomefoodSystem.getHomeFoodMakerList();
	}
	
	public ArrayList<Food> selectHomefoodMaker(HomefoodMaker theHomefoodMaker){
		currentOrderSession.setTheHomefoodEater(this);
		currentOrderSession.setTheHomefoodMaker(theHomefoodMaker);
		return theHomefoodMaker.getMenu();
	}
	
	public void addFoodToOrder(Food theFood, int quantity){
		currentOrderSession.addFoodToOrder(theFood, quantity);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getHomeFoodEaterID() {
		return homeFoodEaterID;
	}

	public void setHomeFoodEaterID(int homeFoodEaterID) {
		this.homeFoodEaterID = homeFoodEaterID;
	}

	public Order getCurrentOrderSession() {
		return currentOrderSession;
	}

	public void setCurrentOrderSession(Order currentOrderSession) {
		this.currentOrderSession = currentOrderSession;
	}

	public HomefoodSystem getTheHomefoodSystem() {
		return theHomefoodSystem;
	}

	public void setTheHomefoodSystem(HomefoodSystem theHomefoodSystem) {
		this.theHomefoodSystem = theHomefoodSystem;
	}

	public static int getHomefoodEaterIDIncrementor() {
		return homefoodEaterIDIncrementor;
	}

	public static void setHomefoodEaterIDIncrementor(int homefoodEaterIDIncrementor) {
		HomefoodEater.homefoodEaterIDIncrementor = homefoodEaterIDIncrementor;
	}
	
	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(ArrayList<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public void foodIsReadyNotification(Order theOrder){
		System.out.println("Order # "+ theOrder.getOrderId()+" is ready.");
		for (Food food:theOrder.getFoodList()){
			System.out.println(food.getFoodName());
		}
	}
	
	
}
