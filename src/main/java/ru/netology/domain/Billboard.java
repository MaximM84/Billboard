package ru.netology.domain;

public class Billboard {
    private Billboard[] movies = new Billboard[0];
    private int limit;

    public Billboard() {
        limit = 10;
    }

    public Billboard(int limit) {
        this.limit = limit;
    }

    public Billboard(int i, int i1, String second, int i2, int i3) {
    }

    public Billboard(String r10) {
    }

    public void add(Billboard film) {
        Billboard[] tmp = new Billboard[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length -1] = film;
        movies = tmp;
    }
    public Billboard[] findAll() {
        return movies;

    }
    public Billboard[] findLast() {
        int limit = 10;
        Billboard[] ans = new Billboard[10];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - i];
        }
        return ans;

    }


    public void removeById(int idToRemove) {
    }

    public Billboard[] getAll() {
        return new Billboard[0];
    }

    //Billboard[] result = new Billboard[items.length];
    //return result;
}
