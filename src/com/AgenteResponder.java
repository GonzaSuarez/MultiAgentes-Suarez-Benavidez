package com;

import jade.core.Agent;

public class AgenteResponder extends Agent {
	
	@Override
	protected void setup() {
		this.addBehaviour(new BehaviourResponder());
		this.addBehaviour(new BehaviourContador(this, 10000));
	}

}
