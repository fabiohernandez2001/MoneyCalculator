
package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CurrenciesReader {
    File archive=new File("currencies.txt");
    FileReader fr;
    BufferedReader bf;
    public String[] getCoin(){
        String[] res=new String[3];
        try{
            fr=new FileReader(archive);
            bf =new BufferedReader(fr);
            String linea;
            int c=0;
            while((linea=bf.readLine())!=null){
                res[c]=linea.split(", ")[0];
                c++;
            }
        }catch(IOException e){
            System.out.println("error");
        }
        return res;
    }
}