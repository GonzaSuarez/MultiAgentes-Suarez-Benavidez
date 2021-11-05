import jade.core.behaviours.Behaviour;

public class EstadoInicial extends Behaviour {

	private int event = -1;
	private boolean termino = false;
	
	@Override
	public void action() {
		
		this.getDataStore().put("key", "Hola");
		
		double valor = Math.random();
		System.out.println("En Estado Inicial " + valor);
		
		if(valor > 0.3)
			if(valor < 0.4)
				event = 1;
			else 
				event = 2;
			termino = true;
	}

	@Override
	public boolean done() {
		// TODO Auto-generated method stub
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
