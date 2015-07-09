package evm;

public class Off implements State{
	public void doAction(Ballot_unit context) {
	      System.out.println("Ballot panel is OFF");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "OFF State";
	   }

}
