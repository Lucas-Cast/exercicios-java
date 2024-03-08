public class Cryptographye {
    public String criptografar (String texto) {
        String textoCriptografado = "";
        int codigoASCII = 0;
        texto = texto.toLowerCase();
        for ( int i = 0; i < texto.length(); i++ ) {
            if (texto.codePointAt(i) >= 97 && texto.codePointAt(i) <= 122) {
                if (texto.codePointAt(i) + 3 > 122) {
                    codigoASCII += (texto.codePointAt(i) + 3 - 122) + 96;
                } else {
                    codigoASCII += texto.codePointAt(i) + 3;
                }
                textoCriptografado += (char) codigoASCII;

            } else {
                textoCriptografado += texto.charAt(i);
            }
        }
        return textoCriptografado;
    }

    public String descriptografar (String texto ) {
        int codigoASCII = 0;
        texto = texto.toLowerCase();
        String textoDescriptografado = "";
        for ( int i = 0; i < texto.length(); i++ ) {
            if (texto.codePointAt(i) >= 97 && texto.codePointAt(i) <= 122) {
                if (texto.codePointAt(i) - 3 < 97) {
                    codigoASCII += (texto.codePointAt(i) - 3 - 97) + 123;
                } else {
                    codigoASCII += texto.codePointAt(i) - 3;
                }
                textoDescriptografado += (char) codigoASCII;

            } else {
                textoDescriptografado += texto.charAt(i);
            }
        }
        return textoDescriptografado;
    }
}
