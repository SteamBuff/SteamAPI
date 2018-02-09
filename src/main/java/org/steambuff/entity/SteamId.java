package org.steambuff.entity;

public class SteamId {

    private byte universe;

    private long id;

    public SteamId(byte universe,long id){
        this.universe = universe;
        this.id = id;
    }

    public SteamId(long id64){
        //TODO Process 64 id to University + id
    }

    public long toId64() {
        return universe + id * 2 + 76561197960265728L;
    }
}
