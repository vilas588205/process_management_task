package process_management_task;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

	public class processManager {
	    private List<Process> processes;
	    private LinkedList<Process> pendinghistory;
	    private LinkedList<Process> completedhistory;

	    public processManager() {
	        this.processes = new ArrayList<>();
	        this.pendinghistory = new LinkedList<>();
	        this.completedhistory = new LinkedList<>();
	    }

	    // Add a new process
	    public void addProcess(Process process) {
	        processes.add(process);
	        if ("Pending".equalsIgnoreCase(process.getstatus())) {
	            addpendingprocess(process);
	        }
	    }

	    // Remove a process by its ID
	    public boolean removeprocess(int processId) {
	        Process processToRemove = searchProcess(processId);
	        if (processToRemove != null) {
	            processes.remove(processToRemove);
	            return true;
	        }
	        return false;
	    }

	    // Search for a process by its ID
	    public Process searchProcess(int processId) {
	        for (Process process : processes) {
	            if (process.getprocessId() == processId) {
	                return process;
	            }
	        }
	        return null;
	    }

	    // List all processes
	    public List<Process> listAllProcesses() {
	        return new ArrayList<>(processes);
	    }

	    // Update the status of a process
	    public boolean updateProcessStatus(int processId, String newStatus) {
	        Process process = searchProcess(processId);
	        if (process != null) {
	            String oldStatus = process.getstatus();
	            process.setstatus(newStatus);
	            if ("Completed".equalsIgnoreCase(newStatus)) {
	                addcompletedprocess(process);
	            } else if ("Pending".equalsIgnoreCase(newStatus) && !"Pending".equalsIgnoreCase(oldStatus)) {
	                addpendingprocess(process);
	            }
	            return true;
	        }
	        return false;
	    }

	    // Add a pending process to the history
	    public void addpendingprocess(Process process) {
	        pendinghistory.add(process);
	    }

	    // Add a completed process to the history
	    public void addcompletedprocess(Process process) {
	        completedhistory.add(process);
	    }

	    // Get the history of pending processes
	    public List<Process> getpendingprocesseshistory() {
	        return new ArrayList<>(pendinghistory);
	    }

	    // Get the history of completed processes
	    public List<Process> getcompletedprocesseshistory() {
	        return new ArrayList<>(completedhistory);
	    }
	

	public static void main(String[] args) {
		
	}

}
