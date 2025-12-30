class Solution {
    public int[] constructRectangle(int area) {
        int dist = area-1; 
        int[] result = {0,0};
        if(area == 1){
            result[0] = 1;
             result[1] = 1;
            return result;
        }
        for(int i =1; i<area;i++){
            if(area % i == 0 )
            {   
                int length = area/i;
                int width = i;
                if(length>=width){
                    int tempdist = length - width;
                    if(tempdist<=dist){
                        result[0] = area/i;
                        result[1] = i;
                        dist = tempdist;
                    }
               
                } 
               
            }

        }
        return result;
    }
}