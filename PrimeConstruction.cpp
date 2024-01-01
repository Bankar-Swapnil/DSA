#include <bits/stdc++.h>
#define l long long
using namespace std;
bool isPrime(l num)
{
    if (num <= 1)
    {
        return false;
    }
    for (l i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }
    return true;
}

l PrimeConstruction()
{
    l z;
    vector<l> vPd;
    l ans = 1;
    l minVal = LLONG_MAX;
    while (cin >> z)
    {
        vPd.push_back(z);
        if (z < minVal)
        {
            minVal = z;
        }
    }
    int index1 = 0;
    int k = vPd.size();
    for (int i = 0; i < k; i++)
    {
        if (vPd[i] == minVal)
        {
            index1 = i;
        }
    }
    swap(vPd[k - 1], vPd[index1]);

    for (int i = 0; i < k - 1; i++)
    {
        ans = ans * vPd[i] / __gcd(ans, vPd[i]);
    }

    l targetVal = ans;
    while (targetVal < pow(10, 10))
    {
        if (isPrime(targetVal + minVal))
        {
            return targetVal + minVal;
        }
        targetVal = 2 * targetVal;
    }
    return -1;
}

int main()
{
    l Result = PrimeConstruction();
    if (Result == -1)
    {
        cout << "None";
    }
    else
    {
        cout << Result;
    }
    return 0;
}