package s4_EstruturaSequencial;


	public class Dog {

	    private int instancias=3;

	    Dog(){

	        instancias++;

	    }

	    public int getInstancias() {

	        return instancias;

	    }

	    public static void main(String[] args) {

	        Dog bob = new Dog();

	        Dog rex = new Dog();

	        System.out.println("Imprime:" + 2 + 2);
	        

	    }

	}

