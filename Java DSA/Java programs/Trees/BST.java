class BST
{
    Node root;

    Node insert(Node root, int key)
    {
        if(root == null)
        {
            return new Node(key);
        }
        if(key < root.data)
        {
            root.left = insert(root.left, key);
        }
        else if(key > root.data)
        {
            root.right = insert(root.right, key);
        }
        return root;
    }

    void inorder(Node root) 
    {
        if (root != null) 
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(key < root.data)
        {
            return search(root.left, key);
        }
        if(key == root.data)
        {
            return true;
        }
        return search(root.right, key);
    }
    
    public static void main(String[] args)
    {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder traversals: ");
        tree.inorder(tree.root);

        System.out.println("Search in BST: ");
        System.out.println("Is 40 present? " + tree.search(tree.root, 40));
        System.out.println("Is 90 present? " + tree.search(tree.root, 90));
    }
}