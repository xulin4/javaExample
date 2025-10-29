package org.example.xiaohongshusuanfa;

public class fan {
    int id;
    int like;
    int collect;
    int support;

    fan(int id, int like, int collect) {
        this.id = id;
        this.like = like;
        this.collect = collect;
        this.support=like+collect*2;
    }

}
