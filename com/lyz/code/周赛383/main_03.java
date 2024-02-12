package com.lyz.code.周赛383;

/**
 * @author lkunk
 * @date 2024年02月12日 23:26
 * @description
 */

public class main_03 {
    public int[][] resultGrid(int[][] a, int threshold) {
        int m = a.length;
        int n = a[0].length;
        int[][] result = new int[m][n];
        int[][] cnt = new int[m][n];
        for (int i = 2; i < m; i++) {
            for (int j = 2; j < n; j++) {
                boolean f = true;

                for (int x = i - 2; x <= i && f; x++) {
                    if (Math.abs(a[x][j - 2] - a[x][j - 1]) > threshold || Math.abs(a[x][j - 1] - a[x][j]) > threshold) {
                        f = false;
                        break;
                    }
                }
                for (int y = j - 2; y <= j && f; ++y) {
                    if (Math.abs(a[i - 2][y] - a[i - 1][y]) > threshold || Math.abs(a[i - 1][y] - a[i][y]) > threshold) {
                        f = false;
                        break;
                    }
                }

                if (f) {
                    int avg = 0;
                    for (int x = i - 2; x <= i; x++) {
                        for (int y = j - 2; y <= j; y++) {
                            avg += a[x][y];
                        }
                    }
                    avg /= 9;

                    for (int x = i - 2; x <= i; x++) {
                        for (int y = j - 2; y <= j; y++) {
                            result[x][y] += avg;
                            cnt[x][y]++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt[i][j] == 0) {
                    result[i][j] = a[i][j];
                } else {
                    result[i][j] /= cnt[i][j];
                }
            }
        }
        return result;
    }
}
