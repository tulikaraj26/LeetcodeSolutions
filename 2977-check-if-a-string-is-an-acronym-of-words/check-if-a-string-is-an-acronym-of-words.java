class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()) return false;
        String acr = "";
        for(int i=0;i<words.size();i++){
            String temp=words.get(i);
            acr+=temp.charAt(0);
        }
        System.out.print(acr);
        if(acr.equals(s)){
            return true;
        }
        return false;
    }

}