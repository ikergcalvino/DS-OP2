package iker.gcalvino.op2;

import java.util.List;

public class Scrambler {

    private final Operation code = new Encoding();
    private final Operation decode = new Decoding();

    public String encodePassword(String password, List<String> operationslits) {
        for (String operation : operationslits) {
            operation = operation.replaceAll("\\s+", "");
            password = code.operate(password, operation);
        }
        return password;
    }

    public String decodePassword(String password, List<String> operationslist) {
        String operation;
        for (int i = operationslist.size() - 1; i >= 0; i--) {
            operation = operationslist.get(i).replaceAll("\\s+", "");
            password = decode.operate(password, operation);
        }
        return password;
    }
}
