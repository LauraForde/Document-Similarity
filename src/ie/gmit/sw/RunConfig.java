package ie.gmit.sw;

import java.util.concurrent.*;

import ie.gmit.sw.DocJobNum;

public class RunConfig {
	// Creating two queues, on to track the jobs coming in and one to track the jobs going out
	// and what values both have
	private static ArrayBlockingQueue<DocJobNum> in;
	private static ConcurrentHashMap<Integer, ComparsionResults> out;

	private static int docJob;
	private static int count;
	
	// Method to initialse the variables
	public static synchronized void init(){
		in = new ArrayBlockingQueue<>(count);
		out = new ConcurrentHashMap<>();
	}
	
	// Methods to add to the job number and the count each time they are called upon
	public static int getDocJobNum(){
		docJob++;
		return docJob;
	}
	public static int getTotalCount(){
		count++;
		return count;
	}
	
	// Methods to get the in queue and out queue
	public static ArrayBlockingQueue<DocJobNum> getIn(){
		return in;
	}
	public static ConcurrentHashMap<Integer, ComparsionResults> getOut(){
		return out;
	}
}
