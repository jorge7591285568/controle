package br.edu.ifba.saj.ads.poo;

import java.time.LocalDate;

public class Auto {

  public static void main(String[] args) {
    Carro carro = new Carro("volks", "Gol", 2000, 20.0, yes, 5);
    Carro carro1 = new Carro("Hunday", "hilux", 2020, 50.0, yes, 5);
    Carro carro2 = new Carro("fiat", "Mobi", 2010, 30.0, yes, 4);

    Cliente cliente = new Cliente(
      "jorge",
      "12345678901",
      "75999990101",
      "jorge75999990101@hotmail.com"
    );
    Cliente cliente1 = new Cliente(
      "jorge1",
      "12345678902",
      "75999990102",
      "jorge75999990102@hotmail.com"
    );
    Cliente cliente2 = new Cliente(
      "jorge2",
      "12345678903",
      "75999990103",
      "jorge75999990103@hotmail.com"
    );

    Reserva reserva = new Reserva(cliente, carro, "10/02/2020", "20/02/2020");
    /*reserva.calcularValorTotal((dataFim - dataInicio)*Diaria);*/

    System.out.println("Data de Início: " + reserva.getDataInicio());
    System.out.println("Data de Fim: " + reserva.getDataFim());
    System.out.println("Cliente: " + reserva.getCliente().getNome());
    System.out.println("Carro: " + reserva.getCarro().getModelo());
    System.out.println("Valor Total: " + reserva.getValorTotal());
  }
}
