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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=true;
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ans=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode k=q.poll();
                if(flag==true){
                ans.add(k.val);
                }else{
                    ans.add(0,k.val);      }
                if(k.left!=null){q.add(k.left);}
                if(k.right!=null){q.offer(k.right);}
            }
            list.add(ans);
        flag=!flag;
        }
          return list;
    } 
}
