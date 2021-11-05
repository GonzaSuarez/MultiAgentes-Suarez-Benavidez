package com;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class BehaviourResponder extends Behaviour {

//	private boolean loRecibi = false;
	
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
			resp.setPerformative(ACLMessage.INFORM);
			resp.setContent("Recibido");
			
			myAgent.send(resp);
		}
		else
			block();
	
	}

	@Override
	public boolean done() {
		// TODO Auto-generated method stub
		return false;
	}

}
