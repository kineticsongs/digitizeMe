import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Anne-Simone
 *
 */
public class DigitizeMe {
    
    private static final int LINE_LEN = 109;
    private final static String FILENAME = "image.txt";
    private static BufferedReader READER = null;
    
    public static void main(final String[] args) {
        final I i = new I();
        final I me = i;
        final You you= new You();
        final You come = you;
        try {
            READER = new BufferedReader(new FileReader(new File(FILENAME)));
            
            ///////////////////////////////////////////////////////
            // Song lyrics
            //////////////////////////////////////////////////////
            
            i.am("wandering around").
            alone("memory bound").
            hopingTo().find(you).someday().
            are(you, "miles and miles away").
            did(you, "pass my way").
            are(you, "wondering the same");
            
            if (i.made(you).appear("one keystroke at the time")) {
                you.would("see my soft side");
                you.would("make me smile");
                you.would("always be around").
                when("things are up or down");
                
                you.would("hold me close").
                and("look into my eyes").
                without("a single prose");
                you.would("make it alright").
                
                come("and").find(me);
                if (you.can("handle", me)) {
                	come.and("connect to", me).
                	digitize(me);
                }
            }
            
            i.would("make it brand new");
            i.would("refresh the view").
            to("make", you, "wanna stay").
            are(you, "ready to do the same").
            and("put me in your frame").
            and("be there come what may");
            
            if (i.made(you).appear("one keystroke at the time")) {
                you.would("see my soft side");
                you.would("make me smile");
                you.would("always be around").
                when("things are up or down");
                
                you.would("hold me close").
                and("look into my eyes").
                without("a single prose");
                you.would("make it alright").
                
                come("and").find(me);
                if (you.can("handle", me)) {
                	come.and("connect to", me).
                	digitize(me);
                }
            }
            
            you.and("I will").
            always("be error free");
            you.and("I will").
            always("be");
            
            you.would("hold me close").
            and("look into my eyes").
            without("a single prose");
            you.would("make it alright").
            
            come("and").find(me);
            if (you.can("handle", me)) {
            	come.and("connect to", me).
            	digitize(me);
            }
            ///////////////////////////////////////////////////////
            // End song lyrics
            //////////////////////////////////////////////////////
            
        } catch (final Exception e) {
            System.err.println("Song failed to start:");
            e.printStackTrace(System.err);
            System.exit(1);
        } finally {
            endSong();
        }
    }

    private static void writeLine() {
        try {
            for (int i = 0; i < LINE_LEN; i++) {
                final int c = READER.read();
                if (c != -1) {
                    System.out.print((char) c);
                    Thread.sleep(50);
                }
            }
        } catch (final Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    private static void endSong() {
        try {
            if (READER  != null) {
                READER.close();
            }
        } catch (final Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    private static class I {
        I am(final String s) {writeLine(); return this;}
        I alone(final String s) {writeLine(); return this;}
        I hopingTo() {writeLine(); return this;}
        I would(final String s) {writeLine(); return this;}
        You find(final You y) {writeLine(); return y;}
        You made(final You y) {writeLine(); return y;}
        You to(final String s, final You y, final String s2) {writeLine(); return y;}
    }
    
    private static class You {
        You someday() {writeLine(); return this;}
        You are(final You y, final String s) {writeLine(); return this;}
        boolean can(final String s, final I i) {writeLine(); return true;}
        You come(final String s) {writeLine(); return this;}
        You did(final You y, final String s) {writeLine(); return this;}
        You digitize(final I i) {writeLine(); return this;}
        You find(final I i) {writeLine(); return this;}
        You would(final String s) {writeLine(); return this;}
        You when(final String s) {writeLine(); return this;}
        You and(final String s, I... i) {writeLine(); return this;}
        You without(final String s) {writeLine(); return this;}
        You always(final String s) {writeLine(); return this;}
        boolean appear(final String s) {writeLine(); return true;}
    }
}
