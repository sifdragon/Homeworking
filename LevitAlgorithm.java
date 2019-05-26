import Tangible.VectorHelper;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertDijkstra {
    private static int Levit() {
        int n;
        int v1;
        int v2;
        final int inf = (int) 1e9;
        Matrix g = new Matrix();
        //  g.readFile(file);

        //... чтение графа...

        ArrayList<Integer> d = VectorHelper.initializedArrayList(n, inf);
        d.set(v1, 0);
        ArrayList<Integer> id = new ArrayList<>(n);
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(v1);
        ArrayList<Integer> p = VectorHelper.initializedArrayList(n, -1);

        while (!q.isEmpty()) {
            int v = q.getFirst();
            q.removeFirst();
            id.set(v, 1);
            for (int i = 0; i < g[v].size(); ++i) {
                int to = g[v][i].first;
                int len = g[v][i].second;
                if (d.get(to) > d.get(v) + len) {
                    d.set(to, d.get(v) + len);
                    if (id.get(to) == 0) {
                        q.addLast(to);
                    } else if (id.get(to) == 1) {
                        q.addFirst(to);
                    }
                    p.set(to, v);
                    id.set(to, 1);
                }
            }
        }
        return;
    }
