class Hotel{
	
	String menu[] = new String[10];
		int index;

    public boolean addMenu(String menuu){
	
	System.out.println("Inside addMenu()");
	boolean isAdded = false;
	if(menu != null){
		
	      System.out.println("validation is proper...proceed to addMenu");
		
		menu[index] = menuu;
		  index++;
		  isAdded = true;
		  
   System.out.println(menuu + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getmenu(){
		
	for(int index=0; index<menu.length;index++){
		
		
	
       System.out.println(menu[index]);	
	}
		
	}	
		
	}
	
	


