package trees;

public class VerifyBalanceBinaryTree {

   public static Result verifyBalance (TreeNode node) {
       Result result = new Result();
       if (node == null) {
           result.height = 0;
           result.isNodeBalanced = true;
           return result;
       }
       Result resultLeft  = verifyBalance(node.getLeftChild());
       Result resultRight  = verifyBalance(node.getRightChild());
       result.isNodeBalanced = resultLeft.isNodeBalanced && resultRight.isNodeBalanced;
       if (result.isNodeBalanced && Math.abs(resultLeft.height - resultRight.height) > 1 ) {
           result.isNodeBalanced = false;
       }

       result.height = Math.max(resultLeft.height, resultRight.height) + 1;
       return result;
   }

   public static class Result {
       public boolean isNodeBalanced;
       int height;
   }
}
