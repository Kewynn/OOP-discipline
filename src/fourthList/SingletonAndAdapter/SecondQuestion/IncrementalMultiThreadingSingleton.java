package fourthList.SingletonAndAdapter.SecondQuestion;

public class IncrementalMultiThreadingSingleton {
	private int count = 0;
	private static IncrementalMultiThreadingSingleton instance = new
			IncrementalMultiThreadingSingleton();
	private int numero;
	private IncrementalMultiThreadingSingleton(){
		numero = ++count;
	}
	
	public static IncrementalMultiThreadingSingleton getInstance(){
		return instance;
	}
	public String toString() {
		return "IncrementalSingleton " + numero;
	}

}

