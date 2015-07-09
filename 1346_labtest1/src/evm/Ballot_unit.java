package evm;

public class Ballot_unit {
	Ballot_panel bp=new Ballot_panel();

	private State state;

	   public Ballot_unit(){
	      state = null;
	   }

	   public State getState(){
	      return state;
	   }

	   public void setState(State state){
		      this.state = state;		
		   }

}
