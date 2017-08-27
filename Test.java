import java.util.LinkedList;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1:" + playerOneTiles);

        System.out.println("-----------------------------------");


        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
        System.out.println(instanceTwo.getLetterList());
        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
        System.out.println("Player 2:" + playerTwoTiles);


    }
}
