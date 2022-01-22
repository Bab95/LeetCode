public class MultiplyStrings {

    public String multiply(String num1, String num2, boolean faster){
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] ans = new int[num1.length() + num2.length()];
        int[] arr1 = new int[num1.length()];
        int[] arr2 = new int[num2.length()];
        for (int i = 0;i < num1.length();i++){
            arr1[num1.length() - i - 1] = num1.charAt(i) - '0';
        }
        for (int i=0;i<num2.length();i++){
            arr2[num2.length() - i - 1] = num2.charAt(i) - '0';
        }
        for (int i = 0;i < arr1.length;i++){
            for (int j = 0;j < arr2.length;j++){
                ans[i+j] += arr1[i] * arr2[j];
            }
        }
        int carry = 0;
        for(int i = 0;i < ans.length;i++){
            ans[i] += carry;
            carry = ans[i] / 10;
            ans[i] = ans[i] % 10;
        }
        StringBuilder outputBuilder = new StringBuilder();
        int index = ans.length - 1;
        while (index >=0 && ans[index] == 0){
            index--;
        }
        for (;index>=0;index--){
            outputBuilder.append(ans[index]);
        }
        return outputBuilder.toString();
    }
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        String result = "";
        for (int i = num1.length()-1;i >= 0;i--){
            int outer = num1.charAt(i) - '0';
            String current = "";
            for (int k = 0;k < num1.length() - i - 1; k++){
                current = current.concat("0");
            }
            int carry = 0;
            for (int j = num2.length()-1;j >= 0;j--){
                int inner = num2.charAt(j) - '0';
                int multiplication = carry + outer * inner;
                carry = multiplication / 10;
                multiplication = multiplication % 10;
                current = current.concat(String.valueOf(multiplication));
            }
            if (carry != 0){
                current = current.concat(String.valueOf(carry));
                carry = 0;
            }
            if (result.length() == 0){
                result = current;
            }else{
                int index = 0;
                String temp_result = "";
                while (index < result.length() || index < current.length()){
                    int a = (index < result.length()) ? result.charAt(index) - '0' : 0;
                    int b = (index < current.length()) ? current.charAt(index) - '0' : 0;
                    int sum = a + b + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                    temp_result = temp_result.concat(String.valueOf(sum));
                    index++;
                }
                if ( carry != 0){
                    temp_result = temp_result.concat(String.valueOf(carry));
                }
                result = temp_result;
            }
        }
        String ans = "";
        for(int i=result.length()-1;i>=0;i--){
            ans = ans.concat(String.valueOf(result.charAt(i)));
        }
        return ans;
    }
}
/*
23145
   23
 */