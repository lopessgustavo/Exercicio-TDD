import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Pagamento")
public class PagamentoTest {

	private Pagamento pagamento;
	
	public void inicializa(int valor, LocalDate data, String tipo) {
		pagamento = new Pagamento(valor,data,tipo);
	}
	
	@Test
	@DisplayName("Teste getValor")
	public void testGetValor() {
		inicializa(100,LocalDate.now(), "BOLETO");
		assertEquals(100, pagamento.getValor());
	}
	@Test
	@DisplayName("Teste getDate")
	public void testGetDate() {
		inicializa(100,LocalDate.now(), "BOLETO");
		assertEquals(LocalDate.now(), pagamento.getDate());
	}
	@Test
	@DisplayName("Teste getTipo")
	public void testGetTipo() {
		inicializa(100,LocalDate.now(), "BOLETO");
		assertEquals("BOLETO", pagamento.getTipo());
	}
}
