package iker.gcalvino.op2;

public class Selector {

    public Operation getOperator(String password, String operation) {
        switch (operation.substring(0, 3)) {
            case "SWP":
                return new SWP(password, Character.getNumericValue(operation.charAt(3)), Character.getNumericValue(operation.charAt(4)));
            case "SWL":
                return new SWL(password, operation.charAt(3), operation.charAt(4));
            case "ROL":
                return new ROL(password, Character.getNumericValue(operation.charAt(3)));
            case "ROR":
                return new ROR(password, Character.getNumericValue(operation.charAt(3)));
            case "REP":
                return new REP(password, Character.getNumericValue(operation.charAt(3)), Character.getNumericValue(operation.charAt(4)));
            case "MOP":
                return new MOP(password, Character.getNumericValue(operation.charAt(3)), Character.getNumericValue(operation.charAt(4)));
            default:
                return null;
        }
    }
}
