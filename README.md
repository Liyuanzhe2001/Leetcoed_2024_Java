# Leetcoed_2024_Java

2024力扣做题记录 Java

### kmp算法模板

```java
class Solution {
    public void kmp(String pattern) {
        int[] kmp = new int[m];
        int cnt = 0;
        for (int i = 1; i < m; i++) {
            int v = pattern[i];
            while (cnt > 0 && pattern[cnt] != v) {
                cnt = kmp[cnt - 1];
            }
            if (pattern[cnt] == v) {
                cnt++;
            }
            kmp[i] = cnt;
        }
    }
}
```

### 字符串中出现次数为奇数的字母个数
```java
mask ^= 1 << (c - 'a');
```

### 质数判断
```java
public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    if (number == 2) {
        return true;
    }
    if (number % 2 == 0) {
        return false;
    }
    for (int i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
```

### 质数数组
```java
private final static int MX = (int) 1e5;
// 质数=false 非质数=true
private final static boolean[] np = new boolean[MX + 1];

static {
    np[1] = true;
    for (int i = 2; i * i <= MX; i++) {
        if (!np[i]) {
            for (int j = i * i; j <= MX; j += i) {
                np[j] = true;
            }
        }
    }
}
```
