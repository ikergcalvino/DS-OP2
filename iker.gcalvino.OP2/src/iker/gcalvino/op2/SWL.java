package iker.gcalvino.op2;

public class SWL implements Operation {

    private String password;
    private final char a, b;

    public SWL(String password, char a, char b) {
        this.password = password;
        this.a = a;
        this.b = b;
    }

    @Override
    public String encode() {
        String comparation = password;
        StringBuilder changes = new StringBuilder(password);
        password = password.replace(a, b);
        changes = new StringBuilder(password);
        for (int i = 0; i < password.length(); i++) {
            if (changes.charAt(i) == b && changes.charAt(i) == comparation.charAt(i)) {
                changes.setCharAt(i, a);
            }
        }
        password = changes.toString();
        return password;
    }

    @Override
    public String decode() {
        String comparation = password;
        StringBuilder changes = new StringBuilder(password);
        password = password.replace(a, b);
        changes = new StringBuilder(password);
        for (int i = 0; i < password.length(); i++) {
            if (changes.charAt(i) == b && changes.charAt(i) == comparation.charAt(i)) {
                changes.setCharAt(i, a);
            }
        }
        password = changes.toString();
        return password;
    }

}
