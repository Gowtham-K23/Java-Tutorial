public class SearchNode
{
    Node root;

    boolean search(Node node, int key)
    {
        if(node == null)
        {
            return false;
        }
        if(node.data == key)
        {
            return true;
        }
        return search(node.left, key) || search(node.right, key);
    }
    public static void main(String[] args) 
    {
        SearchNode tree = new SearchNode();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        System.out.println("Is 20 present? " + tree.search(tree.root, 20));
        System.out.println("Is 50 present? " + tree.search(tree.root, 50));    
    }
}