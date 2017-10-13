package fourthList.SingletonAndAdapter.SecondQuestion;

class Incremental {
	private static int count = 0;
	private int numero;
	public Incremental() {
		numero = ++count;
	}
	public String toString() {
		return "IncrementalSingleton " + numero;
	}
}
