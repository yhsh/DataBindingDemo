package com.example.databindingdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.example.databindingdemo.bean.People;
import com.example.databindingdemo.databinding.ActivityHomeBinding;

/**
 * @author 下一页5（轻飞扬）
 * 个人小站：http://yhsh.wap.ai(已挂)
 * 最新小站：http://www.iyhsh.icoc.in
 * 联系作者：企鹅 13343401268
 * 博客地址：http://blog.csdn.net/xiayiye5
 */
public class HomeActivity extends Activity {
    People people = new People();
    People.PeopleMessageBean peopleMessage = new People.PeopleMessageBean();
    private ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        people.setWork("高级移动金砖工程师");
        peopleMessage.setAddress("东直门");
        peopleMessage.setAge(21);
        peopleMessage.setName("李晓华");
        people.setPeopleMessage(peopleMessage);
        activityHomeBinding.setPeople(people);
//        activityMainBinding.tvShowPeople.setText(people.getPeopleMessage().getName()+people.getWork());
        activityHomeBinding.setHome(this);
    }

    public void Onclick(View view) {
        //点击了切换数据按钮
        people.setWork("精湛特殊设计师");
        peopleMessage.setAge(peopleMessage.getAge() + 1);
        peopleMessage.setName("上官佳慧");
        peopleMessage.setAddress("朝阳门");
        people.setPeopleMessage(peopleMessage);
//        activityHomeBinding.setPeople(people);
    }
}
