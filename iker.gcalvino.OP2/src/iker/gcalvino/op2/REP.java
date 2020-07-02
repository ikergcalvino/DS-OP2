package iker.gcalvino.op2;

public class REP implements Operation {

    private String password;
    private int x, y;

    public REP(String password, int x, int y) {
        this.password = password;
        this.x = x;
        this.y = y;
    }

    @Override
    public String encode() {
        int i;
        StringBuilder changes;
        if (x > y) {
            i = x;
            x = y;
            y = i;
        }
        if (x <= password.length() && y <= password.length()) {
            changes = new StringBuilder(password.substring(x, y + 1));
            changes = changes.reverse();
            password = password.substring(0, x) + changes.toString() + password.substring(y + 1);
        }
        return password;
    }

    @Override
    public String decode() {
        int i;
        StringBuilder changes;
        if (x > y) {
            i = x;
            x = y;
            y = i;
        }
        if (x <= password.length() && y <= password.length()) {
            changes = new StringBuilder(password.substring(x, y + 1));
            changes = changes.reverse();
            password = password.substring(0, x) + changes.toString() + password.substring(y + 1);
        }
        return password;
    }

}
