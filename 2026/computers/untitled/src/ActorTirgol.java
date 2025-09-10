import java.util.Scanner;

public class ActorTirgol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Actor[] actors = new Actor[20];
        String id, gender;
        int numfilms;
        for (int i = 0; i < actors.length; i++) {
            System.out.print("enter id for actor #" + (i+1) + " ->");
            id = input.next();
            System.out.print("enter gender for actor #" + (i+1) + " ->");
            gender = input.next();
            System.out.print("enter numfilms for actor #" + (i+1) + " ->");
            numfilms = input.nextInt();
            actors[i] = new Actor(id, gender, numfilms);
        }

        System.out.println(actors[0].compare(actors[actors.length-1]));
    }
}
