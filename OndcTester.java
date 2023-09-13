 class Ondc{
	
	public static double find(String foodName){
		
		double price = 0.0;
		System.out.println("Invoking the find");
		
		if(foodName == "Biriyani"){
			price = 200.00;
			return price;
		}
		if(foodName == "Tamal"){
			price = 199.00;
			return price;
		}
		if(foodName == "Dosa"){
			price = 72.00;
			return price;
		}
		if(foodName == "Idly"){
			price = 30.00;
			return price;
		}
		if(foodName == "Parrota"){
			price = 40;
			return price;
		}
		if(foodName == "Poha"){
			price = 207.00;
			return price;
		}
		if(foodName == "Samosa"){
			price = 80.00;
			return price;
		}
		if(foodName == "Poori"){
			price = 50.00;
			return price;
		}
		if(foodName == "Vade"){
			price = 28.00;
			return price;
		}
		if(foodName == "Upma"){
			price = 45.00;
			return price;
		}
		if(foodName == "Bajji"){
			price = 20.00;
			return price;
		}
		if(foodName == "Udina Vade"){
			price = 30.00;
			return price;
		}
		if(foodName == "Uppittu"){
			price = 70.00;
			return price;
		}
		if(foodName == "Rice and Sambar"){
			price = 90.00;
			return price;
		}
		if(foodName == "Masala Dosa"){
			price = 80.00;
			return price;
		}
		if(foodName == "Akuri"){
			price = 250.00;
			return price;
		}
		if(foodName == "Vada Pav"){
			price = 35.00;
			return price;
		}
		if(foodName == "Bisi Bele Bath"){
			price = 55.00;
			return price;
		}
		if(foodName == "Mushroom Biriyani"){
			price = 200.00;
			return price;
		}
		if(foodName == "Veg Biriyani"){
			price = 150.00;
			return price;
		}
		if(foodName == "Mutton Biriyani"){
			price = 350.00;
			return price;
		}
		if(foodName == "Egg Biriyani"){
			price = 120.00;
			return price;
		}
		if(foodName == "Biriyani"){
			price = 200.00;
			return price;
		}
		if(foodName == "Appum"){
			price = 200.00;
			return price;
		}
		if(foodName == "Luchi"){
			price = 270.00;
			return price;
		}
		if(foodName == "Lollipop"){
			price = 250.00;
			return price;
		}
		if(foodName == "Shawarma"){
			price = 100.00;
			return price;
		}
		if(foodName == "Momos"){
			price = 130.00;
			return price;
		}
		if(foodName == "Sandwich"){
			price = 200.00;
			return price;
		}
		if(foodName == "Gobi"){
			price = 100.00;
			return price;
		}
		if(foodName == "Noodles"){
			price = 250.00;
			return price;
		}
		if(foodName == "Kachori"){
			price = 200.00;
			return price;
		}
		if(foodName == "Dahipuri"){
			price = 50.00;
			return price;
		}
		if(foodName == "Masalapuri"){
			price = 40.00;
			return price;
		}
		if(foodName == "Panipuri"){
			price = 50.00;
			return price;
		}
		if(foodName == "Golguppa"){
			price = 30.00;
			return price;
		}
		if(foodName == "Strawberry Milkshake"){
			price = 120.00;
			return price;
		}
		if(foodName == "Oreo Shake"){
			price = 80.00;
			return price;
		}
		if(foodName == "Pazham"){
			price = 700.00;
			return price;
		}
		if(foodName == "Dhokla"){
			price = 170.00;
			return price;
		}
		if(foodName == "Pavbajji"){
			price = 60.00;
			return price;
		}
		if(foodName == "Butter Chicken"){
			price = 280.00;
			return price;
		}
		if(foodName == "Chicken Curry"){
			price = 300.00;
			return price;
		}
		if(foodName == "Mutton Kaima"){
			price = 240.00;
			return price;
		}
		if(foodName == "Chicken Korma"){
			price = 170.00;
			return price;
		}
		if(foodName == "Butternun"){
			price = 189.00;
			return price;
		}
		if(foodName == "Hidrabadi Biriyani"){
			price = 200.00;
			return price;
class OndcTester{
	
	public static void main(String args[]){
		
		System.out.println("Main Started");
		
	    double pricequantity = Ondc.find("Biriyani" , 2);
		System.out.println("The Price For Biriyani is   " + pricequantity);
		
		pricequantity = Ondc.find("Tamal",2);
		System.out.println("The Price For Tamal is   " + pricequantity);
		
		pricequantity = Ondc.find("Dosa",2);
		System.out.println("The Price For Dosa is   " + pricequantity);
		
		pricequantity= Ondc.find("Idly",2);
		System.out.println("The Price For Idly is   " + pricequantity);
		
		pricequantity = Ondc.find("Parrota",2);
		System.out.println("The Price For Parrota is   " + pricequantity);
		
		pricequantity= Ondc.find("Poha",3);
		System.out.println("The Price For Poha is   " + pricequantity);
		
		pricequantity = Ondc.find("Samosa",3);
		System.out.println("The Price For Samosa is   " + pricequantity);
		
		pricequantity = Ondc.find("Poori",4);
		System.out.println("The Price For Poori is   " + pricequantity);
		
		pricequantity= Ondc.find("Vade",5);
		System.out.println("The Price For Vade is   " + pricequantity);
		
		pricequantity = Ondc.find("Upma",3);
		System.out.println("The Price For Upma is   " + pricequantity);
		
		pricequantity = Ondc.find("Bajji",2);
		System.out.println("The Price For Bajji is   " + pricequantity);
		
		pricequantity = Ondc.find("Udina Vade",7);
		System.out.println("The Price For Udina Vade is   " + pricequantity);
		
		pricequantity = Ondc.find("Uppittu",9);
		System.out.println("The Price For Uppittu is   " + pricequantity);
		
		pricequantity= Ondc.find("Rice and Sambar",4);
		System.out.println("The Price For Rice and Sambar is   " + pricequantity);
		
		pricequantity = Ondc.find("Masala Dosa",8);
		System.out.println("The Price For Masala Dosa is   " + pricequantity);
		
		pricequantity = Ondc.find("Akuri",3);
		System.out.println("The Price For Akuri is   " + pricequantity);
		
		pricequantity = Ondc.find("Vada Pav",4);
		System.out.println("The Price For Vada Pav is   " + pricequantity);
		
		pricequantity = Ondc.find("Bisi Bele Bath",2);
		System.out.println("The Price For Bisi Bele Bath is   " + pricequantity);
		
		pricequantity = Ondc.find("Mushroom Biriyani",10);
		System.out.println("The Price For Mashroom Biriyani is   " + pricequantity);
		
		pricequantity = Ondc.find("Veg Biriyani",3);
		System.out.println("The Price For Veg Biriyani is   " + pricequantity);
		
		pricequantity= Ondc.find("Mutton Biriyani",7);
		System.out.println("The Price For Mutton Biriyani is   " + pricequantity);
		
		pricequantity = Ondc.find("Egg Biriyani",5);
		System.out.println("The Price For Egg Biriyani is   " + pricequantity);
		
		pricequantity= Ondc.find("Biriyani",9);
		System.out.println("The Price For Biriyani is   " + pricequantity);
		
		pricequantity= Ondc.find("Appum",2);
		System.out.println("The Price For Appum is   " + pricequantity);
		
		pricequantity= Ondc.find("Luchi",6);
		System.out.println("The Price For Luchi is   " + pricequantity);
		
		pricequantity = Ondc.find("Lollipop",4);
		System.out.println("The Price For Lollipop is   " + pricequantity);
		
		pricequantity= Ondc.find("Shawarma",5);
		System.out.println("The Price For Shawarma is   " + pricequantity);
		
		pricequantity = Ondc.find("Momos",7);
		System.out.println("The Price For Momos is   " + pricequantity);
		
		pricequantity = Ondc.find("Sandwich",2);
		System.out.println("The Price For Sandwich is   " + pricequantity);
		
		pricequantity = Ondc.find("Gobi",9);
		System.out.println("The Price For Gobi is   " + pricequantity);
		
		pricequantity = Ondc.find("Noodles",3);
		System.out.println("The Price For Noodles is   " + pricequantity);
		
		pricequantity = Ondc.find("Kachori",5);
		System.out.println("The Price For Kachori is   " + pricequantity);
		
		pricequantity= Ondc.find("Dahipuri",4);
		System.out.println("The Price For Dahipuri is   " + pricequantity);
		
		pricequantity= Ondc.find("Masalapuri",7);
		System.out.println("The Price For Masalapuri is   " + pricequantity);
		
		pricequantity= Ondc.find("Panipuri",4);
		System.out.println("The Price For Panipuri is   " + pricequantity);
		
		pricequantity = Ondc.find("Golguppa",4);
		System.out.println("The Price For Golguppa is   " + pricequantity);
		
		pricequantity = Ondc.find("Strawberry Milkshake",7);
		System.out.println("The Price For Strwaberry Milkshake is   " + pricequantity);
		
		pricequantity = Ondc.find("Oreo Shake",4);
		System.out.println("The Price For Oreo Shake is   " + pricequantity);
		
		pricequantity = Ondc.find("Pazham",2);
		System.out.println("The Price For Pazham is   " + pricequantity);
		
		pricequantity = Ondc.find("Dhokla",3);
		System.out.println("The Price For Dhokla is   " + pricequantity);
		
		pricequantity = Ondc.find("Pavbajji",6);
		System.out.println("The Price For Pavbajji is   " + pricequantity);
		
		pricequantity = Ondc.find("Butter Chicken",7);
		System.out.println("The Price For Butter Chicken is   " + pricequantity);
		
		pricequantity = Ondc.find("Chicken Curry",9);
		System.out.println("The Price For Chicken Curry is   " + pricequantity);
		
		pricequantity = Ondc.find("Mutton Kaima",3);
		System.out.println("The Price For Mutton Kaima is   " + pricequantity);
		
		pricequantity = Ondc.find("Chicken Korma",6);
		System.out.println("The Price For Chicken Korma is   " + pricequantity);
		
		pricequantity = Ondc.find("Butternun",4);
		System.out.println("The Price For Butternun is   " + pricequantity);
		
		pricequantity = Ondc.find("Hidrabadi Biriyani",5);
		System.out.println("The Price For Hidrabadi Biriyani is   " + pricequantity);
		
		pricequantity = Ondc.find("Mutton Rogan",2);
		System.out.println("The Price For Mutton Rogan is   " + pricequantity);
		
		pricequantity = Ondc.find("Chettinaad Mutton Masala",7);
		System.out.println("The Price For Chettinaad Mutton Masala is   " + pricequantity);
		
		pricequantity = Ondc.find("Chicken 65",5);
		System.out.println("The Price For Chicken 65 is   " + pricequantity);
		
		pricequantity = Ondc.find("Mutton Mappas",9);
		System.out.println("The Price For Mutton Mappas is   " + pricequantity);
		
		System.out.println("Main Ended");
		
		
	}
	
}