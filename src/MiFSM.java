import jade.core.behaviours.DataStore;
import jade.core.behaviours.FSMBehaviour;

public class MiFSM extends FSMBehaviour{
	
	 public MiFSM() {
		DataStore ds = new DataStore();
		EstadoInicial eini = new EstadoInicial();
		eini.setDataStore(ds);
		EstadoIntermedio1 eint1 = new EstadoIntermedio1();
		eint1.setDataStore(ds);
		EstadoFinal efin = new EstadoFinal();
		efin.setDataStore(ds);
		
		this.registerFirstState(eini, "ini");
		this.registerState(eint1, "int1");
		this.registerLastState(efin, "fin");
		
		String[] toReset = {"ini"};
		this.registerTransition("int1", "fin", 2, toReset);
		this.registerTransition("ini1", "ini", 1, toReset);
		
		this.registerDefaultTransition("ini", "int1");

		
	}
	
}
