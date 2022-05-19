package bote;

public class Main {

    
    public static void main(String[] args) {
        Bote titan;
        int centilitros=300;
        int centimos=200;
        int metros=2;
        
        titan=new Bote(300,10,"verde",2,500);
       
        pintar(titan, metros);
        
        rellenarBote(titan, centilitros, centimos);
    }

    /**
     * Rellenaremos un bote de pintura
     * @param bote. nombre del objeto Bote
     * @param centilitros
     * @param centimos 
     * @exception Exception. Error al rellenar el bote
     */
    private static void rellenarBote(Bote bote, int centilitros, int centimos) {
        try {
            System.out.println("Vamos a rellenar el bote");
            bote.rellenar(centilitros, centimos);
            System.out.println("Recarga realizada, ahora tiene "+bote.getContenido()+" centilitros en el bote");
        } catch (Exception e) {
            System.out.println("Error al rellenar el bote, el contenido sigue siendo: "+bote.getContenido());
            
        }
    }

    /**
     * Vamos a intentar añadir 300 centilitros al bote, como se supera la capacidad saltará
        una excepción y no se modificará el contenido del depósito que seguirá siendo 280cl
     * @param bote
     * @param metros 
     * @exception Exception. Error al pintar
     */
    private static void pintar(Bote bote, int metros) {
        /*Vamos a pintar 2 metros, como hay sufuiciente pintura la operación tendrá éxito y se
        descontarán 20 centilitros del contenido del bote, quedan 280cl*/
        try {
            System.out.println("Vamos a pintar");
            bote.pintar(metros);
            System.out.println("En el bote quedan "+bote.getContenido()+" centilitros");
        } catch (Exception e) {
            System.out.println("Error al pintar");
        }
    }
    
}
