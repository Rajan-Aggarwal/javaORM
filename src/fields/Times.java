package fields;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Times extends ColumnField {

    Date time;

    Times (String time, boolean ... args) throws ParseException {

        super(args);
        this.time = new SimpleDateFormat("hh:mm:ss").parse(time);
    }
}