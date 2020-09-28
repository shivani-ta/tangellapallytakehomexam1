/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q09_gregoriancalendar;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Shivani tangellapally
 * 
 */
public class gregoriancalendar {

private static Calendar Cal;    
	
        public gregoriancalendar() {
		Cal = Calendar.getInstance();
		Cal.setTime(new Date());
	}
        public static void setDate(long time) {
		Cal.setTimeInMillis(time);
	}
        public static int getYear() {
		return Cal.get(Calendar.YEAR);
	}
        public static String getMonth() {
		switch (Cal.get(Calendar.MONTH) + 1) {
		case 1:
			return "January";
		case 2:
			return "Feburary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		default:
			return "December";
		}
	}
        public static int getDate() {
		return Cal.get(Calendar.DATE);
	}
}
