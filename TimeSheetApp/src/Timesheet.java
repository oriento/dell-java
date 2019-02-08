import java.util.*;

public class Timesheet {
	/**
	 * Member variable:
private List<TimesheetEntry> database
Note: You will have to import java.util.List and java.util.ArrayList
Constructor:
No arguments
Your constructor should:
Initialize database to a new ArrayList<>

	 */
	
	public List<String> database;
	
	 {
		database = new ArrayList<>();
		
	}
	 public List<String> getDatabase() {
			return database;
		}
		
		public void setDatabase(List<String> x) {
			database = x;
		}
		public void addDatabase(String project, String task) {
			database.add(project);
			database.add(task);
		}

}
