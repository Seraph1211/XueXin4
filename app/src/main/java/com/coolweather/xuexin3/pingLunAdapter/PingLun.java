package com.coolweather.xuexin3.pingLunAdapter;

import java.util.List;

public class PingLun {

    /**
     * replies : [{"id":2,"wid":3,"lid":3,"yid":3,"lrNickName":"啧啧啧","photo":"http://121.36.5.207/000000.png","yfid":3,"lfNickName":"啧啧啧","date":"2020.3.3","content":"zuijia"},{"id":3,"wid":3,"lid":3,"yid":3,"lrNickName":"啧啧啧","photo":"http://121.36.5.207/000000.png","yfid":3,"lfNickName":"啧啧啧","date":"2020.3.3","content":"zuijia"}]
     * leave : {"id":3,"wid":3,"yid":4,"lwNickName":null,"photo":"http://121.36.5.207/000000.png","date":"2020.02.02","content":"11"}
     */

    private LeaveBean leave;
    private List<RepliesBean> replies;

    public PingLun(LeaveBean leave, List<RepliesBean> replies) {
        this.leave = leave;
        this.replies = replies;
    }

    public LeaveBean getLeave() {
        return leave;
    }

    public void setLeave(LeaveBean leave) {
        this.leave = leave;
    }

    public List<RepliesBean> getReplies() {
        return replies;
    }

    public void setReplies(List<RepliesBean> replies) {
        this.replies = replies;
    }

    public static class LeaveBean {
        /**
         * id : 3
         * wid : 3
         * yid : 4
         * lwNickName : null
         * photo : http://121.36.5.207/000000.png
         * date : 2020.02.02
         * content : 11
         */

        private int id;
        private int wid;
        private int yid;
        private String lwNickName;
        private String photo;
        private String date;
        private String content;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public int getYid() {
            return yid;
        }

        public void setYid(int yid) {
            this.yid = yid;
        }

        public String getLwNickName() {
            return lwNickName;
        }

        public void setLwNickName(String lwNickName) {
            this.lwNickName = lwNickName;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class RepliesBean {
        /**
         * id : 2
         * wid : 3
         * lid : 3
         * yid : 3
         * lrNickName : 啧啧啧
         * photo : http://121.36.5.207/000000.png
         * yfid : 3
         * lfNickName : 啧啧啧
         * date : 2020.3.3
         * content : zuijia
         */

        private int id;
        private int wid;
        private int lid;
        private int yid;
        private String lrNickName;
        private String photo;
        private int yfid;
        private String lfNickName;
        private String date;
        private String content;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public int getLid() {
            return lid;
        }

        public void setLid(int lid) {
            this.lid = lid;
        }

        public int getYid() {
            return yid;
        }

        public void setYid(int yid) {
            this.yid = yid;
        }

        public String getLrNickName() {
            return lrNickName;
        }

        public void setLrNickName(String lrNickName) {
            this.lrNickName = lrNickName;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public int getYfid() {
            return yfid;
        }

        public void setYfid(int yfid) {
            this.yfid = yfid;
        }

        public String getLfNickName() {
            return lfNickName;
        }

        public void setLfNickName(String lfNickName) {
            this.lfNickName = lfNickName;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
