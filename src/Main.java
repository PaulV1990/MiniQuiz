import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        Gewone vraag
        Question q = new Question();
        q.setText("Is dit een vraag?");
        q.setAnswer("Ja");

        q.display();
        System.out.println("Antwoord deelnemer vraag 1");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));

//        Multiple gok vraag
        ChoiceQuestion m = new ChoiceQuestion();
        m.setText("Wanneer is die knakker geboren");

        m.addChoice("France", false);
        m.addChoice("Belgium", false);
        m.addChoice("Canada", true);
        m.addChoice("Limburg", false);

        m.display();
        System.out.println("Antwoord deelnemer vraag 2");
        String responseVraag2 = in.nextLine();
        System.out.println(m.checkAnswer(responseVraag2));

    }
}
