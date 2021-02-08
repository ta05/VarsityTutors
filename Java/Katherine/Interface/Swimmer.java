package Interface;

public class Swimmer implements Athlete{
    private String name;
    private String teamName;

    public void go() {
        System.out.println("Blub Blub, I'm doing the Freestyle!");
    }

    public void practice() {
        System.out.println("Swimming 4 sets of 400IM");
    }
}
