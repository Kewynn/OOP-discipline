package fourthList.SingletonAndAdapter.fourthQuestion;

import java.util.ArrayList;
import java.util.List;

public class ObjectAdapter implements SomadorEsperado{
	private SomadorExistente somadorExistente;
	public ObjectAdapter(){
		somadorExistente = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i: vetor) {
			lista.add(i);
		}
		return somadorExistente.somaLista(lista);
	}

}
