import java.util.Scanner;

public class buttonFactory {
    // this will caculate how many full boxes the factory makes in 3days
    public static void main(String[] args) {
        int buttons, pack, singles, fullBox, remainPacks;
        Scanner input = new Scanner(System.in);

        //day one
        System.out.print("how many buttons did you make on day 1? -> ");

        buttons = input.nextInt();
        pack = buttons /12;
        singles = buttons %12;
        fullBox = pack / 50;
        remainPacks = pack % 50;

        System.out.println("there are "+ buttons + " buttons, " + pack + " packs, "+ singles + " buttons outside of the packs, "+ fullBox + " full boxes and " + remainPacks + " packs outside the boxes");

        // day 2
        System.out.print("how many buttons did you make on day 2? -> ");
        buttons = input.nextInt();

        pack = (buttons+singles) /12;
        singles = (buttons+singles) %12;
        fullBox = (pack+remainPacks) / 50;
        remainPacks = (pack+remainPacks) % 50;
        System.out.println("there are "+ buttons + " buttons, " + pack + " packs, "+ singles + " buttons outside of the packs, "+ fullBox + " full boxes and " + remainPacks + " packs outside the boxes");


        // day 3
        System.out.print("how many buttons did you make on day 3? -> ");
        buttons = input.nextInt();

        pack = (buttons+singles) /12;
        singles = (buttons+singles) %12;
        fullBox = (pack+remainPacks) / 50;
        remainPacks = (pack+remainPacks) % 50;
        System.out.println("there are "+ buttons + " buttons, " + pack + " packs, "+ singles + " buttons outside of the packs, "+ fullBox + " full boxes and " + remainPacks + " packs outside the boxes");

    }
}
/*
* how many buttons are there? -> 200
* there are 200 buttons, 16 packs, 8 buttons outside of the packs, 0 full boxes and 16 packs outside the boxes
*
* how many buttons are there? -> 3000
* there are 3000 buttons, 250 packs, 0 buttons outside of the packs, 5 full boxes and 0 packs outside the boxes
* */