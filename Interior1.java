class Interior1{
	         //array variable
	String materialNames[] = new String[15];
		int index;
		
      //create/add/save
    public boolean addMaterialName(String materialName){
	
	System.out.println("Inside addMaterialName()");
	boolean isAdded = false;
	if(index < materialNames.length){
		//this is done to check length of array
	if(materialNames != null){
		boolean exists = checkIfMaterialNameisExists(materialName);
		if(exists == false){
		
	System.out.println("validation is proper...proceed to addMaterialName");
		//materialName[0] = "Playwood"
		materialNames[index] = materialName;
		  index++;
		  isAdded = true;
		  
   System.out.println(materialName + " is added successfully ");		  
	
	}
	}
	else{
		System.out.println("Moviename size is full..can not add more movies");
	}
	
	return isAdded;	
	
	}
	         
	public void getmaterialsNames(){
		
	for(int index=0; index<materialNames.length;index++){
		
		
	
       System.out.println(materialNames[index]);	
	}
	
	
		
	}	
	
		
	}
	
	


