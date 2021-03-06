import java.time.LocalDate;

public class Fatura {
	private String nome;
	private LocalDate date;
	private int valorTotal;
	
	
	public Fatura(LocalDate data, int valorTotal, String nomeDoCliente ) {
		this.nome = nomeDoCliente;
		this.date = data;
		this.valorTotal = valorTotal;
	}
	
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public String getNome() {
		return nome;
	}
	public int getValorTotal() {
		return valorTotal;
	}
}
