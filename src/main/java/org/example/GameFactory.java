package org.example;

public final class GameFactory {
    private GameFactory() {}

    public static Game createGame(GameType gameType) {
        return switch (gameType) {
            case TicTacToe -> new TicTacToeGame(new TicTacToeBoard(), new TicTacToeRules());
            default -> throw new IllegalArgumentException("Unsupported Game Type");
        };
    }
}
