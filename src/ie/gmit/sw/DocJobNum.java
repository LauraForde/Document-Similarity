package ie.gmit.sw;

import java.io.BufferedReader;

public class DocJobNum {
	
	private int jobNum;
	private String name;
	private BufferedReader br;
	
	public DocJobNum(int jobNum, String name, BufferedReader br){
		super();
		this.jobNum = jobNum;
		this.name = name;
		this.br = br;
	}

	// Getter and setter for job number, name of the document and the document itself from the buffered reader
	public int getJobNum() {
		return jobNum;
	}

	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

}
