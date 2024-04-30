package entities;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import textTerminal.textRegistration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class RegisteredUsers {

    private List<User> users = new ArrayList<>();

    public void register(textRegistration userRegistered){
        User user = new User(userRegistered);
        users.add(user);
        saveUsersToJson();
    }

    public void saveUsersToJson(){
        try(Writer writer = new FileWriter("users.json")){
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();
            gson.toJson(users, writer);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
