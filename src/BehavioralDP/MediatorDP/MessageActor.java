package BehavioralDP.MediatorDP;
                                                                                        //  3.
public class MessageActor implements Actor {
    String name;
    Dispatcher dispatcher;      // her aktorun dispatcher olmali

    public MessageActor(String name, Dispatcher dispatcher) {   // buradan aktor uretilecek
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message : " + message);
    }

    // mesaj gonderme islemi icin dispatcher a yonlendiriyor
    @Override
    public void sendMessage(String topic, String message) {
        dispatcher.dispatch(topic, message);
    }
}
