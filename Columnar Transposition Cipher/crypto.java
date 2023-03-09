import java.util.Scanner;

public class crypto {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    scan.close();

    // Length of the array 
    int x = (int)(Math.sqrt(sentence.length())) + 1;

    String[][] array = new String[x][x];
    for (int i=x; i>=0; i--){
      // for (int j=x; 5 > j; j++){
        System.out.println(i);

      }
    }
  }

