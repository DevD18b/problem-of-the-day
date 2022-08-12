public class LCAInBST {
// LCA --> stands for the least common ancestor in Bst or binary tree
// we basically follow approach in the both the cases..

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
          this.left = null;
          this.right = null;
          this.data = data;
             }
      public static Node LCA(Node root , Node p , Node q){
        if(root==null || root == p || root == q) return root;
        Node left = LCA(root.left, p, q);
        Node right = LCA(root.right, p, q);

        if(left==null){
            return right;
        }
        else{
            return left;
        }

      }

      // approach 2.
      public static Node LCA2(Node root , Node p , Node q){
        int  cur = root.data;
        if(cur>p.data && cur>q.data){
             return LCA2(root.left, p, q);
        }
        else if(cur<p.data && cur<q.data){
            return LCA2(root.right, p, q);
        }
        return root;
      }



    } 



}
