package Assignments;

/**
 * Created by Jagriti on 1/9/2019.
 */
public class Qno10 {
    public static void main(String[] args) {
        int a[] = {10,20,11,10,23,20,11,24,34,21,23}, i, j, k,n;
        n  = 11;
        System.out.println("array with repeated elements ");
        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("after removing repeated elemts");
        for(i = 0; i < n; i++)
        {
            for(j = i+1; j < n; )
            {
                if(a[j] == a[i])
                {
                    for(k = j; k < n; k++)
                    {
                        a[k] = a[k+1];
                    }
                    n--;
                }
                else
                {
                    j++;
                }
            }
        }
        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}
