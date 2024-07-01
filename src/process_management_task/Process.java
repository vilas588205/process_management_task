package process_management_task;

public class Process {
	
	    private int processId;
	    private String processname;
	    private String status;

	    public Process(int processId, String processname, String status) {
	        this.processId = processId;
	        this.processname = processname;
	        this.status = status;
	    }
	    public int getprocessId() {
	        return processId;
	    }
	    public String getprocessname() {
	        return processname;
	    }
	    public String getstatus() {
	        return status;
	    }
	    public void setstatus(String status) {
	        this.status = status;
	    }
	    @Override
	    public String toString() {
	        return "process{" +     "processId=" + processId + ", processname='" + processname + '\'' +  ", status='" + status + '\'' +        '}';
	    }
	public static void main(String[] args) {
		
	}

}
