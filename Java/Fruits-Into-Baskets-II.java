class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int filled=0;
        for(int fruit : fruits){
            for(int j=0; j<baskets.length ;j++){
                if((fruit <= baskets[j])){
                    filled++;
                    baskets[j]=0;
                    break;
                }
            }
        }

        return baskets.length - filled;
    }
}