package plymorphysmcls;

public class Studentt {

	
	public String name;
	
	public Studentt(String name) {
		
		
	this.name = name;
	
	}
	
	void travel(String destination, Transport transport) {
		
		System.out.println(this.name + " is travelling to" + destination + " with"+ transport.name);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
