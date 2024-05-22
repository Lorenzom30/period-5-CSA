import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    int[] rowNeighbors = {row - 1, row + 1};
    int[] colNeighbors = {col - 1, col + 1};
    int[] neighbors = {rowNeighbors[0], rowNeighbors[1], colNeighbors[0], colNeighbors[1]};
    int[] neighborValues = new int[4];
    for (int i = 0; i < 4; i++){
      if (neighbors[i] >= 0 && neighbors[i] < grid.length){
        neighborValues[i] = grid[neighbors[i]][col];
      }
    }
    int min = neighborValues[0];
    int minIndex = 0;
    for (int i = 0; i < 4; i++){
      if (neighborValues[i] < min){
        min = neighborValues[i];
        minIndex = i;
      }
    }
    if (minIndex == 0){
      return new Location(row - 1, col); 
    } 
    else{
      return new Location(row + 1, col);
    }

  
  // PART B
   public int sumPath(int row, int col) {
    int sum = 0;
    int[] rowNeighbors = {row - 1, row + 1};
    int[] colNeighbors = {col - 1, col + 1};
    int[] neighbors = {rowNeighbors[0], rowNeighbors[1], colNeighbors[0], colNeighbors[1]};
    int[] neighborValues = new int[4];
     for (int i = 0; i < 4; i++){
       if (neighbors[i] >= 0 && neighbors[i] < grid.length){
         neighborValues[i] = grid[neighbors[i]][col];
       }
     }
     int min = neighborValues[0];
     int minIndex = 0;
     for (int i = 0; i < 4; i++){
       if (neighborValues[i] < min){
         min = neighborValues[i];
         minIndex = i;
       }
       
     }
     if (minIndex == 0){
       sum += grid[row - 1][col];
     }
     else{
       sum += grid[row + 1][col];
     }
     if (minIndex == 1){
       sum += grid[row + 1][col];
     }
     else{
       sum += grid[row - 1][col];
     }
     if (minIndex == 2){
       sum += grid[row][col - 1];
     }
     else{
       sum += grid[row][col + 1];
     }
     if (minIndex == 3){
        sum += grid[row][col - 1];
      }
      else{
        sum += grid[row][col + 1];
     
     }
     return sum;
   }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
