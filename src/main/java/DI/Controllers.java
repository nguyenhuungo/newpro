package DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Controllers {
    @Autowired // filed  Injection
    private Services service;

//    @Autowired // Contructer Injection
//    public Controllers(Services service){
//        this.service = service;
//    }

//    @Autowired // filed  Injection
    public void setMessageService(Services service) {
        this.service = service;
    }

    public void processMsg(String message) {
        System.out.println("processMsg");
        service.sendMsg(message);
    }
}