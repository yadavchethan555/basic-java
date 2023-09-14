class ChatShop{
	
	String chatNames[] = new String[10];
		int index;

    public boolean addChatName(String chatName){
	
	System.out.println("Inside addChatName()");
	boolean isAdded = false;
	if(chatNames != null){
		
	      System.out.println("validation is proper...proceed to addChatName");
		
		chatNames[index] = chatName;
		  index++;
		  isAdded = true;
		  
   System.out.println(chatName + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getchatNames(){
		
	for(int index=0; index<chatNames.length;index++){
		
		
	
       System.out.println(chatNames[index]);	
	}
		
	}	
		
	}
	
	


