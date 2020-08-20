package hypertension;

import norsys.netica.*;
import java.util.Vector;

public class HypertensionBN {
    private static Net hypertensionNet;

    private Node age;
    private Node sex;
    private Node bmi;
    private Node whi;
    private Node systoleBloodPressure;
    private Node diastoleBloodPressure;
    private Node cholesterol;
    private Node glycemic;
    private Node triglycerid;
    private Node hdl_C;
    private Node ldl_C;
    private Node diabetesPastHistory;
    private Node smoking;
    private Node exercise;
    private Node hypertension;

    public HypertensionBN() {
            try {
                if(hypertensionNet == null)
                {
                    Environ env = new Environ("+HaddawyP/AIT/120,310-3-A/22767");
                    hypertensionNet = new Net(new Streamer("../Hypertension.dne"));
                }
                age = hypertensionNet.getNode("Age");
                sex = hypertensionNet.getNode("Sex");
                bmi = hypertensionNet.getNode("BMI");
                whi = hypertensionNet.getNode("WHI");
                systoleBloodPressure = hypertensionNet.getNode("Systole_Blood_Pressure");
                diastoleBloodPressure = hypertensionNet.getNode("Diastole_Blood_Pressure");
                cholesterol = hypertensionNet.getNode("Cholesterol");
                glycemic = hypertensionNet.getNode("Glycemic");
                triglycerid = hypertensionNet.getNode("Triglycerid");
                hdl_C = hypertensionNet.getNode("HDL_C");
                ldl_C = hypertensionNet.getNode("HDL_C");
                diabetesPastHistory = hypertensionNet.getNode("Diabetes_Past_History");
                smoking = hypertensionNet.getNode("Smoking");
                exercise = hypertensionNet.getNode("Exercise");
                hypertension = hypertensionNet.getNode("Hypertension");
                hypertensionNet.compile();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void freeResource()
    {
        try {
            hypertensionNet.finalize();   // not strictly necessary, but a good habit
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void retractFindings(){
        try{
            hypertensionNet.retractFindings();
        }catch(NeticaException ne){

        }
    }

    public void diagnose(Patient p){
        try{
            if(p.getAge()!=0){
                age.enterFinding(p.getAge());
            }
            sex.enterFinding(p.getSex());
            if(p.getWeight()!=0 && p.getHeight()!=0){
                bmi.enterValue(p.getBMI());
            }
            if(p.getWaistSize()!=0 && p.getHipSize()!=0){
                whi.enterValue(p.getWHI());
            }
            if(p.getSystoleBloodPressure()!=0){
                systoleBloodPressure.enterValue(p.getSystoleBloodPressure());
            }
            if(p.getDiastoleBloodPressure()!=0){
                diastoleBloodPressure.enterValue(p.getDiastoleBloodPressure());
            }
            if(p.getCholesterol()!=0){
                cholesterol.enterValue(p.getCholesterol());
            }
            if(p.getGlycemic()!=0){
                glycemic.enterValue(p.getGlycemic());
            }
            if(p.getTriglycerid()!=0){
                triglycerid.enterValue(p.getTriglycerid());
            }
            if(p.getHdl_C()!=0){
                hdl_C.enterValue(p.getHdl_C());
            }
            if(p.getLdl_C()!=0){
                ldl_C.enterValue(p.getLdl_C());
            }
            diabetesPastHistory.enterFinding(p.getDiabetesPastHistoryString());
            if(p.getSmoking()!=null){
                smoking.enterFinding(p.getSmoking());
            }
            exercise.enterFinding(p.getExerciseString());
        }catch(NeticaException ne){

        }
    }
    public Vector getDiagnoseResult()
    {
        Vector result = new Vector();
        try{
            int col = hypertension.getNumStates();
            String sname = "";
            double belief;
            String chartName="";
            for( int i=0; i<col; i++)
            {
              sname = hypertension.state(i).getName();
              belief = Math.round(hypertension.getBelief(sname)*10000);
              belief = belief/100;
              chartName = "<img src=\"image/" + Integer.toString(i+1) + ".gif\" width=\"" +
                          Long.toString(Math.round(belief*2)) + "\" height=\"15\" alt=\""+ sname + "\">";
              BeliefRow oBelief = new BeliefRow(sname,belief,chartName);
              result.add(oBelief);
            }
        }catch(NeticaException ne){
        }
        return result;
    }

    public void test(){
        try{
            System.out.println (hypertension.state(1).getName());
        }catch(NeticaException ne){

        }

    }
    public static void main (String[] args){
        HypertensionBN n = new HypertensionBN();
        n.test();
    }
}
