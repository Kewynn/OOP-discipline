package secondListObserverAndStrategy.SortAlgorithms;


public class Action {
	private SortStrategy sortBehavior;
	
	
	public Action(SortStrategy sortBehavior){
		this.sortBehavior = sortBehavior;
	}
	
	public int[] sortList(int[]list){
		return sortBehavior.action(list);
	}

	

}
