package HomefoodEater;

import java.util.ArrayList;

public class testHomefoodEater {
	public static void main(String[] args){
		HomefoodSystem theHomefoodSystem = new HomefoodSystem();
		//create food maker, food and menu
		HomefoodMaker chefDingDeli = new HomefoodMaker("l.alex.d@hotmail.com",
				"AlexDingDeli", theHomefoodSystem);
		
		Food curry = new Food("curry",10.00);
		Food chiliBeef = new Food("Chili Beef", 15.00);
		chefDingDeli.addFoodToMenu(curry);
		chefDingDeli.addFoodToMenu(chiliBeef);
		
		HomefoodMaker stainFreeShwarma = new HomefoodMaker("mike.lin3@outlook.com",
				"StainFreeShwarma", theHomefoodSystem);
		
		Food ChickenShwarma = new Food("Chicken Shwarma",8.00);
		Food BeefShwarma = new Food("Beef Shwarma", 9.00);
		stainFreeShwarma.addFoodToMenu(ChickenShwarma);
		stainFreeShwarma.addFoodToMenu(BeefShwarma);
		
		//theHomefoodSystem.addHomefoodMaker(chefDingDeli);
		//theHomefoodSystem.addHomefoodMaker(stainFreeShwarma);
		
		//create Home food eater
		HomefoodEater FatBob = new HomefoodEater("Fat.bob@gmail.com",
				"FatBob",theHomefoodSystem);
		
		//print the list of makers
		ArrayList<HomefoodMaker> listOfMakers =  FatBob.viewHomefoodMakerList();
		for (HomefoodMaker maker:listOfMakers){
			System.out.println(maker.getShopName());
		}
		
		//Print menu
		ArrayList<Food> alexsMenu = FatBob.selectHomefoodMaker(chefDingDeli);
		for (Food food:alexsMenu){
			FatBob.addFoodToOrder(food, 1);
			System.out.println(food.getFoodName()+ " is added");
		}
		FatBob.confirmOrder();
		
		//mike lines order
		
		//Print menu
		ArrayList<Food> MikesMenu = FatBob.selectHomefoodMaker(stainFreeShwarma);
		for (Food food:MikesMenu){
			FatBob.addFoodToOrder(food, 1);
			System.out.println(food.getFoodName()+ " is added");
		}
		
		FatBob.confirmOrder();
		//Order
	}
}
