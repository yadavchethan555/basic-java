class CricketTeam{
	
	String playerNames[] = new String[11];
		int index;

    public boolean addPlayerName(String playerName){
	
	System.out.println("Inside addPlayerName()");
	boolean isAdded = false;
	if(playerNames != null){
		
	      System.out.println("validation is proper...proceed to addPlayerName");
		
		playerNames[index] = playerName;
		  index++;
		  isAdded = true;
		  
   System.out.println(playerName + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getplayerNames(){
		
	for(int index=0; index<playerNames.length;index++){
		
		
	
       System.out.println(playerNames[index]);	
	}
		
	}	
		
	}
	
	


