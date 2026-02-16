import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "Ana");
        estudiantes.put(2, "Luis");
        estudiantes.put(3, "Pedro");

        System.out.println(estudiantes);
    }
}