package org.steambuff.method;

public class SteamId implements SteamIdInterface{

    private byte universe;

    private long id;

    public SteamId(int universe, long id) {
        this.universe = (byte) universe;
        this.id = id;
    }

    public SteamId(String id64) {
        long id64Long = Long.parseLong(id64);
        byte universe = (byte) (id64Long % 2);
        long id = (id64Long - 76561197960265728L - universe) / 2;
        this.universe = universe;
        this.id = id;
    }

    public SteamId(long id64){
        byte universe = (byte) (id64 % 2);
        long id = (id64 - 76561197960265728L - universe) / 2;
        this.universe = universe;
        this.id = id;
    }

    public long toId64() {
        return universe + id * 2 + 76561197960265728L;
    }

    @Override
    public String toString() {
        return "STEAM_0:"+universe+":"+id;
    }
}
