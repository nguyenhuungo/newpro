package DI;

@org.springframework.stereotype.Service("Services")
public class Services {
    public void sendMsg(String message) {
        System.out.println(message);
    }
}