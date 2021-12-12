public class GoodStudent {
    private String firstName;
    private String lastName;
    private String idNum;
    private double gpa;
    private String CSS;

    //Constructors
    public GoodStudent(String firstName, String lastName, String idNum, double gpa, String CSS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpa = gpa;
        this.CSS = CSS;
    }

    public GoodStudent(double gpa, String CSS) {

    }

    public GoodStudent(String firstName, String lastName, String idNum) {

    }

    //Methods
    public String CreateID() {
        String firstInitial = firstName.substring(0, 1);
        if (idNum.length() < 6) {
            return firstInitial.toLowerCase() + lastName.toLowerCase() + idNum.substring(2, 5);
        } else {
            return firstInitial.toLowerCase() + lastName.toLowerCase() + idNum.substring(3, 6);
        }
    }

    public double CSGPA() {
        if (CSS.equals("Yes")) {
            return gpa * 1.15;
        } else {
            return gpa;
        }
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNum() {
        return idNum;
    }

    public double getGPA() {
        return gpa;
    }

    public String getCSS() {
        return CSS;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public void setCSS(String CSS) {
        this.CSS = CSS;
    }

    //toString
    public String toString() {
        String output = firstName + " " + lastName + ", " + idNum + ", " + gpa + ", " + CSS;
        return output;
    }
}