package gameDice;


public class Game {
     int numberOfPlayer;
     Player[] lisPlayers;
     Arbitrator arb;
     String[] namePlayers = new String[] {"1", "2", "3", "4"};
	//constructor
     public Game(int num) {
    	 if(0 <= num && num <= 4) {
	    	 this.numberOfPlayer = num;
	    	 this.makePlayers(this.numberOfPlayer);
	    	 this.arb = new Arbitrator();
	    	 this.gameProccess(this.arb);
    	 }
    	 else {
			System.out.println("So luong nguoi choi tu 0 den 4 nguoi!");
		}
     }
     
     // method 
     public void makePlayers(int numOfPlayers) {
    	Player player1 = new Player(namePlayers[0]);
    	Player player2 = new Player(namePlayers[1]);
    	Player player3 = new Player(namePlayers[2]);
    	Player player4 = new Player(namePlayers[3]);
    	this.lisPlayers = new Player[] {player1,player2,player3,player4};
    	for(int i =0; i < numOfPlayers; i++) {
    		lisPlayers[i].setReal(true);
    	}
     }

     public void gameProccess(Arbitrator arb) {
  
    	 while(!arb.getStopGame()) {
  			for(int i: arb.turn) {
  				arb.invitePlayer(this.lisPlayers[i-1]);
  		
  				Dice dicePlayerChoose = this.lisPlayers[i-1].ChooseDice();
  				System.out.println("Nguoi choi chon suc sac loai : " + dicePlayerChoose.getType());
  				int faceValue = dicePlayerChoose.throwDice();
  				System.out.println("Gia tri cua suc sac: " + faceValue);
  				arb.countPoints(this.lisPlayers[i-1], faceValue);
  				
  				System.out.println("Diem cua nguoi choi " + this.lisPlayers[i-1].getPlayerName() + ": " + this.lisPlayers[i-1].getCurrentPoints());
  				System.out.println("");
  			}
  		}
     	System.out.println("");
 		System.out.println("Nguoi thang cuoc : " + arb.winner.getPlayerName());
 		for(Player player: lisPlayers) {
 			if(player != arb.winner) {
 				player.Emote();
 			}
 		}
     }
}
