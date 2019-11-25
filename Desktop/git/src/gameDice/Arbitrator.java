package gameDice;

public class Arbitrator {
	int[] turn;
    Player winner;
	private boolean stopGame;
	//constructor
	public Arbitrator() {
		this.stopGame = false;
		this.setTurn();
	}
	// invite player
	public void invitePlayer(Player a) {
		System.out.println("Moi nguoi choi: " + a.getPlayerName() );
	}
		
	// count Player Points
	public void countPoints(Player a, int point) {
		
		int tmpPoint = a.getCurrentPoints() + point;
		if(tmpPoint == 21) {
			a.setCurrentPoints(tmpPoint);
			a.setWin(true);
			this.winner = a;
			this.setStopGame(true);
		}
		else if(tmpPoint > 21) {
			a.setCurrentPoints(0);
		}
		else {
			a.setCurrentPoints(tmpPoint);
		}
		
		
	}
	
	
	// result
	public void displayResult(Player a) {
		System.out.println("Nguoi thang cuoc: " +  a.getCurrentPoints());
	}
	public boolean getStopGame() {
		return stopGame;
	}
	public void setStopGame(boolean stop) {
		this.stopGame = stop;
	}

	//set turn
	public int[] setTurn() {
		return this.turn = new int[] {4,2,3,1};
	}

}
