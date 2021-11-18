import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class EstadoIntermedio1 extends Behaviour {
	private int event=-1;
	private boolean termino=false;
	@Override
	public void action() {
	if(!termino) {	
		ACLMessage msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.ACCEPT_PROPOSAL));
		System.out.println("entro intermedio");
		if(msg !=null) {
			event=2;
			termino= true;
		}
		else
			event=1;

		}
	}

	@Override
	public boolean done() {
		return termino;
	}

	@Override
	public int onEnd() {
		return this.event;
	}
	@Override
	public void reset() {
		termino = false;
	}
}
