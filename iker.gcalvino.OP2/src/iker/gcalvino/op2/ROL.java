package iker.gcalvino.op2;

public class ROL implements Operation {

    private String password;
    private int x;

    public ROL(String password, int x) {
        this.password = password;
        this.x = x;
    }

    @Override
    public String encode() {
        password = password.substring(x) + password.substring(0, x);
        return password;
    }

    @Override
    public String decode() {
        x = password.length() - x;
        password = password.substring(x) + password.substring(0, x);
        return password;
    }

}
