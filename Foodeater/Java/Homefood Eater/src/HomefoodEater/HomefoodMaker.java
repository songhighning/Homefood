package HomefoodEater;
import java.util.ArrayList;

public class HomefoodMaker {
	private String Email;
	private String shopName;
	private ArrayList<Food> menu;
	private ArrayList<Order> orderHistory;
	private HomefoodSystem theHomefoodSystem;
	private int theHomefoodMakerID;
	
	static int HomefoodMakerIDIncrementor = 100000;

	HomefoodMaker(String Email, String shopName, HomefoodSystem theSystem){
		this.Email = Email;
		this.shopName = shopName;
		this.theHomefoodMakerID = generateFoodMakerID();
		this.theHomefoodSystem = theSystem;
		this.menu = new ArrayList<Food>();
		this.orderHistory = new ArrayList<Order>();
		//theSystem.addHomefoodMaker(this);
	}
	
	
	
	public HomefoodMaker() {
		// TODO Auto-generated constructor stub
	}



	public HomefoodSystem getTheHomefoodSystem() {
		return theHomefoodSystem;
	}



	public int getTheHomefoodMakerID() {
		return theHomefoodMakerID;
	}



	static private int generateFoodMakerID(){
		return HomefoodMakerIDIncrementor++;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ArrayList<Food> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Food> menu) {
		this.menu = menu;
	}

	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(ArrayList<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public static int getHomefoodMakerIDIncrementor() {
		return HomefoodMakerIDIncrementor;
	}

	public static void setHomefoodMakerIDIncrementor(int homefoodMakerIDIncrementor) {
		HomefoodMakerIDIncrementor = homefoodMakerIDIncrementor;
	}
	
	public void addOrderToHistory(Order theOrder){
		orderHistory.add(theOrder);
	}
	
	public void addFoodToMenu(Food theFood){
		menu.add(theFood);
	}
	
	public void removeFoodFromMenu(Food theFood){
		menu.remove(theFood);
	}
	
	public void notifyHomefoodEaterFoodIsReady(Order theOrder){
		theHomefoodSystem.notifyHomefoodEaterFoodIsReady(theOrder);
	}
	
	public void receivesOrder(Order theOrder){
		notifyHomefoodEaterFoodIsReady(theOrder);
	}
}
