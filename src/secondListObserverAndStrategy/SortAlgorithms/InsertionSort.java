package secondListObserverAndStrategy.SortAlgorithms;

public class InsertionSort implements SortStrategy{

	@Override
	public int[] action(int[] list) {
	    int j;
	    int key;
	    int i;
	   
	    for (j = 1; j < list.length; j++) {
	      key = list[j];
	      for (i = j - 1; (i >= 0) && (list[i] > key); i--){
	         list[i + 1] = list[i];
	       }
	        list[i + 1] = key;
	    }

		return list;
	}

}
