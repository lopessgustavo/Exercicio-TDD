import java.time.LocalDate;

public class Fatura {
	private String nome;
	private LocalDate date;
	private int valorTotal;
	private String status;
	
	public Fatura(LocalDate data, int valorTotal, String nomeDoCliente, String status) {
		this.nome = nomeDoCliente;
		this.date = data;
		this.valorTotal = valorTotal;
		this.setStatus(status);
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




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}
}
