package observerPatternExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteSubject implements Subject {

	private List<ConcreteObserver> observers;
	
	public ConcreteSubject(List<ConcreteObserver> o) {
		this.observers = o;
	}

	public ConcreteSubject() {
		this.observers = new ArrayList<ConcreteObserver>();
	}

	@Override
	public void removeObserver(ConcreteObserver o) {
		Iterator<ConcreteObserver> iterator = observers.iterator();
		while(iterator.hasNext()){
			ConcreteObserver co = iterator.next();
			if(co.equals(o))
				iterator.remove();
		}
	}

	@Override
	public void registerObserver(ConcreteObserver o) {
		this.observers.add(o);
	}

	@Override
	public void notifyObservers(String m) {
		for (Observer o : this.observers) {
			o.update(m);
		}
	}
	
	public List<ConcreteObserver> getObservers(){
		return this.observers;
	}

	public void getState() {

	}

	public void setState() {

	}

}
