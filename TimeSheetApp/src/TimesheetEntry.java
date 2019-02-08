import java.time.LocalDateTime;

public class TimesheetEntry {
	/**
	 * 
Static variable:
private static int NEXTID = 1
Constructor:
Two arguments: String myProject and String myTask
Your constructor should:
Initialize member variables projectName and task
Initialize startTime to LocalDateTime.now()
Initialize id to the current value of NEXTID
Increment NEXTID
Methods:
Getters for all five member variables (setters optional)
Implement a method called updateEndTime():
If endTime has not been set, set it to LocalDateTime.now()
Otherwise, do nothing (for now)

	 * 
	 */
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public static int getNEXTID() {
		return NEXTID;
	}

	public static void setNEXTID(int nEXTID) {
		NEXTID = nEXTID;
	}

	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++; 
	}
	
	public void updateEndTime() {
		if (this.endTime==null) {
			this.endTime=LocalDateTime.now();
		}
	}
	

}
