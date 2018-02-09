package entity;

public class SteamId {

    private byte university;

    private long id;

    public SteamId(byte university,long id){
        this.university = university;
        this.id = id;
    }

    public SteamId(long id64){
        //TODO Process 64 id to University + id
    }

}
