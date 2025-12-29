class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] result = new int[length];
        int remainder = 1;
        for(int i = length - 1 ; i>=0 ; i--){
            int temp = digits[i]; //Stroring each digit in each loop
            if(remainder == 1){ //Cheking if from previous calculation remainder is one 
                temp += 1;
            }
            //Checking for remainder of temp+1 greater than 9 then 1 goes for remainder
            if(temp>9){
                if(i==0){
                    int[] finalResult = new int [length + 1];
                    finalResult[0] = 1;
                    for(int j =0;j<length;j++){
                        finalResult[j+1] = result[j];
                    }

                    return finalResult;
                }

                remainder = 1;
            }
            else{
                remainder = 0;
            }
            result[i]= temp % 10;
           

        
        }
        //returning the final result
        return result;
        
    }
}