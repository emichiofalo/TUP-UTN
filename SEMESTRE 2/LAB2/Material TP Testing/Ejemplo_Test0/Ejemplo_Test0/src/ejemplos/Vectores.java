/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;

/**
 * Sample utility class for vector algebra.
 *
 * @author  nb
 */
public final class Vectores {

    private Vectores() {}

    public static boolean igual(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("argumento nulo");
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }


    public static int multiplicacionEscalar(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("argumento nulo");
        }

        if (a.length != b.length) {
            throw new IllegalArgumentException(
                    "diferencia en vectores ("
                    + a.length + ", " + b.length + ')');
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

}
