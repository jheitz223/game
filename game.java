package game;

import java.util.Scanner;
import java.io.IOException;
import java.lang.StringBuffer;

//	Build 1302
//	
//	by JONATHAN HEITZ
//	fueled by Dubstep

/*
 * 	To-Do:
 * 	-finish loops for all locations
 * 	-implement new fix (using scanner instead of System.in.read)
 */

@SuppressWarnings("unused")
public class game{
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		int inputChar = 0;
		
//		Items:
		int location, money, moneyInBank, ingredients, meals, mLofWater, sodas, beer, cigarettes;
		boolean newspaperIsOwned;
		
//		Locations:
		int home, store, work, bank, downtown, restaurant, homeAlt, kitchen, kitchenAlt, 
			livingRoom, yard, bedroom;
		
//		Input variables:
		char oneKeyHit, twoKeyHit, threeKeyHit, fourKeyHit, fiveKeyHit, 
			sixKeyHit, sevKeyHit, eightKeyHit, nineKeyHit, zeroKeyHit;

//		Player status variables:		
		newspaperIsOwned = false; location = 0; money = 3000; moneyInBank = 0;
		ingredients = 0; meals = 0; mLofWater = 0; sodas = 0; beer = 1;
		
//		Locations:
		home = 0; store = 1; work = 2; bank = 3; downtown = 4; restaurant = 5; homeAlt = 6; 
		kitchen = 7; kitchenAlt = 8; livingRoom = 9; yard = 10; bedroom = 11;
		
//		Input variables:
		oneKeyHit = 1; twoKeyHit = 2; threeKeyHit = 3; fourKeyHit = 4; fiveKeyHit = 5;
		sixKeyHit = 6; sevKeyHit = 7; eightKeyHit = 8; nineKeyHit = 9; zeroKeyHit = 0;
		
		System.out.println("Hello. Please tell me your name.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Nice to meet you, " + name + "!");
		int age = -1;
		try{
			while(age < 0){
				
				System.out.println("Please enter your age (years):");
				age = System.in.read();
				
			}
			
		}catch(IOException IOX){
			System.err.println(IOX);
		}
//		StringBuffer inputBuffer = new StringBuffer(30);
		
		try{
//			inputChar = System.in.read();
			while(location < 0 || location > 11){
				System.out.println("Error. You're not in an existing location. Returning home.");
				location = 0;
				continue;
			}
			while(location == home){
				
				System.out.println("You are currently at your house. Where would you like to go?");
				System.out.println("	s- Store, b- Bank, w- Work, d- Downtown, r- Restaurant");
				System.out.println("	h- Stay home");
				location = 0;
				inputChar = System.in.read();
				
				if((char)inputChar == 's'){
					location = 1;
					continue;
				}else if((char)inputChar == 'w'){
					location = 2;
					continue;
				}else if((char)inputChar == 'b'){
					location = 3;
					continue;
				}else if((char)inputChar == 'd'){
					location = 4;
					continue;
				}else if((char)inputChar == 'r'){
					location = 5;
					continue;
				}else if((char)inputChar == 'h'){
					location = 6;
					continue;
				}else{
					System.out.println("Invalid location. Please try again.");
				}
			}
			
			while(location == store){
				
				System.out.println("You are currently at the store. What will you buy?");
				System.out.println("	i- Ingredients ($1), w- Water (500mL) ($2), s- Soda ($2), n- Newspaper ($0), b- Beer (six pack) ($9)");
				System.out.println("	c- Cigarettes ($8), h- Go back home");
				inputChar = System.in.read();
				if((char)inputChar == 'i'){
					
					System.out.println("");
					System.out.println("You bought 1 Ingredients.");
					money =- 1;
					ingredients++;
					System.out.println("You now have $" + money);
					System.out.println("");
					continue;
					
				}else if((char)inputChar == 'w'){
					
					System.out.println("");
					System.out.println("You bought 500mL of water.");
					money =- 2;
					mLofWater =+ 500;
					System.out.println("You now have $" + money);
					System.out.println("");
					continue;
					
				}else if((char)inputChar == 's'){
					
					System.out.println("");
					System.out.println("'Reach for Juggernog tonight, sugar seduction delight!");
					System.out.println("When you need to feel big and strong, reach for Juggernog tonight!'");
//										^^that's the juggernog jingle lol
					System.out.println("");
					System.out.println("You bought a soda.");
					money =- 2;
					sodas++;
					System.out.println("You now have $" + money);
					System.out.println("");
					continue;
					
				}else if((char)inputChar == 'n'){
					
					if(newspaperIsOwned){
						
						System.out.println("You already have the paper!");
						System.out.println("");
						continue;
						
					}else{
						
						System.out.println("You took today's paper.");
						newspaperIsOwned = true;
						System.out.println("");
						continue;
						
					}
					
				}else if((char)inputChar == 'b'){
					
					System.out.println("ID Please.");
					System.out.println("");
					if(age < 21){
						System.out.println("You must be over 21 years of age to purchase alcoholic beverages.");
						System.out.println("");
						continue;
					}else if(age >= 21){
						System.out.println("You bought a six pack of beer. Don't forget to crack open a cold one with the boys every Saturday.");
						money =- 9;
						beer =+ 6;
						System.out.println("You now have $" + money);
						System.out.println("");
						continue;
					}else{
						System.out.println("Error: Age not properly defined. Please restart the program.");
						break;
					}
					
				}else if((char)inputChar == 'c'){
					
					System.out.println("You bought a pack of cigarettes.");
					money =- 8;
					cigarettes =+ 12;
					System.out.println("You now have $" + money);
					System.out.println("");
					continue;
					
				}else if((char)inputChar == 'h'){
					
					System.out.println("Returning home...");
					System.out.println("");
					location = 0;
					continue;
					
				}else{
					
					System.out.println("Error. Please enter valid item.");
					continue;
					
				}
				
			}
			
			while(location == work){
				
//				LOOOL ik work is broken af
				
				int hours;
				hours = 0;
				System.out.println("You're at work. How many hours will you put in? (enter 0 to go back home)");
				hours =+ System.in.read();
				if(hours > 1){
					
					int moneyEarned;
					moneyEarned = (hours * 10);
					money =+ moneyEarned;
					System.out.println("You earned $" + moneyEarned + ".");
					hours = 0;
					System.out.println("You now have $" + money);
					System.out.println("");
					continue;
					
				}else if(hours == 0){
					
					System.out.println("Returning home...");
					location = 0;
					System.out.println("");
					continue;
					
				}else{
					
					System.out.println("You have to work at least 1 hour.");
					System.out.println("");
					continue;
					
				}
				
			}
			
			while(location == bank){
				
				int depositAmt, withdrawAmt;
				depositAmt = 0; withdrawAmt = 0;
				System.out.println("You are currently at the bank. What would you like to do?");
				System.out.println("d- Deposit, w- Withdraw, b- Check balance, h- Go back home");
				inputChar = System.in.read();
				
				if(inputChar == 'd'){
					
					System.out.println("How much money would you like to deposit?");
					depositAmt = System.in.read();
					if(depositAmt > money){
						
						System.out.println("You dont have $" + depositAmt + " to deposit!");
						continue;
						
					}else{
						
						money =- depositAmt;
						moneyInBank =+ depositAmt;
						System.out.println("You deposited $" + depositAmt + ".");
						System.out.println("You now have $" + money + " in pocket, and $" + moneyInBank + " in the bank.");
						System.out.println("");
						
					}
					continue;
					
				}else if(inputChar == 'w'){
					
					System.out.println("How much money would you like to withdraw?");
					withdrawAmt = System.in.read();
					
					if(withdrawAmt > moneyInBank){
						
						System.out.println("You withdrew $" + withdrawAmt + ".");
						moneyInBank =- withdrawAmt;
						money =+ withdrawAmt;
						System.out.println("You now have $" + money + " in pocket, and $" + moneyInBank + " in the bank.");
						continue;
						
					}else{
						
						System.out.println("You don't have $" + withdrawAmt + " to withdraw!");
						continue;
						
					}
					
				}else if(inputChar == 'b'){
					
					System.out.println("You have $" + money + " in pocket, and $" + moneyInBank + " in the bank.");
					continue;
					
				}else if(inputChar == 'h'){
					
					System.out.println("Returning home...");
					System.out.println("");
					location = 0;
					continue;
					
				}else{
					
					System.out.println("Error. Please enter valid option.");
					
				}
			}
			
			while(location == downtown){
				System.out.println("Under construciton. Returning home...");
				System.out.println("");
				location = 0;
				continue;
			}
			
			while(location == restaurant){
				
				int cost = 0; int drinkOrder = 0;
				int restaurantWater, restaurantSoda, restaurantJuice, restaurantBeer, restaurantShake;
				int burgers, steak, pizza, chicken;
				burgers = 0; steak = 0; pizza = 0; chicken = 0;
				restaurantWater = 0; restaurantSoda = 0; restaurantJuice = 0; restaurantBeer = 0; restaurantShake = 0;
				System.out.println("You are now at the restaurant. What would you like to drink?");
				System.out.println("w- water ($0), s- soda ($2), j- juice ($2), b- beer ($4), m- milkshake ($4)");
				drinkOrder = System.in.read();
				if(drinkOrder == 'w'){
					
					System.out.println("You ordered a water.");
					restaurantWater++;
					continue;
					
				}else if(drinkOrder == 's'){
					
					System.out.println("You ordered a soda.");
					cost =+ 2;
					restaurantSoda++;
					continue;
					
				}else if(drinkOrder == 'j'){
					
					System.out.println("You ordered some juice.");
					cost =+ 2;
					restaurantJuice++;
					continue;
					
				}else if(drinkOrder == 'b'){
					
					if(age < 21){
						
						System.out.println("You must be over 21 years of age to purchase alcoholic beverages.");
						
					}else{
						
						System.out.println("You ordered a beer.");
						cost =+ 4;
						restaurantBeer++;
						
					}
					
				}else if(drinkOrder == 'm'){
					
					System.out.println("You ordered a shake.");
					cost =+ 4;
					restaurantShake++;
					
				}else{
					
					System.out.println("Please enter a valid option.");
					continue;
										
				}
				
				int entreeOrder = 0;
				entreeOrder = System.in.read();
				System.out.println("Here are your drink(s).");
				System.out.println("What would you like to eat?");
				System.out.println("b- Hamburger ($6), s- Steak ($15), p- Pizza (small pie) ($8), c- Chicken breast ($10)");
				if(entreeOrder == 'b'){
					
					System.out.println("You ordered a burger.");
					cost += 6;
					burgers++;
					
				}else if(entreeOrder == 's'){
					
					System.out.println("You ordered a steak.");
					cost += 15;
					steak++;
					
				}else if(entreeOrder == 'p'){
					
					System.out.println("You ordered pizza.");
					cost += 8;
					pizza++;
					
				}else if(entreeOrder == 'c'){
					
					System.out.println("You ordered a chicken breast.");
					cost += 10;
					chicken++;
					
				}else{
					
					System.out.println("Please enter a valid option.");
					continue;
					
				}
				
				System.out.println("");
				System.out.println("Your food is here.");
				System.out.println("enter- Eat");
				System.in.read();
				System.out.println("Nom nom nom... *burp*");
				System.out.println("Yum.");
				System.out.println("enter- Accept check ($" + cost + ")");
				System.out.println("Here is the check.");
				StringBuffer receipt = new StringBuffer("You ordered ");
				if(restaurantWater > 0){
					receipt.append(restaurantWater + "water(s)");
				}if(restaurantSoda > 0){
					receipt.append(restaurantSoda + "soda(s)");
				}if(restaurantJuice > 0){
					receipt.append(restaurantJuice + "glass(es) of juice");
				}if(restaurantBeer > 0){
					receipt.append(restaurantBeer + "beer(s)");
				}if(restaurantShake > 0){
					receipt.append(restaurantShake + "shake(s)");
				}if(burgers > 0){
					receipt.append(", " + burgers + "burger(s)");
				}if(steak > 0){
					receipt.append(", " + steak + "steak(s)");
				}if(pizza > 0){
					receipt.append(", " + pizza + "pizza(s)");
				}if(chicken > 0){
					receipt.append(", " + chicken + "chicken breast(s)");
				}
				receipt.append(".");
				System.out.println("That'll be $" + cost + ".");
				System.out.println("enter- Pay check");
				System.in.read();
				money =- cost;
				System.out.println("Press any key to go home.");
				System.in.read();
				location = 0;
				continue;
				
			}
			
			while(location == homeAlt){

				System.out.println("You'll stay at home for now. What would you like to do here?");
				System.out.println("c- Cook e- Eat/Drink t- Watch television c- Go for a smoke s- Sleep");
				System.out.println("i- Take inventory, g- Go somewhere");
				inputChar = System.in.read();
				if(inputChar != 'g'){
					System.out.println("Error. Your house isn't finished yet. Thank you for your patience! :D");
					System.out.println("Enter 'g' to go somewhere else.");
					continue;
				}else{
					location = 0;
					continue;
				}
				
			}
			
		}catch(IOException IOX){
			System.err.println(IOX);
		}
	}
}
