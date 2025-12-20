//2001. Number of Pairs of Interchangeable Rectangles

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> map = new HashMap<>();
        long result = 0;

        for(int[] rect : rectangles){
            int width = rect[0];
            int height = rect[1];
            int gcd = Gcd(width, height);
            width /= gcd;
            height /= gcd;

            String key = width + "/" + height;
            long count = map.getOrDefault(key, 0L);
            result += count;
            map.put(key, count+1);
        }

        return result;
    }

    public int Gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }
}

// class Solution {
//     public long interchangeableRectangles(int[][] rectangles) {
//         int count = 0;
//         for(int i=0;i<rectangles.length;i++){
//             double ratio1 = (double)rectangles[i][0] / rectangles[i][1];
//             for(int j=i+1;j<rectangles.length;j++){
//                 double ratio2 = (double)rectangles[j][0] / rectangles[j][1];
//                 if(ratio1 == ratio2)
//                     count++;
//             }
//         }
//         return count;
//     }
// }