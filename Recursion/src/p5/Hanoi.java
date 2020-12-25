package p5;

public class Hanoi {

	private int numDiscs;
	
	public Hanoi(int numDiscs) {
		this.numDiscs = numDiscs;
		//move the number of diss (numDiscs) from peg 1 to 
		//peg3 using peg2 as a temporary location
		moveDiscs(numDiscs, 1, 3, 2);
	}

	private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
	
		if(num > 0) {
			moveDiscs(num-1, fromPeg, tempPeg, toPeg);
			System.out.println("move a disc from peg " + fromPeg + "to peg" + toPeg) ;
			moveDiscs(num-1, tempPeg, toPeg, fromPeg);
		}
	}
	
	
}
