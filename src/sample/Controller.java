package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea textFelt1;

    public void visHej() {
        textFelt1.appendText("Hej!\n");
    }

    public void visNu() {
        String pattern = "MM/dd/yyyy HH:mm:ss";
        Date date = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat(pattern);
        String nowAsString = df.format(date);
        textFelt1.setText(nowAsString);
    }

    public void visTerning() {
        int dice = (int) (Math.random() * 6) + 1;
        textFelt1.setText(Integer.toString(dice));
    }
}
