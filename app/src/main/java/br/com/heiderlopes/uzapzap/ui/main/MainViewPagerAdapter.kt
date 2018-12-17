package br.com.heiderlopes.uzapzap.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.heiderlopes.uzapzap.ui.base.BaseFragment
import java.util.ArrayList

class MainViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val mFragmentList = ArrayList<BaseFragment>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: BaseFragment) {
        mFragmentList.add(fragment)
    }
}

