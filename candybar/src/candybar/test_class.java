package candybar;

import java.util.ArrayList;

public class test_class {
        
public static boolean makeArrayConsecutive2(int [] statues) {
        int cached_index = -1;
        ArrayList<Integer> clone = new ArrayList<Integer>();
        
        for(int e : statues) {
                clone.add(e);
        }
        cached_index = find_bad_index(statues);
        clone.remove(cached_index);
        if(cached_index < 0) {
                return true;
        } else {
                cached_index = find_bad_index(clone);
                if(cached_index > 0) {
                        return false;
                } else {
                        return true;
                }
        }
        
} // end func
        
        private static int find_bad_index(ArrayList<Integer> clone) {
                for(int i = 0; i < clone.size() - 1; i++) {
                        if(clone.get(0) > clone.get(1)){
                                return 0;
                        }else if(clone.get(i) > clone.get(i+1) ) {
                                return i+1;
                        }
                }
                return -1; // list was clean
        }

        public static int find_bad_index(int [] statues) {
                for(int i = 0; i < statues.length - 1; i++) {
                        if(statues[0] > statues[1]) {
                                return 0;
                        } else if(statues[i] > statues[i+1]) {
                                return i+1;
                        }
                }
                return -1; // list was clean
        }
        
        public static void main(String[] args) {
                int[] arr = {10,1,2,3,4,5};
                makeArrayConsecutive2(arr);
        }
}
