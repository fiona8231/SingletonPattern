import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {

        Singleton newInstance = null;

        try {
            newInstance = Singleton.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1:" + playerOneTiles);

        System.out.println("-----------------------------------");


    }



}
