import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App extends Version {


    public void texteChoixlangue() {
        System.out.println("Veuillez ecrire le nom d'une langue pour dire bonjour:");
        System.out.println("    - Anglais");
        System.out.println("    - Breton");
        System.out.println("    - Togolais");
        System.out.println("");
        System.out.println("Votre réponse : ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String choix;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");
        Togolais vTogolais = new Togolais();
        vTogolais.addDico("Bonjour", "Ndi");


        Map<String, String> langues = new HashMap<>();
        langues.put("anglais", vAnglais.getTraduction("Bonjour"));
        langues.put("breton", vBreton.getTraduction("Bonjour"));
        langues.put("togolais", vTogolais.getTraduction("Bonjour"));


        do {
            App app = new App();
            app.texteChoixlangue();

            choix = sc.nextLine().toLowerCase();

            if (!langues.containsKey(choix)) {
                System.out.println("Veuillez entrer une langue valide !");
            }
        } while (!langues.containsKey(choix));

        System.out.println(langues.get(choix));

        sc.close();
    }
}

