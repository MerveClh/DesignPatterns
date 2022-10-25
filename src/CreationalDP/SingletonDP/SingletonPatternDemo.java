package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       // SingletonObject object2 = new SingletonObject();
        SingletonObject object2 =  SingletonObject.getInstance();
        System.out.println(object2.message);  // Merhaba
        object2.showMessages(); // Merhaba Batch 82-83

        // olusan obje singleton mi test edelim
        SingletonObject object3 = SingletonObject.getInstance();
        System.out.println(object3.message);  // Merhaba Batch 82-83
    }
}
