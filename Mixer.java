class Mixer{
    static String name = "Bajaj";

	static int minSpeed;
    static int currentSpeed;
    static int maxSpeed = 05;
	static boolean isConnected;
	
	 public static void increaseSpeed(){
		if(isConnected == false){
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed+1;
			System.out.println("The currentSpeed is"+currentSpeed);
			}
   else{
  System.out.println("Reached Max Speed");
  }
		
  }else{
		System.out.println("Turnon the Mixer first");
	         }		
			 }
		
		public static void decreaseSpeed(){
		if(isConnected == true){
		if(currentSpeed > minSpeed){
		currentSpeed = currentSpeed-1;
		System.out.println("The currentSpeed is "+ currentSpeed);
		}else{
	           System.out.println("Minimum Speed is reached");
			  }
			   
		}
		else{
		      System.out.println("Mixer is tuned off... can't decrease the Speed");
		}
	    }
		
        }
	
	
		
	
	
	
