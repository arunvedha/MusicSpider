package com.example.android.musicspider;

import java.util.List;

import com.example.android.musicspider.MusicCLasses.PrimaryGenres;
import com.example.android.musicspider.MusicCLasses.SecondaryGenres;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("track_id")
    @Expose
    private long trackId;
    @SerializedName("track_mbid")
    @Expose
    private String trackMbid;
    @SerializedName("track_isrc")
    @Expose
    private String trackIsrc;
    @SerializedName("track_spotify_id")
    @Expose
    private String trackSpotifyId;
    @SerializedName("track_soundcloud_id")
    @Expose
    private String trackSoundcloudId;
    @SerializedName("track_xboxmusic_id")
    @Expose
    private String trackXboxmusicId;
    @SerializedName("track_name")
    @Expose
    private String trackName;
    @SerializedName("track_name_translation_list")
    @Expose
    private List<Object> trackNameTranslationList = null;
    @SerializedName("track_rating")
    @Expose
    private long trackRating;
    @SerializedName("track_length")
    @Expose
    private long trackLength;
    @SerializedName("commontrack_id")
    @Expose
    private long commontrackId;
    @SerializedName("instrumental")
    @Expose
    private long instrumental;
    @SerializedName("explicit")
    @Expose
    private long explicit;
    @SerializedName("has_lyrics")
    @Expose
    private long hasLyrics;
    @SerializedName("has_lyrics_crowd")
    @Expose
    private long hasLyricsCrowd;
    @SerializedName("has_subtitles")
    @Expose
    private long hasSubtitles;
    @SerializedName("has_richsync")
    @Expose
    private long hasRichsync;
    @SerializedName("num_favourite")
    @Expose
    private long numFavourite;
    @SerializedName("lyrics_id")
    @Expose
    private long lyricsId;
    @SerializedName("subtitle_id")
    @Expose
    private long subtitleId;
    @SerializedName("album_id")
    @Expose
    private long albumId;
    @SerializedName("album_name")
    @Expose
    private String albumName;
    @SerializedName("artist_id")
    @Expose
    private long artistId;
    @SerializedName("artist_mbid")
    @Expose
    private String artistMbid;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("album_coverart_100x100")
    @Expose
    private String albumCoverart100x100;
    @SerializedName("album_coverart_350x350")
    @Expose
    private String albumCoverart350x350;
    @SerializedName("album_coverart_500x500")
    @Expose
    private String albumCoverart500x500;
    @SerializedName("album_coverart_800x800")
    @Expose
    private String albumCoverart800x800;
    @SerializedName("track_share_url")
    @Expose
    private String trackShareUrl;
    @SerializedName("track_edit_url")
    @Expose
    private String trackEditUrl;
    @SerializedName("commontrack_vanity_id")
    @Expose
    private String commontrackVanityId;
    @SerializedName("restricted")
    @Expose
    private long restricted;
    @SerializedName("first_release_date")
    @Expose
    private String firstReleaseDate;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;
    @SerializedName("primary_genres")
    @Expose
    private PrimaryGenres primaryGenres;
    @SerializedName("secondary_genres")
    @Expose
    private SecondaryGenres secondaryGenres;

    /**
     * No args constructor for use in serialization
     *
     */
    public Track() {
    }

    /**
     *
     * @param firstReleaseDate
     * @param hasLyrics
     * @param trackXboxmusicId
     * @param albumCoverart500x500
     * @param artistMbid
     * @param trackName
     * @param secondaryGenres
     * @param lyricsId
     * @param artistId
     * @param trackSpotifyId
     * @param trackEditUrl
     * @param albumCoverart800x800
     * @param updatedTime
     * @param albumCoverart350x350
     * @param trackNameTranslationList
     * @param albumCoverart100x100
     * @param trackId
     * @param albumName
     * @param albumId
     * @param restricted
     * @param trackMbid
     * @param trackSoundcloudId
     * @param hasRichsync
     * @param trackRating
     * @param hasLyricsCrowd
     * @param subtitleId
     * @param trackIsrc
     * @param hasSubtitles
     * @param explicit
     * @param instrumental
     * @param primaryGenres
     * @param commontrackVanityId
     * @param artistName
     * @param numFavourite
     * @param trackShareUrl
     * @param commontrackId
     * @param trackLength
     */
    public Track(long trackId, String trackMbid, String trackIsrc, String trackSpotifyId, String trackSoundcloudId, String trackXboxmusicId, String trackName, List<Object> trackNameTranslationList, long trackRating, long trackLength, long commontrackId, long instrumental, long explicit, long hasLyrics, long hasLyricsCrowd, long hasSubtitles, long hasRichsync, long numFavourite, long lyricsId, long subtitleId, long albumId, String albumName, long artistId, String artistMbid, String artistName, String albumCoverart100x100, String albumCoverart350x350, String albumCoverart500x500, String albumCoverart800x800, String trackShareUrl, String trackEditUrl, String commontrackVanityId, long restricted, String firstReleaseDate, String updatedTime, PrimaryGenres primaryGenres, SecondaryGenres secondaryGenres) {
        super();
        this.trackId = trackId;
        this.trackMbid = trackMbid;
        this.trackIsrc = trackIsrc;
        this.trackSpotifyId = trackSpotifyId;
        this.trackSoundcloudId = trackSoundcloudId;
        this.trackXboxmusicId = trackXboxmusicId;
        this.trackName = trackName;
        this.trackNameTranslationList = trackNameTranslationList;
        this.trackRating = trackRating;
        this.trackLength = trackLength;
        this.commontrackId = commontrackId;
        this.instrumental = instrumental;
        this.explicit = explicit;
        this.hasLyrics = hasLyrics;
        this.hasLyricsCrowd = hasLyricsCrowd;
        this.hasSubtitles = hasSubtitles;
        this.hasRichsync = hasRichsync;
        this.numFavourite = numFavourite;
        this.lyricsId = lyricsId;
        this.subtitleId = subtitleId;
        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.artistMbid = artistMbid;
        this.artistName = artistName;
        this.albumCoverart100x100 = albumCoverart100x100;
        this.albumCoverart350x350 = albumCoverart350x350;
        this.albumCoverart500x500 = albumCoverart500x500;
        this.albumCoverart800x800 = albumCoverart800x800;
        this.trackShareUrl = trackShareUrl;
        this.trackEditUrl = trackEditUrl;
        this.commontrackVanityId = commontrackVanityId;
        this.restricted = restricted;
        this.firstReleaseDate = firstReleaseDate;
        this.updatedTime = updatedTime;
        this.primaryGenres = primaryGenres;
        this.secondaryGenres = secondaryGenres;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public Track withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public Track withTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
        return this;
    }

    public String getTrackIsrc() {
        return trackIsrc;
    }

    public void setTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
    }

    public Track withTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
        return this;
    }

    public String getTrackSpotifyId() {
        return trackSpotifyId;
    }

    public void setTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
    }

    public Track withTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
        return this;
    }

    public String getTrackSoundcloudId() {
        return trackSoundcloudId;
    }

    public void setTrackSoundcloudId(String trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
    }

    public Track withTrackSoundcloudId(String trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
        return this;
    }

    public String getTrackXboxmusicId() {
        return trackXboxmusicId;
    }

    public void setTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
    }

    public Track withTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
        return this;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Track withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public List<Object> getTrackNameTranslationList() {
        return trackNameTranslationList;
    }

    public void setTrackNameTranslationList(List<Object> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
    }

    public Track withTrackNameTranslationList(List<Object> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
        return this;
    }

    public long getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(long trackRating) {
        this.trackRating = trackRating;
    }

    public Track withTrackRating(long trackRating) {
        this.trackRating = trackRating;
        return this;
    }

    public long getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(long trackLength) {
        this.trackLength = trackLength;
    }

    public Track withTrackLength(long trackLength) {
        this.trackLength = trackLength;
        return this;
    }

    public long getCommontrackId() {
        return commontrackId;
    }

    public void setCommontrackId(long commontrackId) {
        this.commontrackId = commontrackId;
    }

    public Track withCommontrackId(long commontrackId) {
        this.commontrackId = commontrackId;
        return this;
    }

    public long getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(long instrumental) {
        this.instrumental = instrumental;
    }

    public Track withInstrumental(long instrumental) {
        this.instrumental = instrumental;
        return this;
    }

    public long getExplicit() {
        return explicit;
    }

    public void setExplicit(long explicit) {
        this.explicit = explicit;
    }

    public Track withExplicit(long explicit) {
        this.explicit = explicit;
        return this;
    }

    public long getHasLyrics() {
        return hasLyrics;
    }

    public void setHasLyrics(long hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    public Track withHasLyrics(long hasLyrics) {
        this.hasLyrics = hasLyrics;
        return this;
    }

    public long getHasLyricsCrowd() {
        return hasLyricsCrowd;
    }

    public void setHasLyricsCrowd(long hasLyricsCrowd) {
        this.hasLyricsCrowd = hasLyricsCrowd;
    }

    public Track withHasLyricsCrowd(long hasLyricsCrowd) {
        this.hasLyricsCrowd = hasLyricsCrowd;
        return this;
    }

    public long getHasSubtitles() {
        return hasSubtitles;
    }

    public void setHasSubtitles(long hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    public Track withHasSubtitles(long hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
        return this;
    }

    public long getHasRichsync() {
        return hasRichsync;
    }

    public void setHasRichsync(long hasRichsync) {
        this.hasRichsync = hasRichsync;
    }

    public Track withHasRichsync(long hasRichsync) {
        this.hasRichsync = hasRichsync;
        return this;
    }

    public long getNumFavourite() {
        return numFavourite;
    }

    public void setNumFavourite(long numFavourite) {
        this.numFavourite = numFavourite;
    }

    public Track withNumFavourite(long numFavourite) {
        this.numFavourite = numFavourite;
        return this;
    }

    public long getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(long lyricsId) {
        this.lyricsId = lyricsId;
    }

    public Track withLyricsId(long lyricsId) {
        this.lyricsId = lyricsId;
        return this;
    }

    public long getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(long subtitleId) {
        this.subtitleId = subtitleId;
    }

    public Track withSubtitleId(long subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public Track withAlbumId(long albumId) {
        this.albumId = albumId;
        return this;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Track withAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public Track withArtistId(long artistId) {
        this.artistId = artistId;
        return this;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public Track withArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Track withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getAlbumCoverart100x100() {
        return albumCoverart100x100;
    }

    public void setAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
    }

    public Track withAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
        return this;
    }

    public String getAlbumCoverart350x350() {
        return albumCoverart350x350;
    }

    public void setAlbumCoverart350x350(String albumCoverart350x350) {
        this.albumCoverart350x350 = albumCoverart350x350;
    }

    public Track withAlbumCoverart350x350(String albumCoverart350x350) {
        this.albumCoverart350x350 = albumCoverart350x350;
        return this;
    }

    public String getAlbumCoverart500x500() {
        return albumCoverart500x500;
    }

    public void setAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
    }

    public Track withAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
        return this;
    }

    public String getAlbumCoverart800x800() {
        return albumCoverart800x800;
    }

    public void setAlbumCoverart800x800(String albumCoverart800x800) {
        this.albumCoverart800x800 = albumCoverart800x800;
    }

    public Track withAlbumCoverart800x800(String albumCoverart800x800) {
        this.albumCoverart800x800 = albumCoverart800x800;
        return this;
    }

    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    public Track withTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
        return this;
    }

    public String getTrackEditUrl() {
        return trackEditUrl;
    }

    public void setTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
    }

    public Track withTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
        return this;
    }

    public String getCommontrackVanityId() {
        return commontrackVanityId;
    }

    public void setCommontrackVanityId(String commontrackVanityId) {
        this.commontrackVanityId = commontrackVanityId;
    }

    public Track withCommontrackVanityId(String commontrackVanityId) {
        this.commontrackVanityId = commontrackVanityId;
        return this;
    }

    public long getRestricted() {
        return restricted;
    }

    public void setRestricted(long restricted) {
        this.restricted = restricted;
    }

    public Track withRestricted(long restricted) {
        this.restricted = restricted;
        return this;
    }

    public String getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public Track withFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
        return this;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Track withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

    public Track withPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
        return this;
    }

    public SecondaryGenres getSecondaryGenres() {
        return secondaryGenres;
    }

    public void setSecondaryGenres(SecondaryGenres secondaryGenres) {
        this.secondaryGenres = secondaryGenres;
    }

    public Track withSecondaryGenres(SecondaryGenres secondaryGenres) {
        this.secondaryGenres = secondaryGenres;
        return this;
    }

}
