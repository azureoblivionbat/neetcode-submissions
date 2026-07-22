// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> out = new ArrayList<List<Pair>>();
        List<Pair> current = pairs;
        for (int i = 0; i < pairs.size(); i++) {
            current = copy(current);
            Pair pair = current.get(i);
            for (int j = 0; j <= i; ++j) {
                if (current.get(j).key > pair.key) {
                    current.add(j, pair);
                    current.remove(i+1);
                    break;
                }
            }
            out.add(current);
        }
        return out;
    }
    private List<Pair> copy(List<Pair> in) {
        List<Pair> out = new ArrayList<Pair>(in.size());
        for (Pair p : in) {
            out.add(p);
        }
        return out;
    }
}
