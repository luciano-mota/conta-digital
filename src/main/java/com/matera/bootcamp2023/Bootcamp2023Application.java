package com.matera.bootcamp2023;

import com.matera.bootcamp2023.carteira.Conta;
import com.matera.bootcamp2023.carteira.Titular;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Bootcamp2023Application {

	public static void main(String[] args) {

		var titular1 = new Titular("Mamedio", "12334456567");

		var conta1 = new Conta(1, 1, BigDecimal.ZERO, titular1);
		var conta2 = new Conta(2, 2, BigDecimal.ONE, titular1);
		var conta3 = new Conta(3, 3, BigDecimal.ONE, titular1);

		titular1.adicionarConta(conta1);
		titular1.adicionarConta(conta2);

		
		titular1.mostrarContas();

		//SpringApplication.run(Bootcamp2023Application.class, args);
	}

}
