package StructuralDP.AdapterDP;

public class Adapter {                          // birbirine uyumlu olmayan iki objeyi birbirine donusturmeye denir
                                                    // id ile sorgu yaptigimiz sistemi email ile yapmayi sagliyor
    class OldUser{
        int id;
        String username;
        String name;
        String lastName;

    }
    interface OldUserService{   // eski sistemin Service katmani
        OldUser getUser(int id);  // id uzerinden sorgu yapiliyor
    }

    class User{
        int id;
        String email;
        String username;
        String name;
        String lastName;
        String location;
        Boolean isActive;
    }
    //yeni sistem REPO
    interface UserRepository{
        User getUser(String email);
    }
    // yeni sistemin service
    interface UserService{
        User getUser(String email);
    }

    class UserServiceAdapter implements UserService{
        UserRepository userRepository;
        OldUserService oldUserService;
        @Override
        public User getUser(String email) {
            User user = userRepository.getUser(email);
            OldUser oldUser= oldUserService.getUser(user.id);
            user.username= oldUser.username;
            user.lastName=oldUser.lastName;
            return user;
        }
    }

    // main için gerekli method
    public void adapterDemo(){
        UserService userService = new UserServiceAdapter();
        User user = userService.getUser("xxx@yyy.com");
        System.out.println(user);
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.adapterDemo();
    }
}




