class Spotify{
	
	String songNames[] = new String[11];
		int index;

    public boolean addSongName(String songName){
	
	System.out.println("Inside addSongName()");
	boolean isAdded = false;
	if(songNames != null){
		
	      System.out.println("validation is proper...proceed to addSongName");
		
		songNames[index] = songName;
		  index++;
		  isAdded = true;
		  
   System.out.println(songName + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getsongNames(){
		
	for(int index=0; index<songNames.length;index++){
		
		
	
       System.out.println(songNames[index]);	
	}
		
	}	
		
	}
	
	


