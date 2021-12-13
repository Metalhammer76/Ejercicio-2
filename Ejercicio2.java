
public class Main{

static int suma(int a, int b){
    int c;
    c = a + b;
    return c;
}
	public static void main(String[] args) {
	    
	    /*
	    int a = base imponible
	    int b = impuesto 
	    int c = precio
	    
	    c = a + a*21/100
	    */
	    
	    int a;
	    int b;
	    int c;
	    a = 1000;
	    b = a*21/100;
	    c = a + b;
	    
	
	    System.out.println(" la suma de a y b es " + c );
	    
	}
}

