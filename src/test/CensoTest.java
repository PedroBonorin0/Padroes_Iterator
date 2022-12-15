package test;

import iterator.Censo;
import iterator.Cliente;
import iterator.Plataforma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {
  @Test
  void deveContarClientesComComprasRealizadas() {
    Plataforma plataforma = new Plataforma(
      new Cliente("Pedro", true),
      new Cliente("Carlos", true),
      new Cliente("Maria", false),
      new Cliente("Gilberto", true),
      new Cliente("Renata", false)
    );
    assertEquals(3, Censo.contarClientesComCompraRealizada(plataforma));
  }

  @Test
  void deveContarTotalClientesPlataforma() {
    Plataforma plataforma = new Plataforma(
      new Cliente("Pedro", true),
      new Cliente("Carlos", true),
      new Cliente("Maria", false),
      new Cliente("Gilberto", true),
      new Cliente("Renata", true)
    );
    assertEquals(5, Censo.contarTotalClientes(plataforma));
  }

  @Test
  void deveCalcularPorcentagemClientesCompradores() {
    Plataforma plataforma = new Plataforma(
      new Cliente("Pedro", true),
      new Cliente("Carlos", true),
      new Cliente("Maria", false),
      new Cliente("Gilberto", true),
      new Cliente("Renata", false)
    );
    assertEquals(60f, Censo.calcularPorcentagemClientesCompradores(plataforma), 0.01);
  }}