import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> values = new ArrayList<>();
        postOrder(root, values);
        return values;
    }

    private void postOrder(Node root, List<Integer> values) {
        if (root == null) return;

        if (root.children != null) {
            for (Node c : root.children) {
                postOrder(c, values);
            }
        }

        values.add(root.val);
    }
}
