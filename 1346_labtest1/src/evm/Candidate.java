package evm;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
	private String name;
	   private String logo;
	   private int number=0;
	   private List<Candidate> candidate;
       int votecount;
       public Candidate(){
    	   
       }
	   
	   public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Candidate(int number,String name,String logo,int votecount) {
	      this.number = number;
	      this.name = name;
	      this.logo = logo;
	      candidate = new ArrayList<Candidate>();
	      this.votecount=votecount;
	   }
	   public void display(){
		   System.out.println (number+" "+name+" "+logo+" number of votes:"+votecount);
	   }

	   public void add(Candidate c) {
	      candidate.add(c);
	   }

	   public void remove(Candidate c) {
	      candidate.remove(c);
	   }

	   public List<Candidate> getCandidate(){
	     return candidate;
	   }

	   public String toString(){
	      return ("number"+number+"name"+name+"logo"+logo);
	   }   
	}
       

