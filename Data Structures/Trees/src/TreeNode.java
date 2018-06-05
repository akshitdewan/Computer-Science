public class TreeNode
{
	private Object value;
	private TreeNode left, right;
	public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight) {
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	public TreeNode(Object initValue) {
		this(initValue, null, null);
	}

	public void setValue(Object theNewValue){
		value = theNewValue;
	}
	
	public void setLeft(TreeNode theNewLeft){
		left = theNewLeft;
	}

	public void setRight(TreeNode theNewRight){
		right = theNewRight;
	}

	public Object getValue() {
		return value;
	}
	
	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}
	public String toString() {
		return value.toString();
	}
}