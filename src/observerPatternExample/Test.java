package observerPatternExample;

public class Test {

	public static void main(String[] args) {
		
		ConcreteSubject publishingCompany = new ConcreteSubject();
		
		ConcreteObserver gilfoyle = new ConcreteObserver();
		gilfoyle.setNome("Gilfoyle");
		gilfoyle.setCpf("8888888888");
		ConcreteObserver richard = new ConcreteObserver();
		richard.setNome("Richard");
		richard.setCpf("9999999");
		ConcreteObserver dinesh = new ConcreteObserver();
		dinesh.setNome("Dinesh");
		dinesh.setCpf("777777777");
		ConcreteObserver jared = new ConcreteObserver();
		jared.setNome("Jared");
		jared.setCpf("6666666666");
		
		
		publishingCompany.registerObserver(gilfoyle);
		publishingCompany.registerObserver(richard);
		publishingCompany.registerObserver(dinesh);
		publishingCompany.notifyObservers("First Magazine");
		for (String s: gilfoyle.getMagazines()){
			System.out.println(s);
		}
		for (Observer o: publishingCompany.getObservers()){
			System.out.println(o.toString());
		}System.out.println();
		publishingCompany.registerObserver(jared);
		publishingCompany.notifyObservers("Second Magazine");
		publishingCompany.removeObserver(richard);
		for (Observer o: publishingCompany.getObservers()){
			System.out.println(o.toString());
		}System.out.println();
		
		publishingCompany.notifyObservers("Third Magazine");
	
		
		

	}

}
