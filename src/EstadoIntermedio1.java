import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class EstadoIntermedio1 extends Behaviour {
	private int event=-1;
	private boolean termino=false;
	@Override
	public void action() {
	if(!termino) {	
		ACLMessage msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.REFUSE));
		if (msg != null) {
			event=1;
		}
		msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.ACCEPT_PROPOSAL));
		if(msg !=null) {
			event=2;
		}
		else
			block();
		}
	}

	@Override
	public boolean done() {
		return true;
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
