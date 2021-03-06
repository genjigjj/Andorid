package com.gjj.avgle.net.model;

import java.util.List;

public class AvgleResponse {
    private boolean has_more;
    private int total_videos;
    private int current_offset;
    private int limit;
    private List<Video> videos;

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public int getTotal_videos() {
        return total_videos;
    }

    public void setTotal_videos(int total_videos) {
        this.total_videos = total_videos;
    }

    public int getCurrent_offset() {
        return current_offset;
    }

    public void setCurrent_offset(int current_offset) {
        this.current_offset = current_offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AvgleResponse{");
        sb.append("has_more=").append(has_more);
        sb.append(", total_videos=").append(total_videos);
        sb.append(", current_offset=").append(current_offset);
        sb.append(", limit=").append(limit);
        sb.append(", videos=").append(videos);
        sb.append('}');
        return sb.toString();
    }
}
