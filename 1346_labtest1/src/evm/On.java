package evm;

public class On implements State{
	public void doAction(Ballot_unit context) {
	      System.out.println("Ballot panel is ready");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "On State";
	   }

}
