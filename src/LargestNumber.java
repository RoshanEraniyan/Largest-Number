import java.util.*;

class Solution
{
    public void largeno(int[] array,int n)
    {
        String[] num=new String[n];

        for (int i=0;i<n;i++)
        {
            num[i]=String.valueOf(array[i]);
        }
        Arrays.sort(num,new CustomComparator());
        StringBuilder result=new StringBuilder();
        if(num[0].equals("0"))
        {
            result.append("0");
        }
        else
        {
            for(String x:num)
            {
                result.append(x);
            }
        }
        System.out.println(result);
    }
    static class CustomComparator implements Comparator<String>
    {
        @Override
        public int compare(String a,String b)
        {
            String ab=a+b;
            String ba=b+a;
            return ba.compareTo(ab);
        }
    }

}

class LargestNumber
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.largeno(array,n);
    }
}