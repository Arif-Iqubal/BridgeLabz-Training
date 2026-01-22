package com.ecommerce;

//Each node represents one SKU entry in the tree
class Node {
	int sku; // SKU used as key for BST
	Product product; // Product data
	Node left, right; // Left and right child references

	Node(int sku, Product product) {
		this.sku = sku;
		this.product = product;
		left = right = null; // Initially no children
	}
}
