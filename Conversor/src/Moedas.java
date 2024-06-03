import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;


public class Moedas {
    String valorDigitado;
    String resultado;

    String moeda1;
    String moeda2;

    public void consulta() throws IOException {
        String url_str = "https://v6.exchangerate-api.com/v6/7f1476d8fc2460ef1be67222/pair/"+moeda1+"/"+moeda2+"/" + valorDigitado;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        this.resultado= jsonobj.get("conversion_result").getAsString();

    }


    @Override
    public String toString() {
        return "Valor: "+valorDigitado+" "+moeda1+" Corresponde ao valor final "+resultado+" "+moeda2;
    }
}


