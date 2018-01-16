package ie.gmit.sw;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.processing.Processor;

public class Runner implements Runnable{
	
	private static ArrayBlockingQueue<DocJobNum> in;
    private static ConcurrentHashMap<Integer, ComparsionResults> out;
    private int count;
    private DocJobNum docNum;
    private Document doc;
    private List<Document> comp;
    private ComparsionResults compRes;
    
    
    @Override
    public void run() {
	    //Get the queues and the workerNumber from the Processor before starting
		count = RunConfig.getTotalCount();
		in = RunConfig.getIn();
		out = RunConfig.getOut();
		try {
		    docNum = in.take(); // Take a job from the queue
		    doc = new Document(docNum.getName()); //get document from the Job
		    
		} catch (InterruptedException e) {
		    System.out.println(e.getMessage());
		}
    }

}
