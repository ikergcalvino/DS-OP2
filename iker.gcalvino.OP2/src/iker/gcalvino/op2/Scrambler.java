package iker.gcalvino.op2;

import java.util.List;

public class Scrambler {

    private Encoding code;
    private Decoding decode;

    public String encodePassword(String password, List<String> operations) {
        String operation;
        for (int i = 0; i < operations.size(); i++) {
            operation = operations.get(i);
            operation = operation.replaceAll("\\s+", "");
            code.operate(password, operation);
        }
        return password;
    }

    public String decodePassword(String password, List<String> operations) {
        String operation;
        for (int i = operations.size(); i > 0; i--) {
            operation = operations.get(i);
            operation = operation.replaceAll("\\s+", "");
            decode.operate(password, operation);
        }
        return password;
    }
}
