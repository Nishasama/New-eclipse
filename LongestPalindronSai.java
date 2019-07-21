package Optimized;
public int longestPalindrome(String str) {
        int oddLength = -1;
        int evenLength = -1;

        for (int i = 1; i < str.length() - 1; i++) {
            //Odd length palindrome with current index i as center of palindrome
            if (str.charAt(i-1) == str.charAt(i+1)) {
                //this method will
                oddLength = Math.max(oddLength,  1 + validatePalindrome(str, i - 1, i + 1));
            }

            //Even length palindrome with current index i and i + 1 as center of palindrome
            if (str.charAt(i) == str.charAt(i+1)) {
                //this method will
                evenLength = Math.max(evenLength, validatePalindrome(str, i, i + 1));
            }
        }

        return Math.max(oddLength, evenLength);
    }

    public int validatePalindrome(String str, int left, int right) {
        int initialRight = right;

        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }

        return (right - initialRight) * 2;
    }

//otototomadamt
    
    //tottotman