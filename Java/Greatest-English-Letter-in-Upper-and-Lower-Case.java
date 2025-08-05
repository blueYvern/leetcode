class Solution {
    public String greatestLetter(String s) {
        //32
        char maxChar = 0;
        Set<Character> charSet = new HashSet<Character>();
        for(char c : s.toCharArray()){
            charSet.add(c);
        }

        for(char c : charSet){
            if(Character.isUpperCase(c) && charSet.contains(Character.toLowerCase(c))){
                if(c > maxChar){
                    maxChar = c;
                }
            }
        }

        return maxChar == 0 ?"":String.valueOf(maxChar) ;

    }
}