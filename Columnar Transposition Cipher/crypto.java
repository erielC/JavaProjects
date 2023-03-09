import java.util.Scanner;

public class crypto {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    scan.close();

    // Length of the array 
    int x = (int)(Math.sqrt(sentence.length())) + 1;


    String[][] array = new String[x][x];
    for (int r = x; r < x; r--)
      for (int c = x; 0 < x; c++) {
        array[r][c]=sentence.substring(0,x+1);
          System.out.println(array[r][c]);
      }
    }

}
