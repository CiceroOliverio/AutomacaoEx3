import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class parameters {

    public Response response;

    public static Response consultaCEP(String cep) {


        RequestSpecification request=RestAssured.given();
        request.header("Content-type","text/html");

        Response response =request.post("https://buscarcep.com.br/?cep="+cep+"&formato=string&chave=Chave_Gratuita_BuscarCep&identificador=CLIENTE1");

        return response;
    }


    public static void exibeResultado(Response response){
        System.out.println(response);
    }

}
