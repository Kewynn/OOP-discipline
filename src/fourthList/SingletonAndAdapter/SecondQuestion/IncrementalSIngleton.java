package fourthList.SingletonAndAdapter.SecondQuestion;


public class IncrementalSIngleton {
	private static int count = 0;
	private static IncrementalSIngleton instance;
	private int numero;
	private IncrementalSIngleton() {
		numero = ++count;
	}
	public static IncrementalSIngleton getInstance(){
		if(instance == null)
			instance = new IncrementalSIngleton();
		return instance;
	}
	public String toString() {
		return "IncrementalSingleton " + numero;
	}

}
