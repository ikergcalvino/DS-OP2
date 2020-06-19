package iker.gcalvino.op2;

public class Encoding implements Operation {

    @Override
    public String operate(String password, String operation) {
        int x, y;
        char a, b;
        String comparation = password;
        StringBuilder changes = new StringBuilder(password); // copia de password modificable
        switch (operation.substring(0, 3)) {
            case "SWP":
                x = Character.getNumericValue(operation.charAt(3)); // posición x
                y = Character.getNumericValue(operation.charAt(4)); // posición y
                if (x <= password.length() && y <= password.length()) {
                    a = password.charAt(x); // letra en x
                    b = password.charAt(y); // letra en y
                    changes.setCharAt(x, b); // cambio del letra en x por b
                    changes.setCharAt(y, a); // cambio del letra en y por a
                }
                password = changes.toString();
                break;

            case "SWL":
                a = operation.charAt(3); // letra a
                b = operation.charAt(4); // letra b
                password = password.replace(a, b); // sustituir todas las letras a por letras b
                changes = new StringBuilder(password);
                for (int i = 0; i < password.length(); i++) {
                    // comprueba si en la posición i del String de cambios está la letra a y en el String original también
                    if (changes.charAt(i) == b && changes.charAt(i) == comparation.charAt(i)) {
                        changes.setCharAt(i, a);
                    }
                }
                password = changes.toString(); // asignar los cambios a password
                break;

            case "ROL":
                x = Character.getNumericValue(operation.charAt(3));
                password = password.substring(x) + password.substring(0, x);
                break;

            case "ROR":
                x = Character.getNumericValue(operation.charAt(3));
                x = password.length() - x;
                password = password.substring(x) + password.substring(0, x);
                break;

            case "REP":
                x = Character.getNumericValue(operation.charAt(3));
                y = Character.getNumericValue(operation.charAt(4));
                if (x > y) {
                    x = Character.getNumericValue(operation.charAt(4));
                    y = Character.getNumericValue(operation.charAt(3));
                }
                if (x <= password.length() && y <= password.length()) {
                    changes = new StringBuilder(password.substring(x, y + 1));
                    changes = changes.reverse();
                    password = password.substring(0, x) + changes.toString() + password.substring(y + 1); //
                }
                break;

            case "MOP":
                x = Character.getNumericValue(operation.charAt(3));
                y = Character.getNumericValue(operation.charAt(4));
                a = password.charAt(x);
                password = password.substring(0, x) + password.substring(x + 1);
                changes = new StringBuilder(password);
                changes.insert(y, a);
                password = changes.toString();
                break;

            default:
                break;
        }
        return password;
    }

}
