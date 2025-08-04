class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> scoreStack = new Stack<Integer>();

        for(String op : operations){
            switch(op){
                case "+":
                    int lastScore = scoreStack.pop();
                    int newScore = scoreStack.peek() + lastScore;
                    scoreStack.push(lastScore);
                    scoreStack.push(newScore);
                    break;
                case "D":
                    scoreStack.push(scoreStack.peek()*2);
                    break;
                case "C":
                    scoreStack.pop();
                    break;
                default:
                    scoreStack.push(Integer.parseInt(op));
            }
        }
        
        int result = 0;

        for(int score : scoreStack){
            result += score;
        }

        return result;
    }
}