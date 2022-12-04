package oop.exceptions;

public class ExceptionsTask {
    private static final String SYMBOL = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_1234567890";
    private ExceptionsTask() {

    }

    public static boolean inputErrorCheck(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void check(String login, String password, String confirmPassword)
    throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин не валидный");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль не валидный");
        }
        if (!validate(confirmPassword)) {
            throw new WrongPasswordException("Повторный пароль не валидный");
        }


    }

    private static boolean validate (String string){
        if (string.length()>20) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!SYMBOL.contains(String.valueOf(string.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
