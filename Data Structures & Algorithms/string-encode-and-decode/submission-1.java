class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            String str = strs.get(i);
            res.append(str.length()).append("_").append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> res = new ArrayList<>();

        int r=0;
        int l=0;
        while (r< n){
            if(str.charAt(r) == '_'){
                int len = Integer.parseInt(str.substring(l, r));
                String part = str.substring(r+1, r+1+len);

                res.add(part);
                r=r+1+len;
                l=r;
            } else{
                r++;
            }
        }

        return res;

    }
}
