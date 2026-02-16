import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<>();

        paises.put("CO", "Colombia");
        paises.put("MX", "México");
        paises.put("AR", "Argentina");

        for (String clave : paises.keySet()) {
            System.out.println(clave + " - " + paises.get(clave));
        }
    }
}