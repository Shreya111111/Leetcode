class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());

        Arrays.sort(S);
        for (int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> new1 : res) {
                List<Integer> a = new ArrayList<>(new1);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }
}