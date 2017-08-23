package com.tatlicilar.visualeducation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.tatlicilar.visualeducation.Teacher_main;
import com.tatlicilar.visualeducation.Student_main;

//Fragmentler arası geçişi sağlaması için yapılmış sayfa adaptörü
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Student_main tab1 = new Student_main();
                return tab1;
            case 1:
                Teacher_main tab2 = new Teacher_main();
                return tab2;
            case 2:


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
