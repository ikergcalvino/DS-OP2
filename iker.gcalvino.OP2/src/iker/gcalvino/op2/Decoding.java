package iker.gcalvino.op2;

public class Decoding implements Operation {

    @Override
    public String operate(String password, String operation) {
        int x, y;
        char a, b;
        String comparation = password;
        StringBuilder changes = new StringBuilder(password); // copia de password modificable
        switch (operation.substring(0, 3)) {
            case "SWP":
                break;

            case "SWL":
                break;

            case "ROL":
                break;

            case "ROR":
                break;

            case "REP":
                break;

            case "MOP":
                break;

            default:
                break;
        }
        return password;
    }

}
