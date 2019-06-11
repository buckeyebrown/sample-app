package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService{

    @Autowired
    private UserRepository repository; 
    
    public List<String> getAllUserNames(){
        List<String> list = new ArrayList<>();
        for (User user : repository.findAll()){
            list.add(user.name);
        }
        return list;
    }
} 