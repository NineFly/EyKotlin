package com.tt.lvruheng.eyepetizer.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.tt.lvruheng.eyepetizer.R
import com.tt.lvruheng.eyepetizer.adapter.HotAdatpter
import com.tt.lvruheng.eyepetizer.ui.fragment.RankFragment
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity:AppCompatActivity(){

//    var mTabs = listOf<String>("周排行", "月排行", "总排行").toMutableList()
//    lateinit var mFragments: ArrayList<Fragment>
//    val STRATEGY = arrayOf("weekly", "monthly", "historical")
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


//        var weekFragment : RankFragment = RankFragment()
//        var weekBundle = Bundle()
//        weekBundle.putString("strategy", STRATEGY[0])
//        weekFragment.arguments = weekBundle
//
//        var monthFragment : RankFragment = RankFragment()
//        var monthBundle = Bundle()
//        monthBundle.putString("strategy", STRATEGY[1])
//        monthFragment.arguments = weekBundle
//
//        var allFragment : RankFragment = RankFragment()
//        var allBundle = Bundle()
//        allBundle.putString("strategy", STRATEGY[2])
//        allFragment.arguments = weekBundle
//
//        mFragments = ArrayList()
//        mFragments.add(weekFragment as Fragment)
//        mFragments.add(monthFragment as Fragment)
//        mFragments.add(allFragment as Fragment)
//
//        vp_content.adapter = HotAdatpter(supportFragmentManager, mFragments, mTabs)
//        tabs.setupWithViewPager(vp_content)
//
    }
}