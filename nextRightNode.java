import java.util.*;
public class nextRightNode {
    public static Node printNextNode(Node root , int key){
        Queue<Node> queue =  new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0; i<size; i++){
                Node temp =  queue.peek();
                queue.poll();
                if(i!=size-1 && temp.data==key){
                    return queue.poll();
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
        return new Node(-1);
    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
