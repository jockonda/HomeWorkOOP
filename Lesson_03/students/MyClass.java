package students;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClass {

	public static void main(String[] args) throws ParseException {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		
		int n = sl.findName("Seva");
		System.out.println(sl.get(n).getBirth().toString());

        int m = sl.findSurname("Pupkin");
        System.out.println(sl.get(m).getBirth().toString());

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date date;
        date = new Date(1970, 3, 28);
        //date = format.parse("1970.03.28");

        int index = sl.findBirth(date);
        System.out.println(sl.get(index).getBirth().toString());

        /*int d = sl.findSurname("Evgienko");
        sl.dellStudent(sl.get(d).toString());
        System.out.println(sl.toString());*/

	}
}
