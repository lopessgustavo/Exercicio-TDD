import java.time.LocalDate;
import java.util.ArrayList;

public class Processador {

	public ArrayList<Pagamento> realizarPagamento(ArrayList<Boleto> boletos, Fatura fatura) {
		int saldoTotal = 0;
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		
		for(Boleto boleto : boletos) {
			saldoTotal += boleto.getValorPago();
			pagamentos.add(new Pagamento(boleto.getValorPago(), LocalDate.now(), "BOLETO"));
		}
		
		if(saldoTotal >= fatura.getValorTotal()) {
			fatura.setStatus("PAGA");
		}
		
		return pagamentos;
	}

}
