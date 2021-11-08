package order;

import java.util.List;
import order.User;

public class Order {
    String status = "";
    private List<User> users;

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void notifyUsers(){
        for (int i = 0; i < users.toArray().length; i++){
            users.get(i).update(status);
        }
    }

    public void order(){
        notifyUsers();
    }

}
