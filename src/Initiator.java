import jade.core.Agent;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class Initiator extends Agent {
	private String[] menu= {"milanesa", "pollo", "fideos"}; 

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
