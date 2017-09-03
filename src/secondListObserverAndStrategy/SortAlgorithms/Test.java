package secondListObserverAndStrategy.SortAlgorithms;

public class Test {

	public static void main(String[] args) {
		int[] i = {10,2,7,8,4,9,3,5,6,1};
		Action a = new Action(new InsertionSort());
		int[] j = a.sortList(i);
		for(int x: j){
			System.out.println(x);
		}
		
		
	}

}
