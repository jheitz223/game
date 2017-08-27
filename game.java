package game;

import java.util.Scanner;
import java.io.IOException;

//	by JONATHAN HEITZ
//	fueled by Dubstep

/*
 * 	To-Do:
 * 	-finish loops for all locations
 * 	-find a method of numeric input
 * 	-fix 'work'
 */

@SuppressWarnings("unused")
public class game{
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		int inputChar;
		
//		Items:
		int location, money, ingredients, meals, mLofWater, sodas, beer, cigarettes;
		boolean newspaperIsOwned;
		
//		Locations:
		int home, store, work, bank, downtown, restaurant, homeAlt, kitchen, kitchenAlt, 
			livingRoom, yard, bedroom;
		
//		Input variables:
		char oneKeyHit, twoKeyHit, threeKeyHit, fourKeyHit, fiveKeyHit, 
			sixKeyHit, sevKeyHit, eightKeyHit, nineKeyHit, zeroKeyHit;

//		Player status variables:		
		newspaperIsOwned = false; location = 0; money = 3000; ingredients = 0;
		meals = 0; mLofWater = 0; sodas = 0; beer = 1;
		
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
				System.out.println("Under construction. Returning home...");
				System.out.println("");
				location = 0;
				continue;
			}
			
			while(location == downtown){
				System.out.println("Under construciton. Returning home...");
				System.out.println("");
				location = 0;
				continue;
			}
			
			while(location == restaurant){
				System.out.println("Under construction. Returning home...");
				System.out.println("");
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
