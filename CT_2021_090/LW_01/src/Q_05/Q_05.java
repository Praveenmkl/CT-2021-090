package Q_05;
import java.text.SimpleDateFormat;
import java.util.Date;

class DATE {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE-dd-mm-yyyy");

        System.out.println(simpleDateFormat.format(today));
    }
}
