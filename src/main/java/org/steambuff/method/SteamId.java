package org.steambuff.method;

/**
 * The type Steam id.
 *
 * @see <a href="https://developer.valvesoftware.com/wiki/SteamID">About steamId</a>
 */
public class SteamId implements SteamIdInterface {

    /**
     * First 8 bits in account Id
     */
    private byte universe = 0;

    /**
     * Last bit in account Id
     */
    private byte lastBit;

    /**
     * Last 31 bit (without last bit) in account Id
     */
    private long id;

    /**
     * Instantiates a new Steam id.
     *
     * @param universe the universe
     * @param lastBit  the last bit
     * @param id       the id
     */
    public SteamId(byte universe, byte lastBit, long id) {
        this.lastBit = lastBit;
        this.id = id;
    }


    /**
     * Instantiates a new Steam id.
     *
     * @param lastBit the last bit
     * @param id      the id
     */
    public SteamId(int lastBit, long id) {
        this.lastBit = (byte) lastBit;
        this.id = id;
    }

    /**
     * Instantiates a new Steam id.
     *
     * @param id64 the id 64
     */
    public SteamId(String id64) {
        long id64Long = Long.parseLong(id64);
        byte universe = (byte) (id64Long % 2);
        long id = (id64Long - 76561197960265728L - universe) / 2;
        this.lastBit = universe;
        this.id = id;
    }

    /**
     * Instantiates a new Steam id.
     *
     * @param id64 the id 64
     */
    public SteamId(long id64) {
        byte universe = (byte) (id64 % 2);
        long id = (id64 - 76561197960265728L - universe) / 2;
        this.lastBit = universe;
        this.id = id;
    }

    public long toId64() {
        return lastBit + id * 2 + 76561197960265728L;
    }

    @Override
    public int getLastBit() {
        return lastBit;
    }

    @Override
    public long getId() {
        return id;
    }


    /**
     * Gets universe.
     *
     * @return the universe
     */
    public byte getUniverse() {
        return universe;
    }

    @Override
    public String toString() {

        return "STEAM_" + universe + ":" + lastBit + ":" + id;
    }
}
