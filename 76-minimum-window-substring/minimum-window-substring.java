class Solution {

    public String minWindow(String string_S , String string_T){

        int starting_index = 0;

        int ending_index = Integer.MAX_VALUE;

        Map<Character , Integer> frequency_S = new HashMap<Character , Integer>();

        Map<Character , Integer> frequency_T = new HashMap<Character , Integer>();

        for(int i=0 , N = string_T.length() ; (i < N) ; i++){

            char alphabet = string_T.charAt(i);
            
            frequency_T.put(alphabet , (frequency_T.getOrDefault(alphabet , 0) + 1));
        }

        int first_pointer = 0;

        int second_pointer = 0;

        int N = string_S.length();

        while(second_pointer < N){

            char alphabet_at_second_pointer = string_S.charAt(second_pointer++);

            frequency_S.put(alphabet_at_second_pointer , (frequency_S.getOrDefault(alphabet_at_second_pointer , 0) + 1));
            
            while(true){

                boolean flag = false;

                for(char key : frequency_T.keySet()){
                    
                    if(frequency_S.getOrDefault(key , 0) < frequency_T.get(key)){
                        
                        flag = true;
                        
                        break;
                    }
                }

                if(flag){
                    break;
                }

                if(ending_index > (second_pointer - first_pointer)){

                    starting_index = first_pointer;
                    
                    ending_index = (second_pointer - first_pointer);
                }

                char alphabet_at_first_pointer = string_S.charAt(first_pointer++);

                frequency_S.put(alphabet_at_first_pointer , (frequency_S.get(alphabet_at_first_pointer) - 1));
            }
        }

        return (ending_index != Integer.MAX_VALUE) ? (string_S.substring(starting_index , (starting_index + ending_index))) : ("");
    }
}