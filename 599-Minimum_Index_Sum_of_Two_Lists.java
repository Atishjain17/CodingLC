class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap <String,Integer> hash = new HashMap<> ();
        for (int i=0;i<list1.length;i++)
            hash.put(list1[i],i);
        List <String> ans = new LinkedList<String>();
        int min = Integer.MAX_VALUE;
        for (int i=0; i< list2.length;i++){
            Integer find = hash.get(list2[i]);
            if (find !=null && find+i <= min){
                if (min > find+i)
                {   ans.clear();
                 min = find+i;
                }
                ans.add(list2[i]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}