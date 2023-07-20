package org.example;

import java.util.List;

public class Movies
{
    private boolean adult;
    private String backdrop_path;
    private String belongs_to_collection;
    private long budget;
    private List<Genres> genres;
    private String homepage;
    private int id;
    private String imdbId;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private double popularity;
    private String posterPath;
    private List<Production_companies> productionCompanies;
    private List<Production_countries> productionCountries;
    private String releaseDate;
    private int revenue;
    private int runtime;
    private List<Spoken_languages> spokenLanguages;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private double voteAverage;
    private int voteCount;

    public boolean isAdult() {
        return adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public String getBelongs_to_collection() {
        return belongs_to_collection;
    }

    public long getBudget() {
        return budget;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public List<Production_companies> getProductionCompanies() {
        return productionCompanies;
    }

    public List<Production_countries> getProductionCountries() {
        return productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public List<Spoken_languages> getSpokenLanguages() {
        return spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setBelongs_to_collection(String belongs_to_collection) {
        this.belongs_to_collection = belongs_to_collection;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public void setProductionCompanies(List<Production_companies> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public void setProductionCountries(List<Production_countries> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setSpokenLanguages(List<Spoken_languages> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public Movies(boolean adult, String backdrop_path, String belongs_to_collection,
                  long budget, List<Genres> genres, String homepage, int id,
                  String imdbId, String originalLanguage, String originalTitle, String overview,
                  double popularity, String posterPath, List<Production_companies> productionCompanies,
                  List<Production_countries> productionCountries, String releaseDate, int revenue,
                  int runtime, List<Spoken_languages> spokenLanguages, String status, String tagline,
                  String title, boolean video, double voteAverage, int voteCount) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.belongs_to_collection = belongs_to_collection;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.imdbId = imdbId;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.productionCompanies = productionCompanies;
        this.productionCountries = productionCountries;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.spokenLanguages = spokenLanguages;
        this.status = status;
        this.tagline = tagline;
        this.title = title;
        this.video = video;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }
}
