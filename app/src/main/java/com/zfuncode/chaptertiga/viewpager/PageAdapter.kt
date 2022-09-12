package com.zfuncode.chaptertiga.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zfuncode.chaptertiga.R

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return CameraWaFragment()
            }
            1 -> {
                return ChatWaFragment()
            }
            2 -> {
                return StatusWaFragment()
            }
            3 -> {
                return CallWaFragment()
            }
            else -> {
                return CallWaFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                R.drawable.ic_home
                return "Camera"
            }
            1 -> {
                return "Chats"
            }
            2 -> {
                return "Status"
            }
            3 -> {
                return "Calls"
            }
        }
        return super.getPageTitle(position)
    }

}