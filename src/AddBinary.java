public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int index = 0;
        int carry = 0;
        int[] arr1 = new int[a.length()];
        int[] arr2 = new int[b.length()];
        for (int i=a.length()-1;i>=0;i--){
            arr1[a.length() - i - 1] = a.charAt(i) - '0';
        }
        for(int i=b.length()-1;i>=0;i--){
            arr2[b.length() - i - 1] = b.charAt(i) - '0';
        }
        while (index < arr1.length || index < arr2.length){
            int n1 = (index < arr1.length )? arr1[index] : 0;
            int n2 = (index < arr2.length) ? arr2[index] : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 2;
            sum = sum  % 2;
            output.append(sum);
            index++;
        }
        if (carry != 0){
            output.append(carry);
        }
        output.reverse();

        return output.toString();
    }
}
