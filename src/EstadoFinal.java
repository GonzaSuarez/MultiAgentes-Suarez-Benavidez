import jade.core.behaviours.Behaviour;

public class EstadoFinal extends Behaviour {

	@Override
	public void action() {
		System.out.println("En Estado Final" + getDataStore().get("key"));
	}

	@Override
	public boolean done() {
		return true;
	}

}
