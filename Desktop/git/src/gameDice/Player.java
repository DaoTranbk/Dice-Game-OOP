package gameDice;

import java.util.Random;

public class Player {	
	private String playerName;
	private int currentPoints;
	private boolean win;
	private boolean real;
	
	String[] emotion = new String[] {"Chuc mung ban da gianh chien thang", "Ban choi hay qua", "Ban that thong minh", "Buon qua a"};
	Random rand = new Random();
	
	//constructor
	public Player(String name) {
		this.setPlayerName(name);
		this.setCurrentPoints(0);
		this.setWin(false);
		this.setReal(false);
	}
	
	// setter & getter
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getCurrentPoints() {
		return currentPoints;
	}

	public void setCurrentPoints(int currentPoint) {
		this.currentPoints = currentPoint;
	}
	
	
	public boolean getWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}
	public boolean getReal() {
		return real;
	}

	public void setReal(boolean real) {
		this.real = real;
	}
	
	// show emotion
	public void Emote(){
		if(this.real != true) {
			System.out.println(this.getPlayerName() + ": " + emotion[rand.nextInt(4)]);
		}
	}
	
	//choose Dice
	public Dice ChooseDice() {
		
		int type = rand.nextInt(4)+1;
		Dice dice = new Dice(type);
		return dice;
	}
   
	
	

	
}
