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
