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
在discuss区发现作者的回答，防止数据溢出情况发生的
"(newResult - tail) / 10" turns the "result * 10 + tail" back. If no overflow exists, "(newResult - tail) / 10" should be equal to "result". If overflow happens, they cannot be equal.

https://leetcode.com/problems/reverse-integer/discuss/
