package example.hari.srccom.Nav_Slide_Version1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hari on 2/25/2017.
 * http://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/
 */

public class Fragment2 extends Fragment {
    Button button_two;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.tab2, container, false);


        Button button_2 = (Button)view.findViewById(R.id.button_two);
        button_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                switch(v.getId()){

                    case R.id.button_two:
                        Intent intent1 = new Intent(getActivity(), Tab2_new.class);
                        startActivity(intent1);//Edited here
                        break;


                }
            }
        });

        return view;
    }






}
