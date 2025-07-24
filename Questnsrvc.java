import java.util.Scanner;

public class Questnsrvc {
    Questn[] questions=new Questn[5];
    String[] selection=new String[5];

    public Questnsrvc(){
        questions[0] = new Questn(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Questn(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Questn(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Questn(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Questn(5, "size of boolean", "1", "2", "4", "8", "1");

    }
    
    public void PlayQuiz(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        for(Questn q:questions){
            q.showQuestions();
            System.out.println("Enter your answer : ");
            selection[i++]=sc.nextLine();
        }
        sc.close();
    }

    public int CheckScore(){
        int score=0;
        for (int i=0;i<questions.length;i++){
            if(selection[i].equals(questions[i].getAnswer())){
                System.out.println("question number "+ (i+1) + ",the answer provided is "+selection[i]+" which is the correct answer");
                score++;
            }
            else{
                System.out.println("question number "+ (i+1) + ",the answer provided is "+selection[i]+" which is the wrong answer ,"+questions[i].getAnswer()+" is the correct answer");
            }
        }
        return score;
    }


}
