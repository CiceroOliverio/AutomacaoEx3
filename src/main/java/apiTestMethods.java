import org.testng.annotations.Test;
import io.restassured.response.Response;


public class apiTestMethods {

    public String cep ="09822140";
    public Response response;



    @Test
    public void APItest(){



    parameters.consultaCEP(cep);
    parameters.exibeResultado(response);

    }


}


