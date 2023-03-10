import java.util.Scanner;

public class crypto {

    public static String sentence (String sentence){
      int x = (int)(Math.sqrt(sentence.length())) + 1;
      char[][] array = new char[x][x];   
      String complete ="";
      int order = 0;

      for (int i = 0; i < x; i++){
        for (int j = 0; j < x; j++){

          if(order <= (sentence.length()-1)){
            array[i][j] = sentence.charAt(order);
            order++;
          }
        }
      }

      for (int j = 0; j < x; j++){
        for (int i = x-1; i>=0; i--){
          complete += array[i][j];
        }
      }

      return complete;
    }



  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    scan.close();
    
    System.out.print(sentence(sentence));
  }
}
