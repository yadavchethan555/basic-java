class JustEatExecuter{
	public static void main(String args []){
	double priceQuantity = JustEats.search("Fish Kholapuri", 5);
	System.out.println(  "The Price of Fish Kholapuri is "+  priceQuantity);
	
	priceQuantity = JustEats.search("Panner Masala",2);
	System.out.println( "The Price of Panner Masala  is " + priceQuantity);
	
	priceQuantity = JustEats.search("Jeera Rice",3);
	System.out.println( "The Price of Veg Biriyani is " + priceQuantity);
	
	priceQuantity = JustEats.search("Chicken Biriyani",4);
	System.out.println( "The Price of Chicken Biriyani is " + priceQuantity);
	
	
	}
}