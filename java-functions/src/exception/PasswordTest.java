package exception;

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

class Password {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("null");
        } else if (password.length() < 5) {
            throw new PasswordException("length should be longer than 5");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("password should include character or special character");
        }
        this.password = password;
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        Password password = new Password();
        try {
            password.setPassword("");
            password.setPassword("abc");
            password.setPassword("abcdef");
        } catch (PasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}