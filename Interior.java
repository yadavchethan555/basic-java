class Interior{
	
	String materialNames[] = new String[10];
		int index;

    public boolean addMaterialName(String materialName){
	
	System.out.println("Inside addMaterialName()");
	boolean isAdded = false;
	if(materialNames != null){
		
	      System.out.println("validation is proper...proceed to addMaterialName");
		
		materialNames[index] = materialName;
		  index++;
		  isAdded = true;
		  
   System.out.println(materialName + " is added successfully ");		  
	
	}
	return isAdded;	
	
	}
	
	public void getmaterialsNames(){
		
	for(int index=0; index<materialNames.length;index++){
		
		
	
       System.out.println(materialNames[index]);	
	}
		
	}	
		
	}
	
	


