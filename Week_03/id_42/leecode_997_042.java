class leecode_997_042 {
    public int findJudge(int N, int[][] trust) {
        int[] index = new int[N+1];
        for(int[] t : trust){
            index[t[0]] = -1;
            if(index[t[1]] != -1) index[t[1]]++;
        }
        for(int i = 1; i <= N; i++){
            if(index[i] == N-1) return i;
        }

        return -1;
    }
}