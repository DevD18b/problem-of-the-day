public class NumberOfTurnsInBst {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right  = null;
        }
    }
    static int count = 0;
    public static boolean countTurn(Node root ,int key , boolean turn){
        if(root==null) return false;
        if(root.data == key) return true;
        if(turn){
            if(countTurn(root.left, key, turn)){
                return true;
            }
            if(countTurn(root.right, key, !turn))
            {
                count+=1;
                return true;
            }
        }
        else{
            if(countTurn(root.right, key, turn)){
                return true;
            }
            if(countTurn(root.left, key, !turn)){
                count+=1;
                return true;
            }
        }
        return false;
    }
    public static Node LCA(Node root,int p ,  int q){
        if(root==null)
        return null;
        if(root.data == p || root.data == q){
            return root;
        }
        Node left = LCA(root.left, p, q);
        Node right = LCA(root.right, p, q);

        if(left == null) return right;
        if(right==null) return left;

        return root;
    
    }

    public static int countNumberOfTurn(Node root, int p , int q){
         count  =0;
          
         Node lca  = LCA(root, p, q);
         if(lca.data == p){
            countTurn(root.right , q ,false);
            countTurn(root.left,q ,  true);
         }
         if(lca.data == q){
            countTurn(root.right , p, false);
            countTurn(root.left,  p , true);
         }
         else{
            countTurn(root.right , q ,false);
            countTurn(root.left,q ,  true);
            countTurn(root.right , p, false);
            countTurn(root.left,  p , true);
             return count+1; 
        }

         return count;


    }

}
