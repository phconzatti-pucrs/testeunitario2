package br.pucrs.pedroconzatti;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class ContaTest {
private Conta conta;
@Test
public void deposita1000test() {
conta = new Conta(0.0);
conta.depositar(1000.0);
assertEquals(1000.0,conta.getSaldo());
}

@Test
public void setSaldo2000test(){
    conta = new Conta(0);
    conta.setSaldo(2000);
    assertEquals(2000, conta.getSaldo());
}

@Test
public void sacar500test(){
    conta = new Conta(1000);
    conta.sacar(500);
    assertEquals(500, conta.getSaldo());
}
}