class CellExecutor{

 public static void main(String args[]){
 
 Cell cel = new Cell();
 cel.setType("Mens Watch");
 cel.setPrice(1300);
 cel.setColour("Silver Colour");
 cel.setCompanyName("Fastrack");
 cel.setShopName("Sangya Times");
 
    Watch watch = new Watch();
	
	
	//has-A relation
	watch.cell = cel;
	watch.managedBy = "Tata Group";
	
	System.out.println(watch.cell.getType());
    System.out.println(watch.cell.getPrice());
	System.out.println(watch.cell.getColour());	
	System.out.println(watch.cell.getCompanyName());
	System.out.println(watch.cell.getShopName());
 }

}