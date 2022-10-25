package BehavioralDP.MediatorDP;
                                                                       // 1.
public interface Actor {
    void receiveMessage(String message);
    void sendMessage(String topic, String message);  // Once mesajin (topic)basligi ,sonra mesaj
}
