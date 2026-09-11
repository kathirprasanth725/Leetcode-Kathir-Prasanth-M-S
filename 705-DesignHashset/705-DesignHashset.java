// Last updated: 9/11/2026, 9:28:59 AM
class MyHashSet {
    private boolean[] mp;

    public MyHashSet() {
        mp = new boolean[1000001];
        Arrays.fill(mp, false);
    }

    public void add(int key) {
        mp[key] = true;
    }

    public void remove(int key) {
        mp[key] = false;
    }

    public boolean contains(int key) {
        return mp[key];
    }
}