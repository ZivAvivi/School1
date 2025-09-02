public class Rocket {
    public static void main(String[] args) throws InterruptedException
    {
        int  i;

        for (i=1; i<=15; i++)
            System.out.println();
        System.out.println("   *  ");
        for(i=1; i<=5; i++)
            System.out.println("  *** ");
        for(i=1; i<=3; i++)
            System.out.println(" *****");
        System.out.println("*** ***");
        System.out.println("**   **");
        System.out.println("*     *");

        Thread.sleep(1000);

        for(i=1; i<=3; i++)
        {
            System.out.println();
            Thread.sleep(200);
        }

    }
}
