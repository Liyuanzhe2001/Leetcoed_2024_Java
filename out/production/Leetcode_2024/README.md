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
Dijkstra
```java
public int dijkstra(int n, int[][] roads) {
    long[][] g = new long[n][n]; // 邻接矩阵
    for (long[] row : g) {
        Arrays.fill(row, Long.MAX_VALUE / 2); // 防止溢出
    }
    for (int[] r : roads) {
        int x = r[0];
        int y = r[1];
        int d = r[2];
        g[x][y] = d;
        g[y][x] = d;
    }

    long[] dis = new long[n];
    Arrays.fill(dis, 1, n, Long.MAX_VALUE / 2);
    int[] f = new int[n];
    f[0] = 1;
    boolean[] done = new boolean[n];
    while (true) {
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (!done[i] && (x < 0 || dis[i] < dis[x])) {
                x = i;
            }
        }
        if (x == n - 1) {
            // 不可能找到比 dis[n-1] 更短，或者一样短的最短路了（注意本题边权都是正数）
            return f[n - 1];
        }
        done[x] = true; // 最短路长度已确定（无法变得更小）
        for (int y = 0; y < n; y++) { // 尝试更新 x 的邻居的最短路
            long newDis = dis[x] + g[x][y];
            if (newDis < dis[y]) {
                // 就目前来说，最短路必须经过 x
                dis[y] = newDis;
                f[y] = f[x];
            }
        }
    }
}
```
