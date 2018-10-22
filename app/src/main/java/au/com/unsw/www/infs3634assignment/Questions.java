package au.com.unsw.www.infs3634assignment;

public class Questions {

    private String qContent;
    private String option1;
    private String option2;
    private String option3;
    private int rightAnswer;

    public Questions(String qContent, String option1, String option2, String option3, int rightAnswer) {
        this.qContent = qContent;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.rightAnswer = rightAnswer;
    }

    public Questions(){
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent;
    }


    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1_id(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
}
