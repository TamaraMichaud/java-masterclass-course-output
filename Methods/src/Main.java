public class Main {

    public static void main(String[] args) {

        String playerName = "John";
        int[] playerScoreArray = {1500, 900, 400, 50};

        for (int i = 0; i < playerScoreArray.length; i++) {
            int playerScore = playerScoreArray[i];
            int playerPosition = calculateHighScorePosition(playerScore);
            displayHighScorePosition(playerName, playerPosition);
        }


    }

    private static void displayHighScorePosition(String playerName,
                                                 int playerPosition) {
        System.out.println(String.format(
                "Player %s is in position %d on the high score table",
                playerName, playerPosition));

    }

    private static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
