package Model;

import Model.Song;

import java.sql.Blob;
import java.util.ArrayList;

public class Playlist {
    public static final String TABLE_NAME = "playlist";
    public static final String COL_PLAYLISTID = "playlistID";
    public static final String COL_NAME = "name";
    public static final String COL_SONGCOUNT = "songCount";
    public static final String COL_USERNAME = "username";
    public static final String COL_PUBLIC = "public";
    public static final String COL_ISALBUM = "isAlbum";

    private int playlistID;
    private String name;
    private int songCount = 0;
    private String username;
    private boolean isPublic = false;
    private boolean isAlbum;

    public Playlist(){}

    public int getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(int playlistID) {
        this.playlistID = playlistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isAlbum() {
        return isAlbum;
    }

    public void setAlbum(boolean album) {
        isAlbum = album;
    }
}