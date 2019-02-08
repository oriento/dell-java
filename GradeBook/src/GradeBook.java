import java.util.*;
public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap to store names and favorite color
	    // Key: name, Value: favorite color
	    
	    Scanner reader = new Scanner(System.in);
	    String name="";
	    String grades="";
	    System.out.println("Enter number of Students ");
	    int numStudents = Integer.parseInt(reader.nextLine());
	    
	    HashMap<String, String> gradeBook = new HashMap<String, String>();
	    for(int i=0; i < numStudents; i++){
	    	System.out.println("What is your name?");
		      name = reader.nextLine();
		      System.out.println("Input Student grades?");
		      grades = reader.nextLine();
		      gradeBook.put(name, grades);
		      
		      System.out.println("these are the grades " +  gradeBook.get(name));
			   String[] gradesArr = gradeBook.get(name).split(",");
				int count = 0;
				for (int j=0; j<gradesArr.length;j++) {
					Integer num = Integer.parseInt(gradesArr[j]);
					count+=num;
				}
			    count /= gradesArr.length;
				System.out.println(name + "Average = " + count);
	    }
	    
	   
	   


	}

}
