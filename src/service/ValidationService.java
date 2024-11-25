package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.Locale;

public class ValidationService {
    public static void validate(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    public static void validateLogin(String login) {
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Неверные символы логина");
        }
        if (login.length() > 20 || login.isEmpty()) {
            throw new WrongLoginException("Неверная длина логина");
        }
    }

    public static void validatePassword(String password, String confirmPassword) {
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Неверные символы пароля");
        }
        if (password.length() > 20 || password.isEmpty()) {
            throw new WrongPasswordException("Неверная длина пароля");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный подтверждающий пароль");
        }
    }
}
