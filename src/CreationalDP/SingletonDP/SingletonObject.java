package CreationalDP.SingletonDP;

public class SingletonObject {   // bir defa uretileceek nereye cagirilirsa oraya gidecek

    String message = "Merhaba";

    private static SingletonObject instance = new SingletonObject();  // new lendigi icin obje olusur instance atar(encapsule)

    // const. private ta cevrilen bir objeye nasil ulasabilirim?
    private  SingletonObject() {};   // parametresiz default constractor


    public static SingletonObject getInstance(){
        return instance;                                  //  new SingletonObject() yerine sadece instance
                                                          // yazdik obje uretmeden methoda ulasildi
    }

    public void  showMessages(){
        this.message= this.message + " Batch 82-83 ";
        System.out.println(this.message);
    }

}
// SingletonObject obje1 = new SingletonObject();