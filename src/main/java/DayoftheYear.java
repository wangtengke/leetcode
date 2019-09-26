import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-08-11
 **/
public class DayoftheYear {
    public int dayOfYear(String str) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");

        Date date= null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar ca = Calendar.getInstance();//创建一个日期实例

        ca.setTime(date);//实例化一个日期
        return ca.get(Calendar.DAY_OF_YEAR);
    }

    public static void main(String[] args) {
        DayoftheYear dayoftheYear = new DayoftheYear();
        dayoftheYear.dayOfYear("2019-01-10");
    }

}
