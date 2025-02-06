class placeFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                    
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        
        return count >= n;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        System.out.println(sol.canPlaceFlowers(flowerbed1, 1));
        System.out.println(sol.canPlaceFlowers(flowerbed1, 2));
    }
}
