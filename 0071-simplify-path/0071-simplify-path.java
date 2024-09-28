class Solution {
    public String simplifyPath(String path){
        Stack<String> stack= new Stack<>();
        String[] parts=path.split("/");
        for(String part:parts){
            if(part.isEmpty() || part.equals(".")){
                continue;
            }else if(part.equals("..")){
                if(!stack.isEmpty()){;
                stack.pop();
                }
            }else{
                stack.push(part);
            }
        }
        StringBuilder simplifiedPath=new StringBuilder();
        for(String dir:stack){
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length()==0 ? "/" : simplifiedPath.toString();
    }
}