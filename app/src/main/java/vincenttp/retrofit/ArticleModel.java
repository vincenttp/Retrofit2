package vincenttp.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by DELL on 4/21/2017.
 */

public class ArticleModel {

    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("display_message")
    public String display_message;
    @SerializedName("channel")
    public Channel channel;
    @SerializedName("listEditorChoice")
    public List<ListEditorChoice> listEditorChoice;
    @SerializedName("mem_usage")
    public int mem_usage;

    public static class Channel {
        @SerializedName("channel_name")
        public String channel_name;
        @SerializedName("parent_name")
        public String parent_name;
    }

    public static class ListEditorChoice {
        @SerializedName("type")
        public String type;
        @SerializedName("total_reaction")
        public String total_reaction;
        @SerializedName("_advertorial")
        public String _advertorial;
        @SerializedName("_title")
        public String _title;
        @SerializedName("article_no")
        public String article_no;
        @SerializedName("_slug_unique_number")
        public String _slug_unique_number;
        @SerializedName("_slug")
        public String _slug;
        @SerializedName("channel")
        public String channel;
        @SerializedName("channel_name")
        public String channel_name;
        @SerializedName("parent_channel")
        public String parent_channel;
        @SerializedName("parent_channel_name")
        public String parent_channel_name;
        @SerializedName("status_date")
        public String status_date;
        @SerializedName("main_image")
        public String main_image;
        @SerializedName("main_video")
        public String main_video;
        @SerializedName("support169")
        public String support169;
        @SerializedName("support43")
        public String support43;
        @SerializedName("support11")
        public String support11;
    }
}
