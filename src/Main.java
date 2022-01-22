import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TwoSumTest();
        // AddTwoNumbersTest();
        // MultiplyStringsTest();
        //AddBinaryTest();
        // Problem3Test();
        // Problem340Test();
        // Problem1695Test();
        // Problem230Test();
        Problem23Test();
    }
    public static void TwoSumTest(){
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] ans = twoSum.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static void AddTwoNumbersTest(){
        AddTwoNumbers testObject = new AddTwoNumbers();
        ListNode l1 = testObject.BuildLinkedList(new int[] {2,4,3});
        ListNode l2 = testObject.BuildLinkedList(new int[] {5,6,4});
        ListNode l3 = testObject.addTwoNumbers(l1, l2);
        while (l3 != null){
            System.out.print(l3.val + " ");
            l3 = l3.next;
        }
    }

    public static void MultiplyStringsTest(){
        MultiplyStrings testObject = new MultiplyStrings();
        String ans = testObject.multiply("123", "456");
        System.out.println(ans);
        System.out.println(testObject.multiply("1", "234"));
        System.out.println(testObject.multiply("54224", "0"));
        System.out.println(testObject.multiply("123", "456", true));
    }

    public static void AddBinaryTest(){
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010", "1011"));
    }
    public static void Problem3Test(){
        Problem3 testObject = new Problem3();
        System.out.println(testObject.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(testObject.lengthOfLongestSubstring("bbbbb"));
        System.out.println(testObject.lengthOfLongestSubstring("pwwkew"));
        System.out.println(testObject.lengthOfLongestSubstring("bbtablud"));
        System.out.println(testObject.lengthOfLongestSubstring("ohomm"));
        System.out.println(testObject.lengthOfLongestSubstring("pwwkew"));
        System.out.println(testObject.lengthOfLongestSubstring("pwwkew"));
        System.out.println(testObject.lengthOfLongestSubstring("pwwkew"));
        System.out.println(testObject.lengthOfLongestSubstring("pwwkew"));
    }
    public static void Problem340Test(){
        Problem340 testObject = new Problem340();
        //System.out.println(testObject.longestkSubstr("aabacbebebe", 3));
        //System.out.println(testObject.longestkSubstr("aaaaaaa", 3));
        System.out.println(testObject.longestkSubstr("whsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqca", 5));
        System.out.println(testObject.longestkSubstr("whsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqca", 5, true));
    }
    public static void Problem1695Test(){
        Problem1695 testObject = new Problem1695();
        // System.out.println(testObject.maximumUniqueSubarray(new int[] {4,2,4,5,6}));
        System.out.println(testObject.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
    public static void Problem230Test(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        Problem230 testObject = new Problem230();
        System.out.println(testObject.kthSmallest(root, 1));
    }

    public static void Problem23Test(){
        Problem23 testObject = new Problem23();
        ListNode[] listnodes = new ListNode[3];
        listnodes[0] = testObject.BuildLinkedList(new int[]{1,4,5});
        listnodes[1] = testObject.BuildLinkedList(new int[]{1,3,4});
        listnodes[2] = testObject.BuildLinkedList(new int[]{2,6});
        ListNode result = testObject.mergeKLists(listnodes);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
