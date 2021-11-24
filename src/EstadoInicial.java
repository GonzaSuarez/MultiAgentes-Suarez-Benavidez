import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;


public class EstadoInicial extends Behaviour {

	private boolean termino = false;
	private String[] menu= {"milanesa", "pollo", "fideos"}; 

	
	@Override
	public void action() {
		if (!termino) {
		
			ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
			int aux= (int) (Math.random()*menu.length);
			msg.addReceiver(new AID("cocina", AID.ISLOCALNAME));
			msg.setLanguage("Spanish");
			msg.setOntology("Weather-forecast-ontology");
			msg.setContent("Queres comer "+ menu[aux]);
			myAgent.send(msg);
			msg= myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.REQUEST));
			System.out.println("Quiero comer " + menu[aux]);
			termino = true;

		}
		
	}

	@Override
	public boolean done() {
		return termino;
	}
	
	
	@Override
	public void reset() {
		termino = false;
	}

}
