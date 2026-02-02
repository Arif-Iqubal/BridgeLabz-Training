package com.functionalinterface.backgroundjobexecution;

public class BackgroundJobExecution {

	public static void main(String[] args) {

		// Runnable task representing a background job
		Runnable backgroundTask = () -> {
			System.out.println("Background job started");
			try {
				Thread.sleep(2000); // simulating long-running task
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Background job completed");
		};

		// Executing task asynchronously using Thread
		Thread workerThread = new Thread(backgroundTask);
		workerThread.start();

		System.out.println("Main thread continues execution");
	}
}
