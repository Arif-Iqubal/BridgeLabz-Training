package com.music;

//Each node represents one song in the tree
class Node {
	Song song; // Song data
	Node left, right; // Left and right child

	Node(Song song) {
		this.song = song;
		left = right = null; // Initially no children
	}
}
