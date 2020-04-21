import java.io.*;
import java.util.*;

public class Connected1 {
    public int numIslands(char[][] islandGrid) {

        int h = islandGrid.length;
        if (h == 0)
            return 0;
        int l = islandGrid[0].length;
        int result = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (islandGrid[i][j] == '1') {
                    DFS(islandGrid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    public void DFS(char[][] islandGrid, int row, int col) {

        int H = islandGrid.length;
        int L = islandGrid[0].length;

        if (row < 0 || col < 0 || row >= H || col >= L || islandGrid[row][col] != '1')
            return;
        islandGrid[row][col] = '0';
        DFS(islandGrid, row + 1, col);
        DFS(islandGrid, row - 1, col);
        DFS(islandGrid, row, col + 1);
        DFS(islandGrid, row, col - 1);
    }

    public static void main(String[] args) throws IOException {
        Connected1 connected1 = new Connected1();
        int rows, cols;
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        char inputArray[][] = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String data = "";
            if (scan.hasNext()) {
                data = scan.next();
            } else {
                break;
            }
            for (int j = 0; j < cols; j++)
                inputArray[i][j] = data.charAt(j);
        }
        System.out.println(connected1.numIslands(inputArray));
    }
}