import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Boleto")
public class ProcessadorTest {

	private Processador processador;
	private ArrayList<Boleto> boletos;
	private Fatura fatura;
	
	public void inicializa() {
		processador = new Processador();
	}
	
	
	@Test
	@DisplayName("Teste do metodo de pagamento 1")
	public void testRealizarPagamento1() {
		boletos.add(new Boleto(LocalDate.now(), 500, 0));
		boletos.add(new Boleto(LocalDate.now(), 400, 0));
		boletos.add(new Boleto(LocalDate.now(), 600, 0));
		fatura = new Fatura(LocalDate.now(), 1500, "Gustavo", "NAO_PAGA");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		ArrayList<Pagamento> pagamentosRealizados = processador.realizarPagamento(boletos);
		
		pagamentos.add(new Pagamento(500,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(400,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(600,LocalDate.now(), "BOLETO"));
		

		Assertions.assertAll(() -> assertEquals(pagamentos, pagamentosRealizados),
							()-> assertEquals(fatura.getStatus(), "PAGA")
				);
	}
	
	@Test
	@DisplayName("Teste do metodo de pagamento 2")
	public void testRealizarPagamento2() {
		boletos.add(new Boleto(LocalDate.now(), 1000, 0));
		boletos.add(new Boleto(LocalDate.now(), 500, 0));
		boletos.add(new Boleto(LocalDate.now(), 250, 0));
		fatura = new Fatura(LocalDate.now(), 2000, "Gustavo", "NAO_PAGA");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		ArrayList<Pagamento> pagamentosRealizados = processador.realizarPagamento(boletos);
		
		pagamentos.add(new Pagamento(400,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(500,LocalDate.now(), "BOLETO"));

		Assertions.assertAll(() -> assertEquals(pagamentos, processador.realizarPagamento(boletos, fatura)),
				()-> assertEquals(fatura.getStatus(), "NAO_PAGA")
				);
	}
	
}
