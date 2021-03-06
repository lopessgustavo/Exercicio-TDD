import java.time.LocalDate;

public class Pagamento {

	private int valor;
	private LocalDate data;
	private String tipo;
	
	public Pagamento(int valor, LocalDate data, String tipo) {
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public LocalDate getDate() {
		return data;
	}

	public String getTipo() {
		return tipo;
	}

}
