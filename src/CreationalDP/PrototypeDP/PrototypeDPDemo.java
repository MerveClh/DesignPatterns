package CreationalDP.PrototypeDP;

public class PrototypeDPDemo {
    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(100,45,20,50,60,
                5,"Kilic",true);

        // clone ozelligi ile asker uretelim
        Soldier notAvailableSoldier = availableSoldier.clone(); // tekrar ayni kodlari yazmak yerine direk cloneluyor
        notAvailableSoldier.setAvailableForWar(false);
    }
}
