package ie.gmit.sw;

import java.io.IOException;
import com.db4o.*;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;
import com.db4o.ta.TransparentActivationSupport;
import com.db4o.ta.TransparentPersistenceSupport;

import xtea_db4o.XTeaEncryptionStorage;

public class Database {
	
	// Implementing the singleton style we learned in class
	private static volatile Database instance;
	private static Object obj = new Object();
	
	// Creating database object and taking in the name and password for the database
	private ObjectContainer dataCont;
	private String name;
	private String pass;
	
	public Database(String name, String pass) throws IOException{
		this.name = name;
		this.pass = pass;
		
		// Setting up the database, taken from the lab on Object Persistence
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().add(new TransparentActivationSupport());
		config.common().add(new TransparentPersistenceSupport());
		config.common().updateDepth(7);
		
		// Open the configured database
		this.dataCont = Db4oEmbedded.openFile(config, this.name);
	}
	
	// Method to try an retrieve all data from the database
	public ObjectSet<Object>getAllObj(Class objClass){
		Query q = this.dataCont.query();
		q.constrain(objClass);
		return q.execute();	
	}
	
	// Method to commit the object to the database
	public void commitObject(Object obj){
		this.dataCont.store(obj);
		this.dataCont.commit();
	}
	
	// Method to close the database connection and finalize the super class
	@Override
	protected void finalize() throws Throwable{
		this.dataCont.close();
		super.finalize();
	}

}
