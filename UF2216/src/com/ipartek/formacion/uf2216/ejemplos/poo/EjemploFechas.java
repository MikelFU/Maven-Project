package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class EjemploFechas {

	public static void main(String[] args) {
		Date ahora = new Date();
		System.out.println(ahora);

		Date inicioCurso = new Date(2019 - 1900, 6 - 1, 12, 8, 30);
		System.out.println(inicioCurso);

		Calendar ahoraNuevo = Calendar.getInstance();
		System.out.println(ahoraNuevo);
		System.out.println(ahoraNuevo.get(Calendar.DAY_OF_WEEK));
		
		Date hoy = new Date();
		DateTime dt = new DateTime(hoy);
		
		DateTime dentroDe30Dias = dt.plusDays(30);
		System.out.println(dentroDe30Dias);
		
		DateTime dentroDe3Meses = dt.plusMonths(3);
		System.out.println(dentroDe3Meses);
		
		DateTime finDeEnero = new DateTime(2019,1,31, 0, 0,0 );
		System.out.println(finDeEnero);
	}

}
