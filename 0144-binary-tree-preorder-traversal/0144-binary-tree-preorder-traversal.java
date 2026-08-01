/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        Stack<TreeNode> q=new Stack<>();
        if(root==null)return ans;
        q.push(root);
        while(!q.isEmpty()){
            TreeNode n=q.pop();
             ans.add(n.val);
             if(n.right!=null){
                q.push(n.right);
            }
            if(n.left!=null){
                q.push(n.left);
            }
        }
      return ans;  
    }
}