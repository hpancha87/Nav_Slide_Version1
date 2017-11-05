package example.hari.srccom.Nav_Slide_Version1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hari on 2/25/2017.
 */

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    //Button buttondb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Button buttondb;


        final View view = inflater.inflate(R.layout.tab1, container, false);


        Button button_db = (Button)view.findViewById(R.id.buttondb);
        button_db.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                switch(v.getId()){

                    case R.id.buttondb:
                        Intent intent1 = new Intent(getActivity(), Tab1_new.class);
                        startActivity(intent1);//Edited here
                        break;


                }
            }
        });

        return view;
    }






}




        /*
        final View view = inflater.inflate(R.layout.tab2, container, false);


        Button buttondb = (Button)view.findViewById(R.id.buttondb);
        buttondb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                switch(v.getId()){

                    case R.id.buttondb:
                        Intent intent1 = new Intent(getActivity(), Tab1_new.class);
                        startActivity(intent1);//Edited here
                        break;


                }
            }
        });

        return view;
    }
}
*/