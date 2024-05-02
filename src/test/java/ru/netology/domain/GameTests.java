package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTests {

    @Test
    public void testSecondPlayerWin() {
        Player player1 = new Player(10, "Вова", 15);
        Player player2 = new Player(3, "Слава", 20);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int actual = game.round("Вова", "Слава");
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testFirstPlayerWin() {
        Player player1 = new Player(10, "Вова", 7);
        Player player2 = new Player(3, "Слава", 5);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int actual = game.round("Вова", "Слава");
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testPlayersDrawWin() {
        Player player1 = new Player(10, "Вова", 7);
        Player player2 = new Player(3, "Слава", 7);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        int actual = game.round("Вова", "Слава");
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testOnePlayerNoRegistered() {
        Player player1 = new Player(10, "Вова", 7);
        Player player2 = new Player(3, "Слава", 5);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Ира", "Вова"));
    }

    @Test
    public void testTwoPlayerNoRegistered() {
        Player player1 = new Player(10, "Вова", 7);
        Player player2 = new Player(3, "Слава", 5);
        Game game = new Game();

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Слава", "Ира"));
    }

}
