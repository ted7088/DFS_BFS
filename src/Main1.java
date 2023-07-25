//재귀함수
public class Main1 {
    public void DFS(int n) {

        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        T.DFS(3);
    }

}
