import jade.core.behaviours.DataStore;
import jade.core.behaviours.FSMBehaviour;

public class MiFSM extends FSMBehaviour{
	
	 public MiFSM() {
		DataStore ds = new DataStore();
		EstadoInicial eini = new EstadoInicial();
		eini.setDataStore(ds);
		EstadoIntermedio1 eint1 = new EstadoIntermedio1();
		eint1.setDataStore(ds);
		EstadoIntermedio2 eint2 = new EstadoIntermedio2();
		eint2.setDataStore(ds);
		EstadoFinal efin = new EstadoFinal();
		efin.setDataStore(ds);
		
		this.registerFirstState(eini, "ini");
		this.registerState(eint1, "int1");
		this.registerState(eint2, "int2");
		this.registerLastState(efin, "fin");
		
		String[] toReset = {"ini"};
		this.registerTransition("ini", "int1", 1, toReset);
		this.registerTransition("ini", "int2", 2, toReset);
		
		this.registerDefaultTransition("ini", "fin");
		this.registerDefaultTransition("int2", "ini");
		
	}
	
}
