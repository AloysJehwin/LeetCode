class Solution {
    public boolean isPathCrossing(String path){
        Set<String> visited=new HashSet<>();
        int x=0,y=0;
        visited.add(x+","+y);
        for(char dir:path.toCharArray()){
            switch (dir) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }
            String pos=x+","+y;
            if(visited.contains(pos)){
                return true;
            }
            visited.add(pos);
        }
        return false;
    }
}