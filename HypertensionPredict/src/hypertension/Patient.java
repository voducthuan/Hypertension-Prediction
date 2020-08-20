package hypertension;

public class Patient {
    private String fullName;
    private String sex;
    private int age;
    private double systoleBloodPressure;
    private double diastoleBloodPressure;
    private double weight;
    private double height;
    private double waistSize;
    private double hipSize;
//    private Node mbi;
//    private Node whi;
    private double glycemic;
    private double cholesterol;
    private double triglycerid;
    private double hdl_C;
    private double ldl_C;
    private boolean diabetesPastHistory;
    private String smoking;
    private boolean exercise;

    public Patient() {
        reset();
    }
    public void reset(){
        fullName = "";
        sex = "Male";
        age = 0;
        systoleBloodPressure = 0;
        diastoleBloodPressure = 0;
        weight = 0;
        height = 0;
        waistSize = 0;
        hipSize = 0;
        glycemic = 0;
        cholesterol = 0;
        triglycerid = 0;
        hdl_C = 0;
        ldl_C = 0;
        diabetesPastHistory = false;
        smoking = "";
        exercise = false;

    }

    public int getAge() {
        return age;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public boolean isDiabetesPastHistory() {
        return diabetesPastHistory;
    }

    public String getDiabetesPastHistoryString(){
        String result= "No";
        if(diabetesPastHistory){
            result = "Yes";
        }
        return result;
    }

    public double getDiastoleBloodPressure() {
        return diastoleBloodPressure;
    }

    public boolean isExercise() {
        return exercise;
    }

    public String getExerciseString(){
        String result= "No";
        if(exercise){
            result = "Yes";
        }
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public double getGlycemic() {
        return glycemic;
    }

    public double getHdl_C() {
        return hdl_C;
    }

    public double getHeight() {
        return height;
    }

    public double getHipSize() {
        return hipSize;
    }

    public double getLdl_C() {
        return ldl_C;
    }

    public String getSex() {
        return sex;
    }

    public String getSmoking() {
        return smoking;
    }

    public double getSystoleBloodPressure() {
        return systoleBloodPressure;
    }

    public double getTriglycerid() {
        return triglycerid;
    }

    public double getWaistSize() {
        return waistSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public void setDiabetesPastHistory(boolean diabetesPastHistory) {
        this.diabetesPastHistory = diabetesPastHistory;
    }

    public void setDiastoleBloodPressure(double diastoleBloodPressure) {
        this.diastoleBloodPressure = diastoleBloodPressure;
    }

    public void setExercise(boolean exercise) {
        this.exercise = exercise;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGlycemic(double glycemic) {
        this.glycemic = glycemic;
    }

    public void setHdl_C(double hdl_C) {
        this.hdl_C = hdl_C;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHipSize(double hipSize) {
        this.hipSize = hipSize;
    }

    public void setLdl_C(double ldl_C) {
        this.ldl_C = ldl_C;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public void setSystoleBloodPressure(double systoleBloodPressure) {
        this.systoleBloodPressure = systoleBloodPressure;
    }

    public void setTriglycerid(double triglycerid) {
        this.triglycerid = triglycerid;
    }

    public void setWaistSize(double waistSize) {
        this.waistSize = waistSize;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI(){
        double mbi = 0;
        if(height != 0)
        {
            mbi = weight / (height * height);
        }
        return mbi;
    }
    public double getWHI(){
        double whi = 0;
        if(height != 0)
        {
            whi = Math.round((waistSize / hipSize) * 100);
            whi = whi / 100;
        }
        return whi;
    }

}
