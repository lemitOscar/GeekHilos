package ClasePrincipal;

public class Principal {

    public static void main(String[] args) {
//        for (int i = 0+1; i <= 5; i++) {
//            System.out.println("proceso 1");
//        }
//        System.out.println("..................");
//         for (int i = 0+1; i <= 5; i++) {
//            System.out.println("proceso 2");
//        }

        //esto con herencia
        Proce1 kate1 = new Proce1();
        //hay que arrancar el hilo
        //con la implementacion se hace una instancia de thread
        Thread kate2 = new Thread(new Proce2());

        //al ultimo se corren para que sean simultaneas
        kate1.start();

        kate2.start();
    }
}
