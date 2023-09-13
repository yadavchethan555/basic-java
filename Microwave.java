class Microwave{

   static  boolean isConnected;
   static int maxTemperature=10;
   static int currentTemperature;
   static int minTemperature;
   
   
  public static boolean onOroff(){
	  
  System.out.println("Start of onOroff");
  
  if(isConnected==false){
	  isConnected=true;
	  System.out.println("Oven Turned On.....Enjoy");
                                     }
									 
  else if(isConnected==true){
	  isConnected=false;
	  System.out.println("System Turned Off");
                 }
										  
  System.out.println("End of onOroff");
  return isConnected;
                 }
	public static int increaseTemperature(){
									
	System.out.println("Start Of Increasing Temperature");
									
	if(isConnected==true){
										
 if(currentTemperature<maxTemperature){
	currentTemperature=currentTemperature+1;
	System.out.println("Your System Temperature is Increased To " + currentTemperature);
									 }
 else{
 System.out.println("You Are Reached Maximum Temperature");
	}
			}
 else{
 System.out.println("Please Turned On Your Device");
	}	
											
     System.out.println("End Of Increasing Temperature");		
         return currentTemperature;							 
	}							   
															   
	public static int decreaseTemperature(){
																   
 System.out.println("Start Of Decreasing Temperature");	
																   
 if(isConnected==true){
																	   
 if(currentTemperature>minTemperature){
	 currentTemperature = currentTemperature-1;
	 System.out.println("Temperature Is Decreased To  " + currentTemperature);	
						   }
	else{
	System.out.println("You Are Reached Minimum Temperature");	
	    }
						 }
																									
 else{
 System.out.println("Please Turned On Your Oven");
	}
																   	   
System.out.println("End Of Decreasing Temperature");	
return currentTemperature;
	 }							   

}