package example.hari.srccom.Nav_Slide_Version1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Hari on 2/25/2017.
 */

public class ViewPagerAdapter  extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new Fragment1();
        }
        else if (position == 1) {
            return new Fragment2();
        }
        else if (position == 2) {
            return new Fragment3();
        }

        else return new Fragment4();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
