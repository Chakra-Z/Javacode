package dao;

public class Project {
    // 项目名字对于a标签的内容
    private String name;
    // 项目主页链接，对应a标签的href属性
    private String url;
    // 项目的描述信息，对应li标签里面的内容
    private String description;

    // 要统计的数据
    // 进入url获取以下内容
    private int starCount;
    private int forkCount;
    private int openedIssueCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public int getForkCount() {
        return forkCount;
    }

    public void setForkCount(int forkCount) {
        this.forkCount = forkCount;
    }

    public int getOpenedIssueCount() {
        return openedIssueCount;
    }

    public void setOpenedIssueCount(int openedIssueCount) {
        this.openedIssueCount = openedIssueCount;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", starCount=" + starCount +
                ", forkCount=" + forkCount +
                ", openedIssueCount=" + openedIssueCount +
                '}';
    }
}
