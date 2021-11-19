import jade.core.behaviours.Behaviour;

public class EstadoFinal extends Behaviour {

	boolean termino = false;
	@Override
	public void action() {
		System.out.println("En Estado Final" + getDataStore().get("key"));
		termino = true;
	}

	@Override
	public boolean done() {
		return termino;
	}

}
