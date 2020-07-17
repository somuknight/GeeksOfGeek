import  java.io.*;

public class MatrixRotation {
    static void rotateMatrix(int N,int mat[][]){
        for (int x=0;x<N/2;x++){
            for (int y=x;y<N-x-1;y++){
                int temp=mat[x][y];
                mat[x][y]=mat[y][N-x-1];
                mat[y][N-x-1]=mat[N-x-1][N-y-1];
                mat[N-x-1][N-y-1]=mat[N-y-1][x];
                mat[N-y-1][x]=temp;
            }
        }

    }
    static void displayMatrix(int N,int mat[][]){
        for (int x=0;x<N;x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(mat[x][y] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }
    public static void main(String[] args) {
        int N=3;
        int mat[][]={
                {1,2,3},
                {7,8,9},
                {13,14,15},
                };
        rotateMatrix(N,mat);

        displayMatrix(N,mat);


    }
}

