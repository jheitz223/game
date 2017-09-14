package game;

import java.util.Scanner;
import java.io.IOException;
import java.lang.StringBuffer;

//	Build 2303
//	
//	by JONATHAN HEITZ
//	fueled by Dubstep

/*
 * 	To-Do:
 * 	-finish loops for all locations
 * 	-use methods instead of loops for more efficiency
 * 	-figure out how to reference variables from different methods
 */

@SuppressWarnings("unused")
public class game{
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
//		Input variables:
		int inputChar1; int inputChar2; int inputChar3; int inputChar4;
		int depositAmt, withdrawAmt;
		
//		Items:
		int location, money, moneyInBank, ingredients, meals, mLofWater, sodas, beer, cigarettes;
		boolean newspaperIsOwned;
		
//		Locations:
		int home, store, work, bank, downtown, restaurant, homeAlt, kitchen, kitchenAlt, 
			livingRoom, yard, bedroom;
		
//		Player status variables:		
		newspaperIsOwned = false; location = 0; money = 3000; moneyInBank = 0;
		ingredients = 0; meals = 0; mLofWater = 0; sodas = 0; beer = 1; cigarettes = 0;
		
//		Locations:
		home = 0; store = 1; work = 2; bank = 3; downtown = 4; restaurant = 5; homeAlt = 6; 
		kitchen = 7; kitchenAlt = 8; livingRoom = 9; yard = 10; bedroom = 11;
		
		System.out.println("Hello. Please tell me your name.");
		Scanner nameIn = new Scanner(System.in);
		String name = nameIn.nextLine();
		System.out.println("Nice to meet you, " + name + "!");
		
		System.out.println("Please enter your age (years):");
		Scanner ageIn = new Scanner(System.in);
		int age = ageIn.nextInt();
		
		System.out.println("You have $" + money + " in pocket and $" + moneyInBank + " in the bank.");
		
		for(int x = 0; x == 0; x = 0){
			
		while(location < 0 || location > 11){
			System.out.println("\n\nError. You're not in an existing location. Returning home.");
			location = 0;
			continue;
		}
		
		while(location == home){
			
			System.out.println("\nYou are currently at your house. Where would you like to go?");
			System.out.println("	1- Store, 2- Bank, 3- Work, 4- Downtown, 5- Restaurant");
			System.out.println("	6- Stay home");
			location = 0;
			Scanner input1 = new Scanner(System.in);
			inputChar1 = input1.nextInt();
			
			if(inputChar1 == 1){
				location = 1;
				continue;
			}else if(inputChar1 == 3){
				location = 2;
				continue;
			}else if(inputChar1 == 2){
				location = 3;
				continue;
			}else if(inputChar1 == 4){
				location = 4;
				continue;
			}else if(inputChar1 == 5){
				location = 5;
				continue;
			}else if(inputChar1 == 6){
				location = 6;
				continue;
			}else{
				System.out.println("\nInvalid location. Please try again.");
				
			}
		}
		
		while(location == store){
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("\nYou are currently at the store. What will you buy?");
			System.out.println("	1- Ingredients ($1), 2- Water (500mL) ($2), 3- Soda ($2), 4- Newspaper ($0), 5- Beer (six pack) ($9)");
			System.out.println("	6- Cigarettes ($8), 7- Go back home");
			inputChar2 = input2.nextInt();
			if(inputChar2 == 1){
				
				System.out.println("\nYou bought 1 Ingredients.");
				money -= 1;
				ingredients++;
				System.out.println("You now have $" + money + "\n");
				continue;
				
			}else if(inputChar2 == 2){
				
				System.out.println("You bought 500mL of water.\n");
				money -= 2;
				mLofWater += 500;
				System.out.println("You now have $" + money + "\n");
				continue;
				
			}else if(inputChar2 == 3){
				
				System.out.println("\nYou bought a soda.\n");
				money -= 2;
				sodas++;
				System.out.println("You now have $" + money + "\n");
				continue;
				
			}else if(inputChar2 == 4){
				
				if(newspaperIsOwned){
					
					System.out.println("You already have the paper!\n");
					continue;
					
				}else{
					
					System.out.println("You took today's paper.\n");
					newspaperIsOwned = true;
					continue;
					
				}
				
			}else if(inputChar2 == 5){
				
				System.out.println("\nID Please.\n");
				if(age < 21){
					System.out.println("You must be over 21 years of age to purchase alcoholic beverages.\n");
					continue;
				}else if(age >= 21){
					System.out.println("You bought a six pack of beer. Don't forget to crack open a cold one with the boys every Saturday.\n");
					money -= 9;
					beer += 6;
					System.out.println("You now have $" + money + "\n");
					continue;
				}else{
					System.out.println("\n\nError: Age not properly defined. Please restart the program.");
					break;
				}
				
			}else if(inputChar2 == 6){
				
				System.out.println("\nYou bought a pack of cigarettes.\n");
				money -= 8;
				cigarettes += 12;
				System.out.println("You now have $" + money + "\n");
				continue;
				
			}else if(inputChar2 == 7){
				
				System.out.println("\nReturning home...\n");
				location = 0;
				
			}else{
				
				System.out.println("\n\n\nError. Please enter valid item.\n");
				continue;
				
			}
			
		}
		
		while(location == work){
			
			int hours;
			hours = 0;
			System.out.println("You're at work. How many hours will you put in? (enter 0 to go back home)");
			Scanner hoursIn = new Scanner(System.in);
			hours += hoursIn.nextInt();
			if(hours > 1){
				
				int moneyEarned;
				moneyEarned = (hours * 10);
				money += moneyEarned;
				System.out.println("You earned $" + moneyEarned + ".");
				hours = 0;
				System.out.println("You now have $" + money + "\n");
				continue;
				
			}else if(hours == 0){
				
				System.out.println("\n\n\nReturning home...\n");
				location = 0;
				continue;
				
			}else{
				
				System.out.println("\n\nYou have to work at least 1 hour.\n");
				continue;
				
			}
			
		}
		
			while(location == bank){
			
			
			
		
			depositAmt = 0; withdrawAmt = 0;
		
			System.out.println("You are currently at the bank. What would you like to do?");
			System.out.println("	1- Deposit, 2- Withdraw, 3- Check balance, 4- Go back home");
			Scanner input3 = new Scanner(System.in);
			inputChar3 = input3.nextInt();
			
			if(inputChar3 == 1){
				
				Scanner depositIn = new Scanner(System.in);
				System.out.println("How much money would you like to deposit?");
				depositAmt = depositIn.nextInt();
				if(depositAmt > money){
					
					System.out.println("You dont have $" + depositAmt + " to deposit!");
					continue;
					
				}else{
					
					money -= depositAmt;
					moneyInBank += depositAmt;
					System.out.println("You deposited $" + depositAmt + ".");
					System.out.println("You now have $" + money + " in pocket, and $" + moneyInBank + " in the bank.\n");
					
				}
				continue;
				
			}else if(inputChar3 == 2){
				
				Scanner withdrawIn = new Scanner(System.in);
				System.out.println("How much money would you like to withdraw?");
				withdrawAmt = withdrawIn.nextInt();
				
				if(withdrawAmt > moneyInBank){
					
					System.out.println("You withdrew $" + withdrawAmt + ".");
					moneyInBank -= withdrawAmt;
					money += withdrawAmt;
					System.out.println("You now have $" + money + " in pocket, and $" + moneyInBank + " in the bank.");
					continue;
					
				}else{
					
					System.out.println("You don't have $" + withdrawAmt + " to withdraw!");
					continue;
					
				}
				
			}else if(inputChar3 == 3){
				
				System.out.println("You have $" + money + " in pocket, and $" + moneyInBank + " in the bank.");
				continue;
				
			}else if(inputChar3 == 4){
				
				System.out.println("Returning home...\n");
				location = 0;
				continue;
				
			}else{
				
				System.out.println("\n\n\nError. Please enter valid option.");
				
			}
		}
		
		while(location == downtown){
			System.out.println("\n\nUnder construciton. Returning home...");
			location = 0;
			continue;
		}
		
		while(location == restaurant){
			
			Scanner drinkIn = new Scanner(System.in);
			int cost = 0;
			int restaurantWater, restaurantSoda, restaurantJuice, restaurantBeer, restaurantShake;
			int burgers, steak, pizza, chicken;
			burgers = 0; steak = 0; pizza = 0; chicken = 0;
			restaurantWater = 0; restaurantSoda = 0; restaurantJuice = 0; restaurantBeer = 0; restaurantShake = 0;
			System.out.println("You are now at the restaurant. What would you like to drink?");
			System.out.println("	1- water ($0), 2- soda ($2), 3- juice ($2), 4- beer ($4), 5- milkshake ($4)");
			int drinkOrder = drinkIn.nextInt();
			if(drinkOrder == 1){
				
				System.out.println("You ordered a water.");
				restaurantWater++;
				
			}else if(drinkOrder == 2){
				
				System.out.println("You ordered a soda.");
				cost += 2;
				restaurantSoda++;
				
			}else if(drinkOrder == 3){
				
				System.out.println("You ordered some juice.");
				cost += 2;
				restaurantJuice++;
				
			}else if(drinkOrder == 4){
				
				if(age < 21){
					
					System.out.println("You must be over 21 years of age to purchase alcoholic beverages.");
					
				}else{
					
					System.out.println("You ordered a beer.");
					cost += 4;
					restaurantBeer++;
					
				}
				
			}else if(drinkOrder == 5){
				
				System.out.println("You ordered a shake.");
				cost += 4;
				restaurantShake++;
				
			}else{
				
				System.out.println("Please enter a valid option.");
				continue;
									
			}
			
			Scanner entreeIn = new Scanner(System.in);
			System.out.println("\n\nHere are your drink(s).\n");
			System.out.println("\nWhat would you like to eat?");
			System.out.println("	1- Hamburger ($6), 2- Steak ($15), 3- Pizza (small pie) ($8), 4- Chicken breast ($10)\n");
			int entreeOrder = entreeIn.nextInt();
			if(entreeOrder == 1){
				
				System.out.println("You ordered a burger.");
				cost += 6;
				burgers++;
				
			}else if(entreeOrder == 2){
				
				System.out.println("You ordered a steak.");
				cost += 15;
				steak++;
				
			}else if(entreeOrder == 3){
				
				System.out.println("You ordered pizza.");
				cost += 8;
				pizza++;
				
			}else if(entreeOrder == 4){
				
				System.out.println("You ordered a chicken breast.");
				cost += 10;
				chicken++;
				
			}else{
				
				System.out.println("\n\n\nPlease enter a valid option.");
				continue;
				
			}
			
			System.out.println("\n\nYour food is here.");
			System.out.println("enter- Eat");
			Scanner asdf = new Scanner(System.in);
			Scanner asdf1 = new Scanner(System.in);
			Scanner asdf2 = new Scanner(System.in);
			Scanner asdf3 = new Scanner(System.in);
			Scanner asdf4 = new Scanner(System.in);
			Scanner asdf5 = new Scanner(System.in);
			String asdfjkl = asdf1.nextLine();
			System.out.println("Nom nom nom... *burp*");
			System.out.println("Yum.");
			System.out.println("enter- Accept check ($" + cost + ")");
			String asdfjklasdf = asdf2.nextLine();
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
			String asdfa = asdf2.nextLine();
			money -= cost;
			System.out.println("Press any key to go home.");
			String asdfb = asdf3.nextLine();
			location = 0;
			continue;
			
		}
		
		while(location == homeAlt){

			System.out.println("\nYou'll stay at home for now. What would you like to do here?");
			System.out.println("	1- Cook 2- Eat/Drink 3- Watch television 4- Go for a smoke 5- Sleep");
			System.out.println("	6- Take inventory, 7- Go somewhere");
			Scanner input4 = new Scanner(System.in);
			inputChar4 = input4.nextInt();
			if(inputChar4 != 7){
				System.out.println("\n\n\nError. Your house isn't finished yet. Thank you for your patience! :D\n");
				System.out.println("Enter 7 to go somewhere else.");
				continue;
			}else{
				location = 0;
				continue;
			}
			
		}
	}
}
}