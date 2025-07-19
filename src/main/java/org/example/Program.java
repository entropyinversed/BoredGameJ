package org.example;

import java.util.Arrays;
import java.util.Scanner;

public final class Program {
    public static void main() {
        GameType gameType = promptForGameType();
        Game game = GameFactory.createGame(gameType);

        game.start();
        game.displayBoard();

        while (!game.isGameOver()) {
            game.playTurn();
            game.displayBoard();
        }
    }

    private static GameType promptForGameType() {
        Scanner IN = new Scanner(System.in);

        while (true) {
            System.out.printf("Choose a Game: %s%n", Arrays.toString(GameType.values()));

            String input = IN.nextLine();

            if (input != null && !input.isBlank()) {
                String trimmed = input.trim();

                for (GameType type : GameType.values()) {
                    if (type.name().equalsIgnoreCase(trimmed)) {
                        return type;
                    }
                }
            }
            System.out.printf("Sorry, \"%s\" is not a valid game type.%n", input);
        }
    }
}
