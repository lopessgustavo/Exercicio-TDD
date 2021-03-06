import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Fatura")
public class FaturaTest {

	private Fatura fatura;
	
	public void inicializa(LocalDate data, int valorTotal, String nomeDoCliente ) {
		fatura = new Fatura(data, valorTotal, nomeDoCliente);
	}
	@DisplayName("Teste GetNome")
	@Test
	void testGetNome() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes");
		Assertions.assertEquals("Gustavo Lopes", fatura.getNome());
	}
	
	@Test
	@DisplayName("Teste getValorTotal")
	void testGetValorTotal() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes");
		Assertions.assertEquals(1000, fatura.getValorTotal());
	}
	
	@Test
	@DisplayName("Teste GetDate")
	void testGetDate() {
		inicializa(LocalDate.now(), 1000, "Gustavo Lopes");
		Assertions.assertEquals(LocalDate.now(), fatura.getDate());
	}

}
