class Solution {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        Deque<Pair<Integer, Double>> queue=new LinkedList<>();
        queue.offer(new Pair<>(1, 1d));
        Set<Integer> adj[]=new HashSet[n+1];
        
        for(int i=0;i<=n;i++){
            adj[i]=new HashSet<>();
        }

        for(int edge[]:edges){
            int source=edge[0];
            int dest=edge[1];
            adj[source].add(dest);
            adj[dest].add(source);
        }
        
        int level=t+1;
        while(!queue.isEmpty()){
            if(level==0){
                return 0d;
            }
            int size=queue.size();
            while(size-->0){
                Pair<Integer, Double> top=queue.poll();
                int node=top.getKey();
                double probTillNow=top.getValue();
                if(node==target){
                    if(level==1 || adj[node].size()==0){
                        return probTillNow;
                    }else{
                        return 0;
                    }
                }
                double prob=probTillNow*(1/(double)adj[node].size());
                for(int nei:adj[node]){
                    adj[nei].remove(node);
                    queue.offer(new Pair<>(nei, prob));
                }
            }
            level--;
        }
        return 0d;

    }
}