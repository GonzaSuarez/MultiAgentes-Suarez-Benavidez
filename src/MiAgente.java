import jade.core.Agent;

public class MiAgente extends Agent {

    protected void setup(){
        System.out.println("Mi nombre es: " + this.getLocalName());
    }
}
