import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class parameters {

    public static void chamaAPI() {


        RequestSpecification request=RestAssured.given();
        request.header("Content-type","text/html");

        Response response =request.post("https://buscarcep.com.br/?cep=04244000&formato=string&chave=Chave_Gratuita_BuscarCep&identificador=CLIENTE1");

        int code = response.getStatusCode();
        Assert.assertEquals(code,200);

        System.out.println(response.asString());

    }

    public static void exibeResultado(String response){
        System.out.println(response);
    }

}
