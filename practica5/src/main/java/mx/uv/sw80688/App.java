package mx.uv.sw80688;

import static spark.Spark.*;

//import org.eclipse.jetty.client.api.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*port(80);

        get("/", (reg, res) -> "Hola desde Spark");
        get("/hola", (reg, res) -> "Hola hola");
        get("/adios", (reg, res) -> "Adios desde Spark");

        get("/hello: name", request, response) -> {
            return "Hello: " + request.params(" :name");
        });*/

        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        
        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });


    }
}
