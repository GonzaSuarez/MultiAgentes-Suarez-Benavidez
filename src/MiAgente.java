import jade.core.Agent;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class MiAgente extends Agent {

    protected void setup(){
        this.addBehaviour(new MiFSM());

    }
    
    @Override 
    protected void takeDown() {
    	AgentContainer container = this.getContainerController();
    	try {
    		AgentController a = container.createNewAgent("X1", "MiAgente", null);
    		a.start();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
