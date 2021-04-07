package Data;

import Models.NewUser;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class NewUserData {

    private static final Map<Integer, NewUser> users = new HashMap<>();

    public static Collection <NewUser> getAll(){
        return users.values();
    }

    public static NewUser getById(int id){
        return users.get(id);
    }

    public static void add(NewUser, newUser){
        users.put(newUser.getId(), newUser);
    }

    public static void remove(int id){
        users.remove(id);
    }
}
