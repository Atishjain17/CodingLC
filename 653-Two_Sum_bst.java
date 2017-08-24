/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
 Either use hashtable or inorder traversal-->left,current,right
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet <Integer> hash = new HashSet <Integer> ();
        return dfs(root,hash,k);
    }
    public boolean dfs(TreeNode root, HashSet<Integer> hash, int k){
        if (root == null) return false;
        if (hash.contains(k-root.val)) return true;
        hash.add(root.val);
        return dfs(root.left,hash,k) || dfs(root.right,hash,k);
        
    }
}