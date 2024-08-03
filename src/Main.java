import exception.WrongLoginException;
import exception.WrongPasswordException;

import static service.ValidationService.validate;

public class Main {
    public static void main(String[] args) {
        String login = "loGin123__";
        String password = "paSsword321_3210";
        String confirmPassword = "paSsword321_3210";

        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
