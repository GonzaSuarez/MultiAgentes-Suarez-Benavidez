package com;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class BehaviourResponder extends Behaviour {

//	private boolean loRecibi = false;
	private boolean termino = false;
	
	@Override
	public void action() {
		ACLMessage msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.REQUEST));
		
		if(msg != null) {
			System.out.println("Mensaje Recibido "+ msg.getContent());
			
//			loRecibi = true;
			
			//ACLMessage resp = new ACLMessage(ACLMessage.INFORM);
//			resp.addReceiver(msg.getSender());
//			resp.setContent("Recibido");
			ACLMessage resp = msg.createReply();
			if (Math.random()<0.5) {
				resp.setPerformative(ACLMessage.ACCEPT_PROPOSAL);
				resp.setContent("Me gusta la comida");		
				System.out.println("me gusto");
			}
			else
			{
				resp.setPerformative(ACLMessage.REJECT_PROPOSAL);
				resp.setContent("No me gusta la comida");
				System.out.println("no me gusto");
			}
			myAgent.send(resp);
			termino = true;
			
		}
		else
			block();
	
	}

	@Override
	public boolean done() {
		return termino;
	}

}
