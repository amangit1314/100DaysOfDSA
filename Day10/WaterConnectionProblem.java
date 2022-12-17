public class WaterConnectionProblem {
    public static void main(String[] args) {
        int n = 9;
        int p = 6;
        int[] a = {7, 5, 4, 2, 9, 3};
        int[] b = {4, 9, 6, 8, 7, 1};
        int[] d = {98, 72, 10, 22, 17, 66};
        waterConnectionProblem(n, p, a, b, d);
    }

    private static void waterConnectionProblem(int n, int p, int[] a, int[] b, int[] d) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            in[i] = i;
            out[i] = 1;
        }
        for (int i = 0; i < p; i++) {
            int u = a[i];
            int v = b[i];
            int w = d[i];
            int pu = findin(in, u);
            int pv = findin(in, v);
            if (pu != pv) {
                if (out[pu] < out[pv]) {
                    in[pu] = pv;
                    out[pv] += out[pu];
                } else {
                    in[pv] = pu;
                    out[pu] += out[pv];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + in[i] + " " + out[i]);
        }
    }

    private static int findin(int[] in, int u) {
        if (in[u] == u) {
            return u;
        }
        return in[u] = findin(in, in[u]);
    }
}