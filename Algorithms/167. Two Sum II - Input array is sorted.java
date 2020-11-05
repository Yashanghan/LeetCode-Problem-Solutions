class Solution {
    public int[] twoSum(int[] numbers, int target) {
   
        int n = numbers.length;

        int [] indexNumbers = new int[2];
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int sum;
                sum = numbers[i] + numbers[j];
                if(target == sum)
                {
                    indexNumbers[0] = i+1;
                    indexNumbers[1] = j+1;
                }
                
            }
        }
        return indexNumbers;
    }
}
}