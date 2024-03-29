
//이진트리 순회(깊이 우선 탐색)


public class Main5 {
    Node root;

    public void DFS(Node root){
        if(root==null) return;
        else{
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Main5 tree=new Main5();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);  //100번지가 들어왔다고 가정함

    }
}
