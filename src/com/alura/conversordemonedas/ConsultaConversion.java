package com.alura.conversordemonedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Conversion consultaConversion(String base, String target, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/01766ad1dba86648dd6d5606/pair/" + base + "/" + target + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al realizar la transacción.");
        }
    }
}
