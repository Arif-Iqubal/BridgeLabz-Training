package com.ecommerce;

class InventoryTree {

	Node root; // Root of the BST

	// Insert product based on SKU
	void insert(int sku, Product product) {
		root = insertRec(root, sku, product);
	}

	// Recursive insert following BST property
	Node insertRec(Node root, int sku, Product product) {
		if (root == null)
			return new Node(sku, product); // Create node if empty

		if (sku < root.sku)
			root.left = insertRec(root.left, sku, product); // Go left
		else if (sku > root.sku)
			root.right = insertRec(root.right, sku, product); // Go right

		return root; // Return unchanged root
	}

	// Lookup product using SKU
	Product search(int sku) {
		return searchRec(root, sku);
	}

	// Recursive search
	Product searchRec(Node root, int sku) {
		if (root == null)
			return null; // SKU not found

		if (root.sku == sku)
			return root.product; // SKU found

		if (sku < root.sku)
			return searchRec(root.left, sku); // Search left
		else
			return searchRec(root.right, sku); // Search right
	}

	// Update price using SKU
	void updatePrice(int sku, double newPrice) {
		Product p = search(sku); // Reuse search logic
		if (p != null)
			p.price = newPrice; // Update price
	}

	// Display products in sorted SKU order
	void displaySorted() {
		inorderRec(root); // Inorder traversal
	}

	// Inorder traversal sorted by SKU
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left); // Visit left subtree
			System.out.println("SKU " + root.sku + " → " + root.product.name + " | ₹" + root.product.price);
			inorderRec(root.right); // Visit right subtree
		}
	}
}
