import java.util.HashMap;
import java.util.Map;

public class UsernameAvailabilityChecker {

    protected Map<String, Integer> users = new HashMap<>();

    public UsernameAvailabilityChecker() {
        users.put("john_doe", 1);
        users.put("admin", 2);
    }

    public boolean checkAvailability(String username) {
        return !users.containsKey(username);
    }

    public static void main(String[] args) {

        UsernameAvailabilityChecker checker =
                new UsernameAvailabilityChecker();

        System.out.println(checker.checkAvailability("john_doe"));
        System.out.println(checker.checkAvailability("jane_smith"));
    }
}