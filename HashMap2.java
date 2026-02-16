import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 18);
        edades.put("Luis", 20);

        System.out.println("Edad de Luis: " + edades.get("Luis"));
    }
}