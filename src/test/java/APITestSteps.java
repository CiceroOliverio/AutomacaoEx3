import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;

public class APITestSteps {

    public String cep;
    public Response response;

    @Dado("^que eu possua um CEP válido para consulta$")
    public void que_eu_possua_um_CEP_válido_para_consulta() {
        String cep ="09822140";
    }

    @Quando("^eu pesquisar o CEP$")
    public void eu_pesquisar_o_CEP() {
        parameters.consultaCEP(cep);
    }

    @Entao("^eu devo ver os dados referentes ao CEP$")
    public void eu_devo_ver_os_dados_referentes_ao_CEP() throws Throwable {
        parameters.exibeResultado(response);

    }


}
