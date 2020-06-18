package iker.gcalvino.op2;

public class Encoding implements Operation {

    @Override
    public void operate(String password, String operation) {
        int x, y;
        char a, b;
        String comparation = password;
        StringBuilder changes = new StringBuilder(password); // copia de password modificable
        switch (operation.substring(0, 2)) {
            case "SWP":
                x = operation.charAt(3); // posición x
                y = operation.charAt(4); // posición y
                a = password.charAt(x); // letra en x
                b = password.charAt(y); // letra en y
                changes.setCharAt(x, b); // cambio del letra en x por b
                changes.setCharAt(y, a); // cambio del letra en y por a
                password = new String(changes); // asignar los cambios a password
                break;
            case "SWL":
                a = operation.charAt(3); // letra a
                b = operation.charAt(4); // letra b
                password = password.replace(a, b); // sustituir todas las letras a por letras b
                changes = new StringBuilder(password);
                for (int i = 0; i < password.length(); i++) {
                    // comprueba si en la posición i del String de cambios está la letra a y en el String original también
                    if (changes.charAt(i) == a && changes.charAt(i) == comparation.charAt(i)) {
                        changes.setCharAt(i, a);
                    }
                }
                password = new String(changes); // asignar los cambios a password
                break;
            case "ROL":
                x = operation.charAt(3); // posición x
                password = password.substring(x + 1) + password.substring(0, x); // concatenar los 2 substrings
                break;
            case "ROR":
                x = operation.charAt(3); // posición x desde el final
                x = password.length() - x; // calculo de la posición x desde el inicio del String
                password = password.substring(x) + password.substring(0, x - 1); // concatenar los 2 substrings
                break;
            case "REP":
                x = operation.charAt(3);
                y = operation.charAt(4);
                changes = new StringBuilder(password.substring(x, y));
                changes = changes.reverse();
                if (x != 0 && y != password.length()) {
                    password = password.substring(0, x - 1) + changes + password.substring(y + 1); //
                } else {
                    if (x == 0) {
                        password = changes + password.substring(y); //
                    }
                    if (y == password.length()) {
                        password = password.substring(0, x - 1) + changes; //
                    }
                    if (x == 0 && y == password.length()) {
                        password = new String(changes); //
                    }
                }
                break;
            case "MOP":
                x = operation.charAt(3);
                y = operation.charAt(4);
                break;
            default:
                break;
        }
    }

}
