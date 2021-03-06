import java.time.LocalDate;

public class Boleto {
	private int codigo;
	private LocalDate date;
	private int valorPago;
	
	
	public Boleto(LocalDate data, int valorPago, int codigo ) {
		this.date = data;
		this.valorPago = valorPago;
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public LocalDate getDate() {
		return date;
	}
	public int getValorPago() {
		return valorPago;
	}
	
	
}
