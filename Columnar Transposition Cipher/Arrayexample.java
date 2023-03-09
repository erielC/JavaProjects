public class Arrayexample {
  public static void main(String[] args) {
    
  int rows = 5;
  int cols = 5;

  int[][] array = new int[rows][cols];

    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
       array[i][j] = 1;
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++){
        System.out.println(array[i][j]);
      }
    } 


  }
}

