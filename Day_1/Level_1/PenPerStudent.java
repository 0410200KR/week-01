public class PenPerStudent{
  public static void main(String[]args){
   
	  //creating variable totalPens and students
	  int totalPens = 14, students = 3;
	  
	  //creating variable for assign value
      int pensPerStudent = totalPens / students;
	  
	  //creating variable remainingPens
      int remainingPens = totalPens % students;
	  
	  // display result
      System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
		
    }
	
	
  }  