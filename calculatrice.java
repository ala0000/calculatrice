package calculatrice;

	public class calculatrice {

	    public static double addition(double a, double b) {
	        return a + b;
	    }

	    public static double soustraction(double a, double b) {
	        return a - b;
	    }

	    public static double multiplication(double a, double b) {
	        return a * b;
	    }

	    public static double division(double a, double b) throws ArithmeticException {
	        if (b == 0) {
	            throw new ArithmeticException("Division par zero impossible.");
	        }
	        return a / b;
	    }
	}

	
