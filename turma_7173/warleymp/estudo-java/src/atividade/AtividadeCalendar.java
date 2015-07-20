package atividade;

import java.util.Calendar;

import sun.util.resources.CalendarData;

public class AtividadeCalendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.YEAR, 2015);
		
		System.out.println(c.getTime());
	}

}
