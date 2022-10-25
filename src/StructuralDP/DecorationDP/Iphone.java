package StructuralDP.DecorationDP;

public class Iphone implements Phone {

    @Override
    public String getName()  {     return "IPhone";}

    @Override
    public int cameraCount() {      return 2; }

    @Override
    public double getPrice() {      return 799.90;
    }
}
