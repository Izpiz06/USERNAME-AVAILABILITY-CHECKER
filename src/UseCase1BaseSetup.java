import java.util.HashMap;
import java.util.Map;

public class UsernameAvailabilityChecker {

    protected Map<String, Integer> users = new HashMap<>();

    public UsernameAvailabilityChecker() {
        users.put("john_doe", 1);
        users.put("admin", 2);
    }

    public static void main(String[] args) {
        UsernameAvailabilityChecker checker =
                new UsernameAvailabilityChecker();

        System.out.println("System Initialized");
    }
}