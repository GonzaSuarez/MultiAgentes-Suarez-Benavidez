package com;

import jade.core.Agent;

public class AgenteResponder extends Agent {
	
	@Override
	protected void setup() {
		this.addBehaviour(new BehaviourResponder());
	}

}
