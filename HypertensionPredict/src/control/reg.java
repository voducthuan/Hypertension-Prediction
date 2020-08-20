package control;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.model.SelectItem;

public class reg {

    private static final int HIGH_SCHOOL = 1;
    private static final int BACHELOR = 2;
    private static final int MASTER = 3;
    private static final int DOCTOR = 4;
    private static SelectItem[] educationItems = new SelectItem[]{
       new SelectItem(new Integer(HIGH_SCHOOL), "High School"),
       new SelectItem(new Integer(BACHELOR), "Bachelor's"),
       new SelectItem(new Integer(MASTER), "Master's"),
       new SelectItem(new Integer(DOCTOR), "Doctorate") };

    private int education=2;
    public reg() {

    }
    // PROPERTY: education

    public int getEducation() {
       return education;
    }

    public void setEducation(int newValue) {
       education = newValue;
    }
    // PROPERTY: educationItems

    public SelectItem[] getEducationItems() {
       return educationItems;
    }
}
