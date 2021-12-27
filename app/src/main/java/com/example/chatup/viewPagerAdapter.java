package com.example.chatup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewPagerAdapter extends FragmentStatePagerAdapter {

    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new notificationFragment2();
            case 1:return new NotificationFragment3();
            default:return new notificationFragment2();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        String Title = null;
        if (position == 0){
            Title = "Notifications";
        }else if (position == 1){
            Title = "Request";
        }
        assert Title != null;
        return Title;
    }

}
