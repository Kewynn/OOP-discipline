package keepthreading.firstQuestion;

public class PrimeNumbers extends Thread{
	
	public final static int LENGTH = 10000;

	
	private int id;

	public PrimeNumbers(int id){
		this.id = id;
	}
	  
	private boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			if((number % i) == 0)
				return false;
		}
	    return true;
	}

	public void run(){
		int begin = id * LENGTH + 1;
		int end = (id + 1) * LENGTH;

		for(int number = begin; number < end; number++){
			if(isPrime(number)){
				System.out.println(id + ": " + number);
			}
		}
	}
}
