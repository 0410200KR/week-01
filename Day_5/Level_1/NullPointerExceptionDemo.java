

class NullPointerExceptionDemo {   
   public static void generateNullPointerException() {
        String k = null;
		// This will cause a NullPointerException
        
    
    
    // Method to handle NullPointerException
	
   
        try {
			
            System.out.println(k.length());
        }
		catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
		 
     generateNullPointerException();
    }
}
