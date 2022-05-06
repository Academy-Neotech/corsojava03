package srl.neotech.model;

import java.sql.Date;

public class Movie {

	private Integer movie_id;
    private String title;
	private Integer budget;
	private String homepage;
	private String overview;
	private Double popularity;
	private Date release_date;
	private Integer revenue;
	private Integer runtime;
	private String movie_status;
	private String tagline;
	private Double vote_average;
	private Integer vote_count;
	
	
	
	
	
	public Movie(Integer movie_id, String title, Integer budget, String homepage) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.budget = budget;
		this.homepage = homepage;
	}
	
	
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public Integer getRevenue() {
		return revenue;
	}
	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getMovie_status() {
		return movie_status;
	}
	public void setMovie_status(String movie_status) {
		this.movie_status = movie_status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}
	public Integer getVote_count() {
		return vote_count;
	}
	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}
	
	
	
	
}
