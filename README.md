## Challenge 2 - Alura - Conversor de monedas

- Se creo un programa en JAVA para realizar conversiones de monedas de diferentes paises.
- Dolar USD a Peso Mexicano y vicebersa.
- Euro a Peso Mexicano y vicebersa.
- Peso Mexicano a Peso Argentino y vicebersa.
- Se utilizó la API de Exchange-rate de la fuente https://www.exchangerate-api.com/.
- Al iniciar despliega un menú de opciones a eligir de los tipos de cambio.

**Partes de código...**

```
Clase Record -- public record Conversion(double conversion_rate, double conversion_result) {}

HttpRequest -- HttpClient client = HttpClient.newHttpClient();
 		HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
```
<p>
Programa creado por Muñoz Arce Jessie Alejandro
</p>
