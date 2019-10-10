package com.example.databindingdemo.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * @author 下一页5（轻飞扬）
 * * 个人小站：http://yhsh.wap.ai(已挂)
 * * 最新小站：http://www.iyhsh.icoc.in
 * * 联系作者：企鹅 13343401268
 * * 博客地址：http://blog.csdn.net/xiayiye5
 */
public class People extends BaseObservable {

    /**
     * peopleMessage : {"address":"东直门","age":19,"name":"张三"}
     * work : 工人
     */

    private PeopleMessageBean peopleMessage;
    private String work;

    @Bindable
    public PeopleMessageBean getPeopleMessage() {
        return peopleMessage;
    }

    public void setPeopleMessage(PeopleMessageBean PeopleMessage) {
        this.peopleMessage = PeopleMessage;
        notifyPropertyChanged(BR.peopleMessage);
    }

    @Bindable
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
        notifyPropertyChanged(BR.work);
    }

    public static class PeopleMessageBean extends BaseObservable {
        /**
         * address : 东直门
         * age : 19
         * name : 张三
         */

        private String address;
        private int age;
        private String name;

        @Bindable
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
            notifyPropertyChanged(BR.address);
        }

        @Bindable
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
            notifyPropertyChanged(BR.age);
        }

        @Bindable
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            notifyPropertyChanged(BR.name);
        }
    }
}
