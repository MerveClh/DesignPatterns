package StructuralDP.DecorationDP;

public class PhoneDecorator implements Phone{

    protected Phone basicPhone;      // IPhone11-pro-max hepsi buradan tureyecekler

    //********** Conctructor **********

    public PhoneDecorator(Iphone basicPhone){

        this.basicPhone = basicPhone;
    }


     // constructor i iphone objesi ile calistiriliyor
    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
