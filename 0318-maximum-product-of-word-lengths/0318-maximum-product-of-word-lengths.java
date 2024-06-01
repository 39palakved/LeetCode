class Solution {
    public int maxProduct(String[] words) {
       
        int n = words.length;
        int[] state = new int[n];
        int max = 0 ;
        
        for(int i = 0; i < n; i++)
        {
            state[i] = getState( words[i] );
        }
        
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if( (state[i] & state[j]) == 0 ) // this means both the strings doesn't contains similar characters
                {
                    max = Math.max( max, words[i].length()*words[j].length() );
                }
            }
        }
        return max;
    }
    
    private int getState(String s)
    {
        int state = 0;
        for(char ch : s.toCharArray() )
        {
            int index = ch - 'a'; 
            state |= 1 << (index); // setting the bits
        }
        return state;
    }
}