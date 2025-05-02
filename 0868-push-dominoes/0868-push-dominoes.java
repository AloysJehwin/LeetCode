class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] result = dominoes.toCharArray();
        int[] forces = new int[n];
        int force = 0;
        for (int i = 0; i < n; i++) {
            if (result[i] == 'R') {
                force = n;
            } else if (result[i] == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }
        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (result[i] == 'L') {
                force = n;
            } else if (result[i] == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }
        for (int i = 0; i < n; i++) {
            if (forces[i] > 0) result[i] = 'R';
            else if (forces[i] < 0) result[i] = 'L';
            else result[i] = '.';
        }

        return new String(result);
    }
}
