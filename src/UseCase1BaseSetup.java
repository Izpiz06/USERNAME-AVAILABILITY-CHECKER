import java.util.HashMap;
import java.util.Map;

public class UseCase1BaseSetup {
    protected Map<String, Integer> users = new HashMap<>();
    public UseCase1BaseSetup() {
        users.put("john_doe", 1);
        users.put("admin", 2);
    }
    public static void main(String[] args) {
        UseCase1BaseSetup checker =
                new UseCase1BaseSetup();
        System.out.println("System Initialized");
    }
}