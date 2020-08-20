package control;

import hypertension.*;
import java.util.Vector;

public class frmPredict {
    private Patient patient;
    private HypertensionBN hypertensionBN;

    public frmPredict() {
        patient = new Patient();
        hypertensionBN = new HypertensionBN();
    }

    public int getAge() {
        return patient.getAge();
    }

    public double getCholesterol() {
        return patient.getCholesterol();
    }

    public boolean isDiabetesPastHistory() {
        return patient.isDiabetesPastHistory();
    }

    public double getDiastoleBloodPressure() {
        return patient.getDiastoleBloodPressure();
    }

    public boolean isExercise() {
        return patient.isExercise();
    }

    public String getFullName() {
        return patient.getFullName();
    }

    public double getGlycemic() {
        return patient.getGlycemic();
    }

    public double getHdl_C() {
        return patient.getHdl_C();
    }

    public double getHeight() {
        return patient.getHeight();
    }

    public double getHipSize() {
        return patient.getHipSize();
    }

    public double getLdl_C() {
        return patient.getLdl_C();
    }

    public String getSex() {
        return patient.getSex();
    }

    public String getSmoking() {
        return patient.getSmoking();
    }

    public double getSystoleBloodPressure() {
        return patient.getSystoleBloodPressure();
    }

    public double getTriglycerid() {
        return patient.getTriglycerid();
    }

    public double getWaistSize() {
        return patient.getWaistSize();
    }

    public double getWeight() {
        return patient.getWeight();
    }

    public void setAge(int age) {
        patient.setAge(age);
    }

    public void setCholesterol(double cholesterol) {
        patient.setCholesterol(cholesterol);
    }

    public void setDiabetesPastHistory(boolean diabetesPastHistory) {
        patient.setDiabetesPastHistory(diabetesPastHistory);
    }

    public void setDiastoleBloodPressure(double diastoleBloodPressure) {
        patient.setDiastoleBloodPressure(diastoleBloodPressure);
    }

    public void setExercise(boolean exercise) {
        patient.setExercise(exercise);
    }

    public void setFullName(String fullName) {
        patient.setFullName(fullName);
    }

    public void setGlycemic(double glycemic) {
        patient.setGlycemic(glycemic);
    }

    public void setHdl_C(double hdl_C) {
        patient.setHdl_C(hdl_C);
    }

    public void setHeight(double height) {
        patient.setHeight(height);
    }

    public void setHipSize(double hipSize) {
        patient.setHipSize(hipSize);
    }

    public void setLdl_C(double ldl_C) {
        patient.setLdl_C(ldl_C);
    }

    public void setSex(String sex) {
        patient.setSex(sex);
    }

    public void setSmoking(String smoking) {
        patient.setSmoking(smoking);
    }

    public void setSystoleBloodPressure(double systoleBloodPressure) {
        patient.setSystoleBloodPressure(systoleBloodPressure);
    }

    public void setTriglycerid(double triglycerid) {
        patient.setTriglycerid(triglycerid);
    }

    public void setWaistSize(double waistSize) {
        patient.setWaistSize(waistSize);
    }

    public void setWeight(double weight) {
        patient.setWeight(weight);
    }

    public String diagnose()
    {
        hypertensionBN.diagnose(patient);
        return "diagnoseresult";
    }
    public String reset()
    {
        patient.reset();
        return "";
    }
    public Vector getDiagnoseResult()
    {
        Vector result = hypertensionBN.getDiagnoseResult();
        hypertensionBN.retractFindings();
        return result;
    }
}
