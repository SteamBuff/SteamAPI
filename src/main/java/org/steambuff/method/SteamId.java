package org.steambuff.method;

public class SteamId {

    private byte universe;

    private long id;

    public SteamId(int universe, long id) {
        this.universe = (byte) universe;
        this.id = id;
    }

    public SteamId(String id64) {
        long id64Logn = Long.parseLong(id64);
        byte universe = (byte) (id64Logn % 2);
        long id = (id64Logn - 76561197960265728L - universe) / 2;
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
}
