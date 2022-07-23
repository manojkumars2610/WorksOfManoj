package com.manoj.learning.leetCode;

public class OtherCode {
public String intToRoman(int num) {
        
        StringBuilder sb = new StringBuilder();
        
        int curDigit = num % 10;
        sb.insert(0, ones(curDigit));
        num /= 10;
        
        if (num == 0) {
            return sb.toString();
        }
        
        curDigit = num % 10;
        sb.insert(0, tens(curDigit));
        num /= 10;

        if (num == 0) {
            return sb.toString();
        }

        
        curDigit = num % 10;
        sb.insert(0, hundreds(curDigit));
        num /= 10;

        if (num == 0) {
            return sb.toString();
        }
        
        curDigit = num;
        sb.insert(0, thousands(curDigit));
        
        return sb.toString();
    }

    private String ones(int n) {
        if (n == 0) {
            return "";
        }
        if (n == 9) {
            return "IX";
        }
        if (n == 5) {
            return "V";
        }
        if (n == 4) {
            return "IV";
        }
        if (n <= 3) {  // `1 <= n <= 3`
            StringBuilder sb = new StringBuilder("I");
            for (int c = 0; c < n - 1; ++c) {
                sb.append("I");
            }
            return sb.toString();
        } else {  // `6 <= n <= 8`
            StringBuilder sb = new StringBuilder("V");
            for (int c = 0; c < n - 5; ++c) {
                sb.append("I");
            }
            return sb.toString();
        }
    }
    
    private String tens(int n) {
        if (n == 0) {
            return "";
        }
        if (n == 9) {
            return "XC";
        }
        if (n == 5) {
            return "L";
        }
        if (n == 4) {
            return "XL";
        }
        if (n <= 3) {  // `1 <= n <= 3`
            StringBuilder sb = new StringBuilder("X");
            for (int c = 0; c < n - 1; ++c) {
                sb.append("X");
            }
            return sb.toString();
        } else {  // `6 <= n <= 8`
            StringBuilder sb = new StringBuilder("L");
            for (int c = 0; c < n - 5; ++c) {
                sb.append("X");
            }
            return sb.toString();
        }
    }
    
    private String hundreds(int n) {
        if (n == 0) {
            return "";
        }
        if (n == 9) {
            return "CM";
        }
        if (n == 5) {
            return "D";
        }
        if (n == 4) {
            return "CD";
        }
        if (n <= 3) {  // `1 <= n <= 3`
            StringBuilder sb = new StringBuilder("C");
            for (int c = 0; c < n - 1; ++c) {
                sb.append("C");
            }
            return sb.toString();
        } else {  // `6 <= n <= 8`
            StringBuilder sb = new StringBuilder("D");
            for (int c = 0; c < n - 5; ++c) {
                sb.append("C");
            }
            return sb.toString();
        }
    }
    
    private String thousands(int n) {
        StringBuilder sb = new StringBuilder("M");
        for (int c = 0; c < n - 1; ++c) {
            sb.append("M");
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
