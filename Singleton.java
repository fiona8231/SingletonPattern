import java.util.*;

public class Singleton {

    //objects like this almost always need to be available in global
    private static Singleton firtstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    //creating thread

    static boolean firstThread = true;


    //Private to make sure we only have one instance -- That's singleton
    private Singleton() {
    }


    public static Singleton getInstance() throws InterruptedException {
        if (firtstInstance == null) {
            if (firstThread) {
                firstThread = false;

                Thread.currentThread();
                Thread.sleep(1000);

            }

            synchronized (Singleton.class) {

                if(firtstInstance == null) {

                    firtstInstance = new Singleton();
                    Collections.shuffle(firtstInstance.getLetterList());
                }
            }
        }
        return firtstInstance;
    }



    public LinkedList<String> getLetterList(){
        return  firtstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howmanyTiles){
        LinkedList<String> tilesToSend = new LinkedList<>();
        for(int i =0; i<= howmanyTiles; i++){
            tilesToSend.add(firtstInstance.letterList.remove(1));

        }
        return tilesToSend;
    }

}
