package segundalista.algoritmosdeordenacao;

public class BubbleSort implements SortStrategy {

	@Override
	public int[] action(int[] list) {
		int temp = 0;
		for (int k = 0; k < list.length; k++) {
			for (int i = 0; i < list.length - 1; i++) {
				if(list[i] > list[i+1]){
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}

			}
		}
		return list;
	}

}
