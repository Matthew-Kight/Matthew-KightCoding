public class algorithms1 {

    public boolean linearSearch(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }

        return false;
    }

    public boolean binarySearch(int[] haystack, int needle) {
        int low = 0;
        int high = haystack.length;

        while (low < high) {
            int middle = (int) Math.floor(low + (high - low) / 2);
            int value = haystack[middle];

            if (value == needle) {
                return true;
            }
            else if (value > needle) {
                high = middle;
            }
            else {
                low = middle + 1;
            }
        }
        
        
        return false;
    }

    public int twoCrystalBalls(boolean[] breaks) {
        int jumpAmount = (int) Math.floor(Math.sqrt(breaks.length));

        int i = jumpAmount;
        for (; i < breaks.length; i += jumpAmount) {
            if (breaks[i]) {
                break;
            }
        }

        i -= jumpAmount;
        for (int j = 0; j <= jumpAmount && j < breaks.length; j++, i++) {
            if (breaks[i]) {
                return i;
            }
        }

        return -1;
    }

    public void bubbleSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length - 1 - i; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
    }

    
}