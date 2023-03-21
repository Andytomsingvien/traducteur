import java.util.Scanner;

public class App {
    public void texteChoixlangue(){
        System.out.println("Choisir votre langue pour dire bonjour ");
        System.out.println("1 : Anglais");
        System.out.println("2 : Breton");
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choix = 1;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");

        App app = new App();
        app.texteChoixlangue();

        do {
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(vAnglais.getTraduction("Bonjour"));
                    break;
                case 2:
                    System.out.println(vBreton.getTraduction("Bonjour"));
                    break;
                default:
                    System.out.println("");
                    System.out.println("Veuillez rentrer un nombre valide (Affiché ci-dessous)");
                    app.texteChoixlangue();

                    break;
            }

        }
        while (choix != 2 && choix != 1);
    }
}