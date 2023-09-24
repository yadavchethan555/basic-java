class ApplicationExecutor{

 public static void main(String args[]){
 
 Application app = new Application();
 app.setName("Phonepay");
 app.setSize(144.6);
 app.setVersion("5.0");
 app.setRatings("4.5");
 app.setNoOfDownloads(712355587);
 app.setCompanyName("Phone pay");
 
    PlayStore store = new PlayStore();
	
	
	//has-A relation
	store.application = app;
	store.managedBy = "Google";
	
	System.out.println(store.application.getName());
    System.out.println(store.application.getSize());
	System.out.println(store.application.getVersion());
	System.out.println(store.application.getRatings());
    System.out.println(store.application.getNoOfDownloads());
	System.out.println(store.application.getCompanyName());
 }



}