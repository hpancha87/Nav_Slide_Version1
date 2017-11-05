package example.hari.srccom.Nav_Slide_Version1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * Created by Hari on 3/4/2017.
 * adapted from https://www.simplifiedcoding.net/android-mysql-tutorial-to-perform-basic-crud-operation/
 */


public class Tab4_new extends Activity implements AdapterView.OnItemSelectedListener {
    Button button_w;
    Spinner spinner4;
    private static final String [] paths ={"Google", "Android", "AOL", "Database", "Govt. Of India"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4_new);

        addListenerOnSpinner();

        button_w = (Button) findViewById(R.id.web);



    }

    private void addListenerOnSpinner() {

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner_4);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (Tab4_new.this, android.R.layout.simple_spinner_item, paths);

        spinner4.setAdapter(adapter);
        spinner4.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }


    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                Intent browserIntent1 =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));
                startActivity(browserIntent1);
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                Intent browserIntent2 =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aol.com"));
                startActivity(browserIntent2);
                break;
            case 3:
                // Whatever you want to happen when the thrid item gets selected

                startActivity(new Intent(v.getContext(),Tab1_new.class));

                break;
            case 4:
                // Whatever you want to happen when the thrid item gets selected
                Intent browserIntent3 =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("https://gepg.nic.in/"));
                startActivity(browserIntent3);
                break;

        }
    }


    @Override

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }



}
