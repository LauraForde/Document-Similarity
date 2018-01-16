package ie.gmit.sw;

import java.util.*;

public class ComparsionResults {

	private int job;
	private String name;
	private HashMap<String, String> ans;
	
	// Passing the parameters into a method and setting their values
	public ComparsionResults(int job, String name){
		this.job = job;
		this.name = name;
		ans = new HashMap<>();
	}
	
	// Getter for job number and name
	public int getJobNo(){
		return job;
	}
	public String getName(){
		return name;
	}
	
	// Adding the answers to the hash map
	public void add(HashMap<String, String> answer){
		ans.putAll(answer);
	}
	// Getting all the documents from the database and adding them to the map
	public Set<String> getDoc(){
		return ans.keySet();
	}
}
