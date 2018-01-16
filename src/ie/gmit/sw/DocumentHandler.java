package ie.gmit.sw;

import java.io.*;
import java.util.*;

public class DocumentHandler {
	
	private int min = Integer.MAX_VALUE;
	boolean inDb;
	
	// Method to read in a sample of the document from the buffered reader
	public Set<String> getDocSample(BufferedReader doc) throws IOException{
		String sample = doc.readLine();
		Set<String> fullDets = new TreeSet<>();
		
		while(sample != null){
			fullDets.addAll(new ArrayList<String>(Arrays.asList(sample.split(" "))));
		}
		return fullDets;
	}
	
	// Method to compare two documents
	public HashMap<String, String> compare(Document doc, List<Document> listDoc){
		HashMap<String, String> ans = new HashMap<>();
		int hashCount = doc.getHashSize();
		
		// Move over the documents in the list
		for(Document docu : listDoc){
			Set<Integer> save = new TreeSet<>(doc.getMin());
			save.retainAll(docu.getMin());
			
			// Calculating if the documents are the same
			double same = (double)save.size() / hashCount * 100;
			// If they are print same to the console just for reference
			if(same == 100 && doc.getName().equals(docu.getName()))
				System.out.println("Same");
			// Add the name and the size of the tree set to the answer params
			ans.put(docu.getName(), String.valueOf(same));
		}
		return ans;
	}

}
