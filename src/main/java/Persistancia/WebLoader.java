
package Persistancia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebLoader {
    private String url="https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/";
    public float getRate(String origen, String destino){
        String web=url+origen+"/"+destino+".json";
        try{
            BufferedReader bf= new BufferedReader(new InputStreamReader(new URL(web).openStream()));
            String lectura;
            while((lectura=bf.readLine())!=null && !lectura.contains(destino));
            return Float.parseFloat(lectura.split(": ")[1]);
        }
        catch(IOException e){
            System.out.println("No se encuentra la divisa");
        }
        return 0;
    }
}