package ejeprofiling2;

class Hilo extends Thread {

    String mensaje = "1";

    public Hilo(String mens) {
        mensaje = mens;
    }

    public void run() {
        int i = 0;
        while (i++ < 100000) {
            System.out.println("soy el hilo " + mensaje);
            try {
                if (mensaje.equals("hilo1")) {
                    sleep(5000);
                    while (i++ < 100000) { System.out.println("algo"); }
                } else {
                    sleep(1000);
                    while (i++ < 100000) { System.out.println("algo"); }
                }
            } catch (Exception e) {
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Hilo h1 = new Hilo("hilo1");
        Hilo h2 = new Hilo("hilo2");
        Hilo h3 = new Hilo("hilo3");

        h1.start();
        h2.start();
        h3.start();



    }
}
