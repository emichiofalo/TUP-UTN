/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;

import java.lang.reflect.Method;
import java.math.BigInteger;

/**
 *
 * @author  nb
 */
public class Utiles {

    private Utiles() { }


    public static String concatenaPalabras(String... palabras) {
        StringBuilder buf = new StringBuilder();
        for (String palabra : palabras) {
            buf.append(palabra);
        }
        return buf.toString();
    }

    public static String Factorial(int number)
                                               throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("parametro incorrecto (" + number + ')');
        }

        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial.toString();
    }

    public static String normalizarPalabra(String word) {
        try {
            int i;
            Class<?> normalizerClass = Class.forName("java.text.Normalizer");
            Class<?> normalizerFormClass = null;
            Class<?>[] nestedClasses = normalizerClass.getDeclaredClasses();
            for (i = 0; i < nestedClasses.length; i++) {
                Class<?> nestedClass = nestedClasses[i];
                if (nestedClass.getName().equals("java.text.Normalizer$Form")) {
                    normalizerFormClass = nestedClass;
                }
            }
            assert normalizerFormClass.isEnum();
            Method methodNormalize = normalizerClass.getDeclaredMethod(
                                                            "normalize",
                                                            CharSequence.class,
                                                            normalizerFormClass);
            Object nfcNormalization = null;
            Object[] constants = normalizerFormClass.getEnumConstants();
            for (i = 0; i < constants.length; i++) {
                Object constant = constants[i];
                if (constant.toString().equals("NFC")) {
                    nfcNormalization = constant;
                }
            }
            return (String) methodNormalize.invoke(null, word, nfcNormalization);
        } catch (Exception ex) {
            return null;
        }
    }

}
