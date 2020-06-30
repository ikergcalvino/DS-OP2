package iker.gcalvino.op2;

public class SWP implements Operation {

    private String password;
    private final int x, y;

    public SWP(String password, int x, int y) {
        this.password = password;
        this.x = x;
        this.y = y;
    }

    @Override
    public String encode() {
        char a, b;
        StringBuilder changes = new StringBuilder(password);
        if (x <= password.length() && y <= password.length()) {
            a = password.charAt(x);
            b = password.charAt(y);
            changes.setCharAt(x, b);
            changes.setCharAt(y, a);
        }
        password = changes.toString();
        return password;
    }

    @Override
    public String decode() {
        char a, b;
        StringBuilder changes = new StringBuilder(password);
        if (x <= password.length() && y <= password.length()) {
            a = password.charAt(x);
            b = password.charAt(y);
            changes.setCharAt(x, b);
            changes.setCharAt(y, a);
        }
        password = changes.toString();
        return password;
    }
}
