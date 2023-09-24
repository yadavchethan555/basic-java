class KitchenExecutor{

   public static void main(String args[]){
	   
	   Kitchen reference = new Kitchen();
	   reference.setHotelName("Hotel Sagar");
	   reference.setPrice(70);
	   reference.setFavDish("Masala Dosa");
	   reference.setAddress("Rajajinagar");
       reference.setOwnerName("Rajanna");
	   
	   
       Hotel hotel = new Hotel();
       hotel.kitchen=reference;
       hotel.managedBy="Aahara Department";

       System.out.println("HotelName "+hotel.kitchen.getHotelName());
       System.out.println("Price "+hotel.kitchen.getPrice());
	   System.out.println("FavDish"+hotel.kitchen.getFavDish());
	   System.out.println("Address "+hotel.kitchen.getAddress());
	   System.out.println("OwnerName"+hotel.kitchen.getOwnerName());
   }

}