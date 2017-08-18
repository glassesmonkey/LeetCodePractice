public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
他这个判断有什么意义吗
 if ((newResult - tail) / 10 != result)
        { return 0; }

https://leetcode.com/problems/reverse-integer/discuss/