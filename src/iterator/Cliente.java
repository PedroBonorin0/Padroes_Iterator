package iterator;

public class Cliente {
  private String nome;
  private boolean compraRealizada;

  public Cliente(String nome, boolean compraRealizada) {
    this.nome = nome;
    this.compraRealizada = compraRealizada;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean hasCompraRealizada() {
    return compraRealizada;
  }

  public void setCompraRealizada(boolean compraRealizada) {
    this.compraRealizada = compraRealizada;
  }
}
