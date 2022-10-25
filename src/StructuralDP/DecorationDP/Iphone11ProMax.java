package StructuralDP.DecorationDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);

        // Iphone11Pro dan set ettih ozelliklere sadece ekleme yaptik
        //Decorator den set etseydik tek tek eklememiz gerekicekti
    }
    @Override
    public String getName() {
        return super.getName() + " Max";
    }
    @Override
    public double getPrice() {
        return super.getPrice() +200 ;
    }
}
