package fourthList.SingletonAndAdapter.SecondQuestion;

public class TesteIncremental {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = new Incremental();
			System.out.println(inc);
			
		}
		for (int i = 0; i < 10; i++) {
			IncrementalSIngleton incSingleton = IncrementalSIngleton.getInstance();
			System.out.println(incSingleton);
				
		}
		for (int i = 0; i < 10; i++) {
			IncrementalMultiThreadingSingleton multiIncSingleton = IncrementalMultiThreadingSingleton.getInstance();
			System.out.println(multiIncSingleton);
				
		}
	}
}
