class leecode_692_042{
    List<Integer> list = new ArrayList<Integer>();
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (!list.contains(root.val)) list.add(root.val);
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        Collections.sort(list);
        if (list.size() <= 1) {
            return -1;
        } else {
            return list.get(1);
        }

    }

}