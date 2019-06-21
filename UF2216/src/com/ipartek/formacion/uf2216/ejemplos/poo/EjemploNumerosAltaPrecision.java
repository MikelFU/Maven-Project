package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Date;

public class EjemploNumerosAltaPrecision {

	public static void main(String[] args) {
		BigDecimal euros = new BigDecimal(123.45, new MathContext(5)); //new BigDecimal("123.45");
		

		System.out.println(euros);
		
		System.out.println(euros.multiply(new BigDecimal("1.21"), new MathContext(5)));
		
		BigInteger numeroDeDisposotivosIoTEnElMundoFuturo = new BigInteger("9000000000000000000001000000007897896"); 
		System.out.println(numeroDeDisposotivosIoTEnElMundoFuturo);
		
		BigDecimal Resultado = euros.divide(new BigDecimal(3.4), new MathContext(1000));	//Integer.MAX_VALUE
		System.out.println(Resultado);
		
		System.out.println(Resultado.doubleValue());

		double d = 123.45;
		
		long inicio, fin, ms;
		inicio = new Date().getTime();
		double resultadoDouble = d / 3.4;
		fin = new Date().getTime();

		ms = fin - inicio;
		
		System.out.println(resultadoDouble);
		
		System.out.println(ms);
		
	}

}
