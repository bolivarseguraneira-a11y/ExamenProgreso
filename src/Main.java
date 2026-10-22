public class Main
{
    public static void main(String[] args)
    {
        /*Titulo e inicialización de variables*/
        System.out.println("===== MIND STONE: SINTEZOIDES =====");
        Sintezoide s1 = new Sintezoide();
        Sintezoide s2 = new Sintezoide("Vision");
        Sintezoide s3 = new Sintezoide("Vision blanco", 150, 60);
        Sintezoide s4 = new Sintezoide("Ultron Mk2", 40, -20);
        /*Salida y seteo de modelos */
        s1.setNivelPoder(0);
        s2.setEnergia(130);
        s1.mostrar();
        s2.mostrar();
        s3.mostrar();
        s4.mostrar();
        /*Salida de s3 con su getter*/
        System.out.println("s3: "+ s3.getModelo());
    }

}
