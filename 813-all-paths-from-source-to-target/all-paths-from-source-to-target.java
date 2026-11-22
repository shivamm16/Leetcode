class Solution {

    static void dfs(int source ,int dest,List<List<Integer>> res, List<Integer> cur ,boolean[] visit , int[][] graph)
    {
        cur.add(source);
        visit[source] = true;
        if(source == dest)
        {
            res.add(new ArrayList<>(cur));
        }

        for(int i : graph[source])
        {
            if(!visit[i])
            {
                dfs(i,dest,res,cur,visit,graph);
            }
        }
        visit[source] = false;
        cur.remove(cur.size()-1);
    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,n-1,res,new ArrayList<>(),visit,graph);
        return res;
    }
}