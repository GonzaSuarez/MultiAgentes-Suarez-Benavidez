import jade.core.behaviours.Behaviour;

public class MiComportamiento extends Behaviour {
	
	@Override
	public void action() {
		System.out.println("Mi nombre es " + myAgent.getLocalName());
	}
	
	@Override
	public boolean done() {
		return true;
	}

}
