import java.util.Scanner;

public class crypto {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    scan.close();

    // Length of the array 
    int x = (int)(Math.sqrt(sentence.length())) + 1;

    char[][] array = new char[x][x];      
    // i is rows
    // j is columns


    //PRINTS FOWARD
    /*int order = 0;

      for (int i = 0; i < x; i++){
        for (int j = 0; j < x; j++){

          if(order <= (sentence.length()-1)){
            array[i][j] = sentence.charAt(order);
            System.out.println(array[i][j]);
            order++;
          }
        
        }
      }
      */

      //PRINTS BACKWARD
      int order = sentence.length();

      for (int i = x; 0 < i; i--){
        for (int j = 0; j < x; j++){

          if(order > 0){
            array[i-1][j] = sentence.charAt(order-1);
            System.out.println(array[i-1][j]);
            order--;
          }
       
        }
      }
  

    }
  }

  // hellohellohellohello
