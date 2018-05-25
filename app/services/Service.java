package services;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Service {
	
	public java.sql.Date getSqlDate(String dte, String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date parsed = sdf.parse(dte);
        return new java.sql.Date(parsed.getTime());
	}
}
