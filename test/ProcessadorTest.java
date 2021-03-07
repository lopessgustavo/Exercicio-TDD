import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe Boleto")
public class ProcessadorTest {

	private Processador processador = new Processador();
	private ArrayList<Boleto> boletos;
	private Fatura fatura;
	boolean flag = true;
	
	@Test
	@DisplayName("Teste do metodo de pagamento 1")
	public void testRealizarPagamento1() {
		
		boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(LocalDate.now(), 500, 0));
		boletos.add(new Boleto(LocalDate.now(), 400, 0));
		boletos.add(new Boleto(LocalDate.now(), 600, 0));
		fatura = new Fatura(LocalDate.now(), 1500, "Gustavo", "NAO_PAGA");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		ArrayList<Pagamento> pagamentosRealizados = processador.realizarPagamento(boletos, fatura);
		
		pagamentos.add(new Pagamento(500,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(400,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(600,LocalDate.now(), "BOLETO"));

		
		for(int i = 0; i < pagamentos.size(); i++) {
			if(!pagamentos.get(i).getDate().isEqual(pagamentosRealizados.get(i).getDate())) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getTipo() != pagamentosRealizados.get(i).getTipo()) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getValor() != pagamentosRealizados.get(i).getValor()) {
				flag = false;
				break;
			}
		}
		Assertions.assertAll(() -> assertTrue(flag), () -> Assertions.assertEquals(fatura.getStatus(), "PAGA"));

	}
	
	@Test
	@DisplayName("Teste do metodo de pagamento 2")
	public void testRealizarPagamento2() {
		boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(LocalDate.now(), 1000, 0));
		boletos.add(new Boleto(LocalDate.now(), 500, 0));
		boletos.add(new Boleto(LocalDate.now(), 250, 0));
		fatura = new Fatura(LocalDate.now(), 1500, "Gustavo", "NAO_PAGA");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		ArrayList<Pagamento> pagamentosRealizados = processador.realizarPagamento(boletos,fatura);
		
		pagamentos.add(new Pagamento(1000,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(500,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(250,LocalDate.now(), "BOLETO"));

		for(int i = 0; i < pagamentos.size(); i++) {
			if(!pagamentos.get(i).getDate().isEqual(pagamentosRealizados.get(i).getDate())) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getTipo() != pagamentosRealizados.get(i).getTipo()) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getValor() != pagamentosRealizados.get(i).getValor()) {
				flag = false;
				break;
			}
		}
		Assertions.assertAll(() -> assertTrue(flag), () -> Assertions.assertEquals(fatura.getStatus(), "PAGA"));
	}
	
	@Test
	@DisplayName("Teste do metodo de pagamento 3")
	public void testRealizarPagamento3() {
		boletos = new ArrayList<Boleto>();
		boletos.add(new Boleto(LocalDate.now(), 400, 0));
		boletos.add(new Boleto(LocalDate.now(), 500, 0));
		fatura = new Fatura(LocalDate.now(), 2000, "Gustavo", "NAO_PAGA");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		ArrayList<Pagamento> pagamentosRealizados = processador.realizarPagamento(boletos,fatura);
		
		pagamentos.add(new Pagamento(400,LocalDate.now(), "BOLETO"));
		pagamentos.add(new Pagamento(500,LocalDate.now(), "BOLETO"));

		for(int i = 0; i < pagamentos.size(); i++) {
			if(!pagamentos.get(i).getDate().isEqual(pagamentosRealizados.get(i).getDate())) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getTipo() != pagamentosRealizados.get(i).getTipo()) {
				flag = false;
				break;
			}
			if(pagamentos.get(i).getValor() != pagamentosRealizados.get(i).getValor()) {
				flag = false;
				break;
			}
		}
		Assertions.assertAll(() -> assertTrue(flag), () -> Assertions.assertEquals(fatura.getStatus(), "NAO_PAGA"));
	}
	
}
