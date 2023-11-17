package zohotest;
import java.util.Scanner;

public class Pttern_1 {



   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        spiralPattern(n);
    }

    private static void spiralPattern(int n) {
        int[][] arr = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;
//diagonal 
        while(top<bottom||left<right) {
				for(int i=top; i<=bottom; i++) {
					arr[i][left+i] = num++;
				}
				
				//last column
				
				left++;
				bottom--;
				for(int i=bottom; i>=top; i--) {
					arr[i][right] = num++;
				}
				
				//first row left to right
				
				right--;
				for(int i=right; i>=left; i--) {
					if(i==left&&top!=0)
						break;
					arr[top][i] = num++;
				}
				top++;
				bottom--;
				
		}

    printArray(arr,n,n);
}

private static void printArray(int[][] arr, int rows, int column) {

	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < column; j++) {
			if (arr[i][j] != 0)
				System.out.print(arr[i][j] + "  ");
			else
				System.out.print("    ");

		}
		System.out.println();
	}
}

}
