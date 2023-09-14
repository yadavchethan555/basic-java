class OttPlatform{
	
	String movieNames[] = new String[4];
		int index;

    public boolean addMovieName(String movieName){
	
	System.out.println("Inside addMovieName()");
	boolean isAdded = false;
	if(movieNames != null){
		
	      System.out.println("validation is proper...proceed to addMovieName");
		
		movieNames[index] = movieName;
		  index++;
		  isAdded = true;
		  
   System.out.println(movieName + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getmovieNames(){
		
	for(int index=0; index<movieNames.length;index++){
		
		
	
       System.out.println(movieNames[index]);	
	}
		
	}	
		
	}
	
	


