package firstListReview.BitsQuestion;

import java.io.IOException;

public class Bits {
	private boolean[] arrayBits;
	
	public Bits(int n){
		arrayBits = new boolean[n];
	}
	
	public Bits and(Bits a) throws IOException{
		if(arrayBits.length != a.getArrayBits().length)
			throw new IOException();
		for(int i = 0; i < arrayBits.length; i++)
			arrayBits[i] = arrayBits[i] && a.getArrayBits()[i];
		return this;
		
	}

	public boolean[] getArrayBits() {
		return this.arrayBits;
	}

	public void addBit(int b) {
		
	}
	public void modificarBit(){
		
	}


}
