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
 class Pair{
    int row;
    int col;
    int value;
    Pair(int row,int col,int value){
        this.row=row;
        this.col=col;
        this.value=value;
    }
 }
 class NodeInfo{
    int row;
    int col;
    TreeNode node;
    NodeInfo(int row,int col,TreeNode node){
        this.row=row;
        this.col=col;
        this.node=node;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Pair> list=new ArrayList<>();
        Queue<NodeInfo> q=new LinkedList<>();
        if(root==null){return new ArrayList<>();}
        q.offer(new NodeInfo(0,0,root));
        while(!q.isEmpty()){
            NodeInfo arr=q.poll();
            int k=arr.row;
            int l=arr.col;
           TreeNode node=arr.node;
           list.add(new Pair(k,l,node.val));
            if(node.left!=null){
                q.offer(new NodeInfo(k+1,l-1,node.left));
            }
            if(node.right!=null){q.offer(new NodeInfo(k+1,l+1,node.right));}
        }
        Collections.sort(list,(a,b)->{
        if(a.col!=b.col){
            return a.col-b.col;
        }
        if(a.row!=b.row){
            return a.row-b.row;
        }
        else{
            return a.value-b.value;
        }
    });
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    int currcol=list.get(0).col;
    for(Pair p:list){
        if(currcol==p.col){
            temp.add(p.value);
        }else{
            ans.add(temp);
           temp=new ArrayList<>();
           temp.add(p.value);
           currcol=p.col;
        }  
    }  ans.add(temp);
    return ans;
      }
}