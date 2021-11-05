package com;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;

public class BehaviourContador extends TickerBehaviour {

	private int contador = 0;
	
	public BehaviourContador(Agent a, long period) {
		super(a, period);
	}
	
	@Override
	public void onTick() {
		System.out.println(contador);
		contador++;
	}

}
