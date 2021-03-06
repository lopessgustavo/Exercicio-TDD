import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Fatura")
public class FaturaTest {

	private Fatura fatura;
	
	public void inicializa(LocalDate data, int valorTotal, String nomeDoCliente, String status) {
		fatura = new Fatura(data, valorTotal, nomeDoCliente, status);
	}
	@DisplayName("Teste GetNome")
	@Test
	void testGetNome() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes","NAO_PAGA");
		Assertions.assertEquals("Gustavo Lopes", fatura.getNome());
	}
	
	@Test
	@DisplayName("Teste getValorTotal")
	void testGetValorTotal() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes", "NAO_PAGA");
		Assertions.assertEquals(1000, fatura.getValorTotal());
	}
	
	@Test
	@DisplayName("Teste GetDate")
	void testGetDate() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes", "NAO_PAGA");
		Assertions.assertEquals(LocalDate.now(), fatura.getDate());
	}
	
	@Test
	@DisplayName("Teste getStatus")
	void testGetStatus() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes", "NAO_PAGA");
		Assertions.assertEquals("NAO_PAGA", fatura.getStatus());
	}

}
