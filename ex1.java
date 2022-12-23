import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "89993456785");
        pb.add("Petrov", "89694553322");
        pb.add("Petrov", "89594542211");
        pb.add("Sidorov", "87453332300");
        pb.add("Sidorov", "84957879090");

        System.out.println(pb.get("Sidorov"));
        
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