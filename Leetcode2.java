public class Leetcode2 {
    public static void main(String[] args) {
       int[][] array = {{1},{1,2,5,2},{5,5,2,5,1}};

        System.out.println(maximumWealth(array));
    }
    public static int  maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for(int person = 0;person<accounts.length ;person++){
        int count = 0;
            for(int money = 0 ; money<accounts[person].length;money++){

                count = count  + accounts[person][money];
            }

            if(count>max){
                max = count;
            }

        }
        return max;
    }
}
