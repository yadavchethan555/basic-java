class GrubHubExecuter{
	public static void main(String args []){
		
		
	double priceWithQuantity = GrubHub.search("Fish Thali",3);
	System.out.println("The price of Fish Thali is "+  priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("yasham Palava",2);
	System.out.println( "The price of yasham Palava is " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Veg Biriyani",4);
	System.out.println( "The price of Veg Biriyani is " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Chicken Biriyani",5);
	System.out.println( "The price of Chicken Biriyani is " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Mutton Biriyani",6);
	System.out.println("The price of Mutton Biriyani is " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Curry",9);
	System.out.println("The price of Curry is  " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Mutton Chaps",3);
	System.out.println( "The price of Mutton Chaps is " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Panner Pasanda",4);
	System.out.println( "The price of Panner Pasanda is  " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Vegetable Curry",5);
	System.out.println( "The price of Vegetable Curry is  " + priceWithQuantity);
	
	priceWithQuantity = GrubHub.search("Vegetable Jalfrezi",6);
	System.out.println( "The price of Vegetable Jalfrezi is  " + priceWithQuantity);
	
	
	priceWithQuantity = GrubHub.search("Veg Salada",4);
	System.out.println("The price of Veg Salada is " + priceWithQuantity);
	
	
	}
}