package evm;

public class Main {

	public static void main(String[] args) {
		Ballot_unit bu=new Ballot_unit();
		 On on = new On();
	      on.doAction(bu);
	      System.out.println(bu.getState().toString());
	      
		Candidate c1=new Candidate(1,"rajkumar","cap",30);
		Candidate c2=new Candidate(2,"sham","aeroplane",40);
		c1.display();
		c2.display();
        
	}

}
