



public class Questn {
    private int no;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;


    

    

    public Questn(final int no, final String question, final String opt1, final String opt2, final String opt3, final String opt4, final String answer) {
        this.no = no;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public int getNo(){
        return no;
    }

    public void setNo(final int no){
        this.no=no;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }

    

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(final String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(final String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(final String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(final String opt4) {
        this.opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questn no : " + no + " question=" + question + ",  opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", opt4=" + opt4 + ", answer=" + answer + "]";
    }
    
    public void showQuestions(){
        System.out.println("Question no. : " + getNo());
        System.out.println(getQuestion());
        System.out.println(getOpt1()+" \t "+getOpt2());
        System.out.println(getOpt3()+" \t "+getOpt4());
        
    }

    public void fetchQuestions(final int i,final String q,final String o1,final String o2,final String o3,final String o4,final String ans){
        setQuestion(q);
        setAnswer(ans);
        setOpt1(o1);
        setOpt2(o2);
        setOpt3(o3);
        setOpt4(o4);
    }
}
    



