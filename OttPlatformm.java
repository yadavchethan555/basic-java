class OttPlatformm{

String movieNames[]= new String [6];
int index;

public boolean addMovieName(String movieName){        

	System.out.println("Inside addMovieName()");
	boolean isAdded = false;
	if(index<movieNames.length){
  
  if(movieName != null){
  
	  
	boolean exists = checkIfMovieNameExists(movieName);
	if (exists==false){
	
	System.out.println("validation is proper..proceed to add movie");
	movieNames[index] = movieName;
	index++;
	isAdded = true;
	System.out.println(movieName +  " is added sucessfully  ");
}
else{
	System.out.println( movieName + " already exists");
}
  }}
else{
	
	System.out.println("No space to add movies");
  }
return isAdded;


}
public void getMovieNames(){
	for(int index=0;index<movieNames.length;index++){
		
		System.out.println(movieNames[index]);
	}
}
public boolean checkIfMovieNameExists(String movieName){
	
	boolean exists = false;
	for(int index=0;index<movieNames.length;index++){
	if(movieNames[index]==movieName){
		exists = true;
	}
}
return exists;
}
}