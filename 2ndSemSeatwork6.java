class Person {
    String name;
    
    
       void displayName() {
		        System.out.println("Person name: " + name);
		    }
		}

public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = null;
		p1.name = "dennnnn";
		p2.name = "canonizado";
	
		p1.displayName();
		p2.displayName();
	
	
	try {
		        p3.displayName();
		    } catch (Exception e) {
		        System.out.println("Error: person object is not created");
	}
}
}
