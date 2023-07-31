package plymorphysmcls;



public class Polymorphysmtest {

	public static void main(String[] args) {
		
		
		Studentt student1 = new Studentt("tasnim");
		Transport tr1 = new Bus(" blue bus");
		
		
		student1.travel(" Niter", tr1);
		
		
		
		Studentt student2 = new Studentt("rafid");
		Transport tr2 = new Train(" mtrack");
		
		student2.travel(" moon", tr2);
		
		
		Studentt student3 = new Studentt("tabassum");
		student3.travel(" new york", tr1);
		
		
		
		

	}

}
