package iker.gcalvino.op2;

public class MOP implements Operation {

    private String password;
    private final int x, y;

    public MOP(String password, int x, int y) {
        this.password = password;
        this.x = x;
        this.y = y;
    }

    @Override
    public String encode() {
        char a = password.charAt(x);
        password = password.substring(0, x) + password.substring(x + 1);
        StringBuilder changes = new StringBuilder(password);
        changes.insert(y, a);
        password = changes.toString();
        return password;
    }

    @Override
    public String decode() {
        char a = password.charAt(y);;
        password = password.substring(0, y) + password.substring(y + 1);
        StringBuilder changes = new StringBuilder(password);
        changes.insert(x, a);
        password = changes.toString();
        return password;
    }

}
