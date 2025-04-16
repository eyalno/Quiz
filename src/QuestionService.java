import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    {
        questions[0] = new Question(1, "What is the size of an int in Java?", "2", "6", "8", "32", "32");
        questions[1] = new Question(2, "What is the default value of a boolean in Java?", "true", "false", "0", "null", "false");
        questions[2] = new Question(3, "Which keyword is used to inherit a class in Java?", "implement", "extends", "inherits", "super", "extends");
        questions[3] = new Question(4, "Which method is used to start a thread in Java?", "run()", "start()", "execute()", "begin()", "start()");
        questions[4] = new Question(5, "Which of these is not a Java primitive type?", "int", "float", "String", "char", "String");
    }

    public void displayQuestions() {
        
        
        for (int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i].toString());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
        }
        
    
    }

}


