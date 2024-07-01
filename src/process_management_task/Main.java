package process_management_task;

public class Main {

	public static void main(String[] args) {
	
		        processManager processManager = new processManager();

		        // Adding processes
		        Process process1 = new Process(1, "Process 1", "process is pending");
		        Process process2 = new Process(2, "Process 2", "process is running");
		        Process process3 = new Process(3, "Process 3",  "process has completed");

		        processManager.addProcess(process1);
		        processManager.addProcess(process2);
		        processManager.addProcess(process3);

		        // List all processes
		        System.out.println("all process");
		        for (Process pro1 : processManager.listAllProcesses()) {
		            System.out.println(pro1);
		        }

		        // Search for a process
		        Process searchedProcess = processManager.searchProcess(2);
		        System.out.println(" searched process");

		        // Update process status
		        processManager.updateProcessStatus(1, "running");
		        System.out.println("processes has updated");
		        for (Process pro2 : processManager.listAllProcesses()) {
		            System.out.println(pro2);
		        }

		        // Remove a process
		        processManager.removeprocess(3);
		        System.out.println("processes start after removal:");
		        for (Process pro3 : processManager.listAllProcesses()) {
		            System.out.println(pro3);
		        }

		        // Get pending processes history
		        System.out.println(" processes history is pending:");
		        for (Process pro4 : processManager.getpendingprocesseshistory()) {
		            System.out.println(pro4);
		        }

		        // Get completed processes history
		        System.out.println(" processes history has completed:");
		        for (Process pro5 : processManager.getcompletedprocesseshistory()) {
		            System.out.println(pro5);
		        }
		    }
		

	}


