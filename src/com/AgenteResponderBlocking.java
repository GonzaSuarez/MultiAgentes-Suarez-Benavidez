package com;

import jade.core.Agent;

public class AgenteResponderBlocking extends Agent {
	
	@Override
	protected void setup() {
		this.addBehaviour(new BehaviourResponder());
	}

}
