
package Model;

import Persistancia.WebLoader;

public class ExchangeRate {
    private String origen;
    private String destino;
    private float cantidad;

    public ExchangeRate(String origen, String destino, float cantidad) {
        this.origen = origen;
        this.destino = destino;
        this.cantidad=cantidad;
    }
    public float getChange(){
        WebLoader wl= new WebLoader();
        return wl.getRate(origen,destino)*this.cantidad;
    }
}
