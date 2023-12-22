package PrepDSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class ratInAMaze {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[] dir = {'D', 'R', 'U', 'L'};

    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1}};

//        int[][] arr = {{1,0,0}, {1,0,0}, {1,1,1}};

        int rows = arr.length, col = arr.length;

        boolean[][] visited = new boolean[arr.length][arr.length];
        String output = "";

        ArrayList<String> finalPath = new ArrayList<>();

        if (arr[0][0] == 0)
            System.out.println("No path exists");
        else  {
            visited[0][0] = true;
            solve(arr, rows, col, 0, 0, visited, output, finalPath);
        }

        for (String s : finalPath)
            System.out.println(s);

    }

    static void solve(int[][] maze, int rows, int col, int x, int y, boolean[][] visited, String output, ArrayList<String> finalPath) {
        int i =0 ,j = 0;
        if (x == rows-1 && y == col-1) {
            finalPath.add(output);
            return;
        }

        for (int k = 0; k < 4; k++) {
            i = x + dx[k];
            j = y + dy[k];
            if (isSafe(maze, rows, col, i, j, visited)) {
                visited[i][j] = true;
                solve(maze, rows, col, i, j, visited, output + dir[k], finalPath);
                visited[i][j] = false;
            }
        }
    }

    static boolean isSafe(int[][] maze, int rows, int col, int i, int j, boolean[][] visited) {
        if (i >=0 && i < rows
                && j >=0 && j < col
                && maze[i][j] == 1
                && !visited[i][j]) {
            return true;
        }
        return false;
    }
}
