class FoodPandaExecutor{
	public static void main(String args []){
		
	double pricequantity = FoodPanda.search("Kushka",5);
	System.out.println( "The pricequantity of Kushka with price"+  pricequantity);
	
	pricequantity = FoodPanda.search("pizza",5);
	System.out.println( "The pricequantity of pizza with price " + pricequantity);
	
	pricequantity = FoodPanda.search("Veg Biriyani",6);
	System.out.println( "The pricequantity of Veg Biriyani with priceis " + pricequantity);
	
	pricequantity = FoodPanda.search("Chicken Biriyani",4);
	System.out.println( "The pricequantity of Chicken Biriyani with price is " + pricequantity);
	
	
	
	
	
	
	
	
	
	
	}
}