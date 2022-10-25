package StructuralDP.DecorationDP;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone phone = new Iphone11ProMax(new Iphone());

        System.out.println("Name: " + phone.getName());  //Name: IPhone 11 Pro Max
        System.out.println("Price: " + phone.getPrice()); // Price: 1099.9
        System.out.println("Camera count: " + phone.cameraCount()); // Camera count: 3
    }
}
