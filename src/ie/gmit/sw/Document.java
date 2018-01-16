package ie.gmit.sw;

import java.util.*;

public class Document {
	
	private String name;
	// Using a two sets of hashs, they must be indentical for the documents that are compared
	private Set<Integer> min;
	private Set<Integer> hash;
	
	// Creating a super that takes in the name of the document and makes TreeSets for comparsion of the documents
	public Document(String name){
		super();
		this.name = name;
		min = new TreeSet<>();
	}
		
	// Creating another super that takes in all 3 variables, this will be used also for comparsion 	
	public Document(String name, Set<Integer> min, Set<Integer> hash){
			super();
			this.name = name;
			this.min = min;
			this.hash = hash;
	}
	
	// Creating a method to return the name of the document when callede
	public String getName(){
		return name;
	}

	// Creating getters and setter for the Sets
	public Set<Integer> getMin() {
		return min;
	}

	public void setMin(Set<Integer> min) {
		this.min = min;
	}

	public Set<Integer> getHash() {
		return hash;
	}

	public void setHash(Set<Integer> hash) {
		this.hash = hash;
	}
	
	// Method to get the size of the hash map for comparsion
	public int getHashSize(){
		return this.hash.size();
	}
	
	// Overriding the toString method and returning the name of the document
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String title = "Document is Named: " + name;
		return title;
	}
	
}
