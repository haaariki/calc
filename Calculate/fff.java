import java.util.Scanner;

public class fff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Введи числа в ввиде 5 + 5 , числа не более 10 и не менее 1");

      String input = sc.nextLine();
      String[] words = input.trim().split(" ");

      if (words.length != 3) {
          System.out.println("Неверный формат: " + input + " (должно быть так: 5 + 5)");
          return;
      }
      try{
          int a = Integer.parseInt(words[0]);
          char op = words[1].charAt(0);
          int b = Integer.parseInt(words[2]);

          if(a<1 || a> 10 || b<1 || b> 10) {
              System.out.println("Числа должны быть от 1-10 ");
              return;
          }
          if (op != '+' & op != '-' & op != '*' & op != '/') {
              System.out.println("Ты можешь писать только: '+', '-', '/', '*'");
              return;
          }
          switch(op){
          case '/':
              if(b==0)
                  System.out.println("Неверная операция: На 0 делить нельзя");
              else
              System.out.println(a + "/" + b + "=" + (a+b));
              break;
              case '*':
                  System.out.println(a + "*" + b + "=" + (a*b));
                  break;
                  case '+':
                      System.out.println(a+ "+" + b + "=" + (a+b));
                      break;
                      case '-':
                          System.out.println(a + "-" + b + "=" + (a-b));
                          break;
                          default:
                              System.out.println("Ты нашел баг,молодец !");

          }
      } catch (Exception e) {
          System.out.println("Ошбика:Ты ввел не целое число: " + input);
      }

    }
}
