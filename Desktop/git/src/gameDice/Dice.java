package gameDice;
import java.util.Random;

public class Dice {
	private int type;
	private int faceValue;
	
	//constructor
	public Dice(int type) {
		this.setType(type);
	}
	//setter, getter
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	// methods
	public int throwDice() {
		int faceValues[] = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,this.getType()};
		Random rand = new Random();
		this.faceValue = faceValues[rand.nextInt(25)];
		return this.faceValue;
	}

}
