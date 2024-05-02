package ru.netology.domain;

/**
 * Класс обработки исключения для не зарегестрированных игроков
 */
public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Игрок с именем" + name + "не зарегестрирован");
    }
}
