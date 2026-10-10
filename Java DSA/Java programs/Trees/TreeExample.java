class Node
{
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class TreeExample
{
    Node root;
    public TreeExample()
    {
        root = null;
    }

    void preorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        preorder(node.left);
        System.out.print(node.data + " ");
        preorder(node.right);
    }

    void postorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) 
    {
        TreeExample tree = new TreeExample();
        tree.root = new Node(10);
        
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        System.out.println("Tree created successfully");

        System.out.println("Pre-order Traversals:");
        tree.preorder(tree.root);

        System.out.println();
        
        System.out.println("In-order Traversals:");
        tree.inorder(tree.root);

        System.out.println();

        System.out.println("Post-order Traversals:");
        tree.postorder(tree.root);
    }
}