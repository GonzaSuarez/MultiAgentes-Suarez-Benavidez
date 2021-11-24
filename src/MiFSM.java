import jade.core.behaviours.DataStore;
import jade.core.behaviours.FSMBehaviour;

public class MiFSM extends FSMBehaviour{
	
	 public MiFSM() {
		DataStore ds = new DataStore();
		EstadoInicial enviar_propuesta = new EstadoInicial();
		enviar_propuesta.setDataStore(ds);
		EstadoIntermedio1 esperar_respuesta = new EstadoIntermedio1();
		esperar_respuesta.setDataStore(ds);
		EstadoFinal estado_final = new EstadoFinal();
		estado_final.setDataStore(ds);
		
		this.registerFirstState(enviar_propuesta, "inicial");
		this.registerState(esperar_respuesta, "esperar_respuesta");
		this.registerLastState(estado_final, "final");
		
		String[] toReset = {"inicial","esperar_respuesta"};
		this.registerTransition("esperar_respuesta", "inicial", 1, toReset);
		this.registerTransition("esperar_respuesta", "final", 2, toReset);
		
		this.registerDefaultTransition("inicial", "esperar_respuesta");

		
	}
	
}
