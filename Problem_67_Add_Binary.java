/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
/////////////////////////////////////////////////////////////////////////////
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        StringBuilder sa= new StringBuilder();
        StringBuilder so= new StringBuilder();
        int max=0,rem=0;
        if(a.length()>b.length())
        {
            max=a.length();
            sb=sb.append(b);
            sa=sa.append(a);
            sb=sb.reverse();
            for(int x=0;x<(a.length()-b.length());x++)
            {
                sb=sb.append('0');
            }
            sb=sb.reverse();
        }
        else if(b.length()>a.length())
        {
            max=b.length();
            sb=sb.append(b);
            sa=sa.append(a);
            sa=sa.reverse();
            for(int x=0;x<(b.length()-a.length());x++)
            {
                sa=sa.append('0');
            }
            sa=sa.reverse();
        }
        else
        {
            sb=sb.append(b);
            sa=sa.append(a);   
        }
        for(int i=sa.length()-1;i>=0;i--)
        {
            if((sa.charAt(i)=='1'&&sb.charAt(i)=='1'))
            {
                if(rem==1)
                {
                    so.append('1');
                    rem=1;
                }
                else
                {
                    so.append('0');
                    rem=1;
                }
            }
            else if((sa.charAt(i)=='0'&&sb.charAt(i)=='0'))
            {
                if(rem==1)
                {
                    so.append('1');
                    rem=0;
                }
                else
                {
                    so.append('0');
                    rem=0;
                }
            }
            else
            {
                if(rem==1)
                {
                    so.append('0');
                    rem=1;
                }
                else
                {
                    so.append('1');
                    rem=0;
                }
            }
        }
        if(rem == 1)
        {
            so=so.append(1);
        }
        so=so.reverse();
        String s = so.toString();
        return s;
    }
}
