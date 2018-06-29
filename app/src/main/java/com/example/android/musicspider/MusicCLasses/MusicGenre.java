package com.example.android.musicspider.MusicCLasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicGenre {

    @SerializedName("music_genre_id")
    @Expose
    private long musicGenreId;
    @SerializedName("music_genre_parent_id")
    @Expose
    private long musicGenreParentId;
    @SerializedName("music_genre_name")
    @Expose
    private String musicGenreName;
    @SerializedName("music_genre_name_extended")
    @Expose
    private String musicGenreNameExtended;
    @SerializedName("music_genre_vanity")
    @Expose
    private String musicGenreVanity;

    /**
     * No args constructor for use in serialization
     *
     */
    public MusicGenre() {
    }

    /**
     *
     * @param musicGenreName
     * @param musicGenreId
     * @param musicGenreNameExtended
     * @param musicGenreVanity
     * @param musicGenreParentId
     */
    public MusicGenre(long musicGenreId, long musicGenreParentId, String musicGenreName, String musicGenreNameExtended, String musicGenreVanity) {
        super();
        this.musicGenreId = musicGenreId;
        this.musicGenreParentId = musicGenreParentId;
        this.musicGenreName = musicGenreName;
        this.musicGenreNameExtended = musicGenreNameExtended;
        this.musicGenreVanity = musicGenreVanity;
    }

    public long getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(long musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    public MusicGenre withMusicGenreId(long musicGenreId) {
        this.musicGenreId = musicGenreId;
        return this;
    }

    public long getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(long musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public MusicGenre withMusicGenreParentId(long musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
        return this;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public MusicGenre withMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
        return this;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public MusicGenre withMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
        return this;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

    public MusicGenre withMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
        return this;
    }

}
