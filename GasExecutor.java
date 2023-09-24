class GasExecutor{

public static void main(String args []){
	
	Gas ref = new Gas();
	ref.setName("Indane Gas");
	ref.setCapacity("50L");
	
	
	
	
	
	
	Cylinder ref1 = new Cylinder();
	ref1.gas = ref;
	
	
	
	System.out.println(ref1.gas.getName());
	System.out.println(ref1.gas.getCapacity());
		
		
}
}