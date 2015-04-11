package students;

import java.util.Date;

public class StudentList {
	private Student[] list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		list[p++] = s;
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public int findName(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

    public int findSurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }

        return -1;
    }

    public int findBirth(Date birth) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(birth))
                return i;
        }

        return -1;
    }

    public void dellStudent(String surname) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname)) {
                list[i] = null;
                break;
            }
        }
    }

}
