class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder("");
        for(String s : strs) {
            res.append(s.length());
            res.append('#');
            res.append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        int n = str.length();
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<n) {
            StringBuilder count = new StringBuilder("");
            while(str.charAt(i) != '#') {
                count.append(str.charAt(i));
                i++;
            }
            i++;
            int c = Integer.parseInt(count.toString());
            res.add(str.substring(i, i+c));
            i += c;
        }
        return res;
    }
}
