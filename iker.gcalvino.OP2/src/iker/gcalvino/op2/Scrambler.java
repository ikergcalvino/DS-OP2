package iker.gcalvino.op2;

import java.util.List;

public class Scrambler {

    public String encodePassword(String password, List<String> operationslist) {
        String operation;
        Operation operator;
        Selector selector = new Selector();
        for (int i = 0; i < operationslist.size(); i++) {
            operation = operationslist.get(i).replaceAll("\\s+", "");
            operator = selector.getOperator(password, operation);
            password = operator.encode();
        }
        return password;
    }

    public String decodePassword(String password, List<String> operationslist) {
        String operation;
        Operation operator;
        Selector selector = new Selector();
        for (int i = operationslist.size() - 1; i >= 0; i--) {
            operation = operationslist.get(i).replaceAll("\\s+", "");
            operator = selector.getOperator(password, operation);
            password = operator.decode();
        }
        return password;
    }
}
