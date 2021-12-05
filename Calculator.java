import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double answer = 0;

        while (true){
            System.out.println("Choose operation: ");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplication");
            System.out.println("/ for division");
            System.out.println("^ for exponent ");
            System.out.println("OR PRESS 'X' TO EXIT");

            //accept operation
            char oper = in.next().trim().charAt(0);


            if( oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '^' ){
                //input two  numbers
                System.out.print("Enter two numbers: ");
                int n1 =in.nextInt();
                int n2 =in.nextInt();

                if(oper == '+'){
                    answer = n1 + n2;
                }

                if(oper == '-'){
                    answer = n1 - n2;
                }

                if(oper == '*'){
                    answer = n1 + n2;
                }

                if(oper == '/'){
                    if(n2 !=0){
                        answer = n1/n2;

                    }
                }

                if(oper == '^'){
                    answer = Math.pow(n1, n2);
                }
                //prints answers
                System.out.println(answer);
            } else if(oper =='x' || oper == 'X'){
                break;
            } else{
                System.out.print("Invalid operator ");
            }


        }
        


    }
    
}
