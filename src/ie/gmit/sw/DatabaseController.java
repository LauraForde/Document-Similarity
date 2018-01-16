package ie.gmit.sw;

import java.io.IOException;
import java.util.*;
import com.db4o.*;
import com.db4o.ext.Db4oException;

import ie.gmit.sw.Document;

public class DatabaseController {
	String file;
	String pass;
	
	public DatabaseController(String file, String pass){
		super();
		this.file = file;
		this.pass = pass;
	}
	
	// Creating a List of type document
	public List<Document> getDocuments() throws IOException{
		List<Document> docs = new ArrayList<>();
		
		try{
			
		}catch(Db4oException db4oExp){
			System.out.println("Database error " + db4oExp.getMessage());
			db4oExp.printStackTrace();
		}
		
		return docs;
	}

}
