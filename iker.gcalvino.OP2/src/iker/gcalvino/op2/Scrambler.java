package iker.gcalvino.op2;

import java.util.List;

public class Scrambler {

    private final Operation code = new Encoding();
    private final Operation decode = new Decoding();

    public String encodePassword(String password, List<String> operationslist) {
        String operation;
        for (int i = 0; i < operationslist.size(); i++) {
            operation = operationslist.get(i).replaceAll("\\s+", "");
            password = code.operate(password, operation);
        }
        return password;
    }

    public String decodePassword(String password, List<String> operationslist) {
        String operation;
        for (int i = operationslist.size(); i > 0; i--) {
            operation = operationslist.get(i).replaceAll("\\s+", "");
            password = decode.operate(password, operation);
        }
        return password;
    }
}
