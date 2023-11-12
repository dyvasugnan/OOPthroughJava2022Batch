package hai;

class MaxVol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 0;
        int j = 0;
        int volume = 0;
        int [] height = {8,6,2,5,4,8,3,7};
        int maxVolume = 0;
        
        for(i = 0; i < height.length ; i++) {
        	for( j = i + 1 ; j < height.length ; j ++) {
        		int width = (j - i);
        		if ( height[i] > height[j] ) {
        	
        			volume = Math.max(volume,((height[j] * width)));
     
        		}
        		else {
        			volume = Math.max(volume,((height[i] * width)));
        		
        		}
        		maxVolume = Math.max(volume, maxVolume);
        	}
        	System.out.println(maxVolume);
        	break;
        	
        }
        
        
        
	}

}
