import jade.core.behaviours.Behaviour;

public class EstadoIntermedio1 extends Behaviour {

	@Override
	public void action() {
		System.out.println("En Intermedio 1");
	}

	@Override
	public boolean done() {
		return true;
	}

}
