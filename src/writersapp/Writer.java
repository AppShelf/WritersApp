/*
 * Writer.
 */
package writersapp;

/**
 *
 * @author Sandro
 */
public class Writer extends Thread {
    
    int count=0;
    boolean verde=true;
    String msg;
    
    public Writer( String msg ) { this.msg = msg; }

    public void safeStop() { verde = false; }
    
    @Override public void run() {
        while (verde) {
            System.out.println( (count++) + ") " + msg );
        }
    }
    
}
