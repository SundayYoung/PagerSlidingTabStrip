package com.felix.pagerslidingtabstrip

import android.support.v4.app.FragmentManager
import android.view.ViewGroup

import java.util.ArrayList

/**
 * 首页底部 fragments
 */
class FragmentPagerAdapter(fm: FragmentManager) : android.support.v4.app.FragmentPagerAdapter(fm) {

    private val mFragments = ArrayList<BaseFragment>()
    private val mFragmentTitles = ArrayList<String>()
    /**
     * Get the current fragment
     */
    var currentFragment: BaseFragment? = null
        private set


    fun addFragment(fragment: BaseFragment) {
        mFragments.add(fragment)
    }

    fun addFragment(fragment: BaseFragment, title: String) {
        mFragments.add(fragment)
        mFragmentTitles.add(title)
    }

    override fun getItem(position: Int): BaseFragment {
        return mFragments[position]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    override fun setPrimaryItem(container: ViewGroup, position: Int, `object`: Any) {
        if (currentFragment !== `object`) {
            currentFragment = `object` as BaseFragment
        }
        super.setPrimaryItem(container, position, `object`)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (mFragmentTitles.isEmpty()) null else mFragmentTitles[position]
    }
}