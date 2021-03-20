def gcd(k, m):
    if(k % m == 0):
        return m
    else:
        return gcd(m, k % m)

print(gcd(81, 36))