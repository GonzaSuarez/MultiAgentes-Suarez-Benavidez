import jade.core.behaviours.Behaviour;

public class EstadoIntermedio2 extends Behaviour {

	@Override
	public void action() {
		System.out.println("En Intermedio 2");
	}

	@Override
	public boolean done() {
		return true;
	}

}
