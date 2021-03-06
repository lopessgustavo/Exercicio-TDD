import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Boleto")
public class BoletoTest {

	private Boleto boleto;
	
	public void inicializa(LocalDate data, int valorPago, int codigo ) {
		boleto = new Boleto(data, valorPago, codigo);
	}
	@DisplayName("Teste GetCodigo")
	@Test
	void testGetNome() {
		inicializa(LocalDate.now(), 1000, 0);
		Assertions.assertEquals(0, boleto.getCodigo());
	}
	
	@Test
	@DisplayName("Teste getValorPago")
	void testGetvalorPago() {
		inicializa(LocalDate.now(), 1000, 0;
		Assertions.assertEquals(1000, boleto.getvalorPago());
	}
	
	@Test
	@DisplayName("Teste GetDate")
	void testGetDate() {
		inicializa(LocalDate.now(), 1000, 0);
		Assertions.assertEquals(LocalDate.now(), boleto.getDate());
	}

}
