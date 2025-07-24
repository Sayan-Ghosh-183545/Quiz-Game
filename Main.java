
public class Main {
    public static void main(String[] args){
    Questnsrvc service=new Questnsrvc();
    service.PlayQuiz();
    System.out.println("The final score is : "+service.CheckScore());
    }
}
