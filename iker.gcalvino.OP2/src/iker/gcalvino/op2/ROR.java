package iker.gcalvino.op2;

public class ROR implements Operation {

    private String password;
    private int x;

    public ROR(String password, int x) {
        this.password = password;
        this.x = x;
    }

    @Override
    public String encode() {
        x = password.length() - x;
        password = password.substring(x) + password.substring(0, x);
        return password;
    }

    @Override
    public String decode() {
        password = password.substring(x) + password.substring(0, x);
        return password;
    }

}
