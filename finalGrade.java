public class finalGrade extends Grade{
    private double gradeMed = (getGrade1() + getGrade2() /2 );

    public double getGradeMed() {
        return gradeMed;
    }

    public void setGradeMed(double gradeMed) {
        this.gradeMed = gradeMed;
    }
}
