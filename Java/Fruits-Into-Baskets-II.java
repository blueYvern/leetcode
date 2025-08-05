class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        Set<Integer> filledBasket = new HashSet<Integer>();
        for(int fruit : fruits){
            for(int j=0; j<baskets.length ;j++){
                if((fruit <= baskets[j]) && !filledBasket.contains(j)){
                    filledBasket.add(j);
                    break;
                }
            }
        }

        return baskets.length - filledBasket.size();
    }
}