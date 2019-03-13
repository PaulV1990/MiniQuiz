import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
    // This instance variable is added to the subclass
    private ArrayList<String> choices = new ArrayList<>();

    // This method is added to the subclass
    public void addChoice(String choice, boolean correct) {

        choices.add(choice);
        if (correct)
        {
            // Convert choices.size() to string
            String choiceString = "" + choices.size();
            this.setAnswer(choiceString);
        }
    }

    // This method overrides a method from the superclass
    public void display() {
        System.out.println(getText());
        System.out.println(choices);
    }
}