import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "89993456785");
        pb.add("Petrov", "89694553322");
        pb.add("Petrov", "89594542211");

        System.out.println(pb.get("Petrov"));
        // System.out.println(pb.get("Ivanov"));
    }
}



class Phonebook {

    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}