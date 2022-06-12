import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class graphs
{
    private void breadthFirst(String node, HashMap<String, String[]> neighbors)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() > 0)
        {
            String current = queue.remove();
            System.out.println(current);
            queue.addAll(Arrays.asList(neighbors.get(current)));
        }
    }

    public static void main(String...args)
    {
        graphs ob = new graphs();
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("a", new String[]{"c", "b"});
        graph.put("b", new String[]{"d"});
        graph.put("c", new String[]{"e"});
        graph.put("d", new String[]{"f"});
        graph.put("e", new String[]{});
        graph.put("f", new String[]{});
        ob.breadthFirst("a", graph);
    }
}
