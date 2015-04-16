/*
 * WritersApp: Gara di scrittori multithreaded.
 */
package writersapp;

/**
 *
 * @author Sandro
 */
public class WritersApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Writer w1 = new Writer("GUELFI");
        w1.start();
        Writer w2 = new Writer("GHIBELLINI");
        w2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        w1.safeStop();
        w2.safeStop();
    }

}
