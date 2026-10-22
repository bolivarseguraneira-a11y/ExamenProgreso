public class Sintezoide
{ /*Inicializamos clase*/
    private String modelo;
    private int nivelPoder;
    private int energia;
    /*Getters*/
    public String getModelo() {
        return modelo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public int getEnergia() {
        return energia;
    }
    /*Setters con su validación*/
    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = Math.max(1, Math.min(100,nivelPoder)); /*Validamos con Math el rango*/
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }
    /*Constructor con Parametros*/
    public Sintezoide(String modelo, int nivelPoder, int energia)
    {
       this.modelo=modelo;
       setNivelPoder(nivelPoder);
       setEnergia(energia);
    }
    /*Constructor sin Parametros (Por defecto)*/
    public Sintezoide()
    {
        this("Prototipo", 1,100);
    }
    /*Sobrecarga*/
    public Sintezoide(String modelo)
    {
        this(modelo,10,100);
    }
    /*Imprime linea con el formato*/
    public void mostrar()
    {
        System.out.println("Modelo: " + modelo + " | Poder: " + nivelPoder + " | Energía:  " + energia );
    }
}
