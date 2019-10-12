package adapter;

public class Test {

	public static void main(String[] args) {

		SomadorEsperado somador = new ObjectAdapter();
		Cliente cliente = new Cliente(somador);
		cliente.executar();

	}

}
