class Solution {
    public static int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                result.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] out=new int[result.size()];
        int i=0;
        for(int num:result){
            out[i++]=num;
        }
        return out;
    }
}