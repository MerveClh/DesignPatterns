package BehavioralDP.ChainOfResponsibility;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Genel mudur anayladi");
        System.out.println("******************");
        return true;
    }
}
