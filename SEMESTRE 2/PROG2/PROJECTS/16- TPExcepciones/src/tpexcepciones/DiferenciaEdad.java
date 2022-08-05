package tpexcepciones;

/**
 *
 * @author Emi Chiófalo
 */
import java.util.Calendar;

public class DiferenciaEdad {

    public static int diferenciaFecha(Calendar fecha) {
        Calendar fechaActual = Calendar.getInstance();

        int resultado = fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.MONTH) < fecha.get(Calendar.MONTH)) {
            resultado--;
        } else {
            if (fechaActual.get(Calendar.MONTH) == fecha.get(Calendar.MONTH)) {
                if (fechaActual.get(Calendar.DATE) < fecha.get(Calendar.DATE)) {
                    resultado--;
                }
            }
        }
        return resultado;
    }
}

