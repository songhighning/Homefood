package HomefoodEater;

import java.util.ArrayList;

public class HomefoodSystem {
	private ArrayList<HomefoodEater> homeFoodEaterList = new ArrayList<HomefoodEater>();
	private ArrayList<HomefoodMaker> homeFoodMakerList = new ArrayList<HomefoodMaker>();
	private ArrayList<Order> orderHistory = new ArrayList<Order>();
	
	
	public void addHomefoodMaker(HomefoodMaker theHomefoodMaker){
		homeFoodMakerList.add(theHomefoodMaker);
	}
	
	public void addHomefoodEater(HomefoodEater theHomefoodEater){
		homeFoodEaterList.add(theHomefoodEater);
	}
	public void notifyHomefoodEaterFoodIsReady(Order theOrder) {
		// TODO Auto-generated method stub
		theOrder.getTheHomefoodEater().foodIsReadyNotification(theOrder);
		
	}

	public void sendOrderToFoodMaker(Order currentOrderSession) {
		// TODO Auto-generated method stub
		orderHistory.add(currentOrderSession);
		currentOrderSession.getTheHomefoodMaker().receivesOrder(currentOrderSession);
	}

	public ArrayList<HomefoodEater> getHomeFoodEaterList() {
		return homeFoodEaterList;
	}

	public ArrayList<HomefoodMaker> getHomeFoodMakerList() {
		return homeFoodMakerList;
	}

	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}
	
	
	
}
