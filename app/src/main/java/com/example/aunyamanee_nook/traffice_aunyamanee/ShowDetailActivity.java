package com.example.aunyamanee_nook.traffice_aunyamanee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aunyamanee_Nook on 19/10/2559.
 */
public class ShowDetailActivity extends AppCompatActivity {

    //Explicit
    private TextView showTitleTextView, showDetailTextView;
    private ImageView showTrafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind Widget
        bindWidget();

        //Show Widget
        showWidget();

    }//onCreate
    private void bindWidget() {
        showTitleTextView = (TextView) findViewById(R.id.texTitleDetail);
        showDetailTextView = (TextView) findViewById(R.id.txtDetail);
        showTrafficImageView = (ImageView) findViewById(R.id.imvTrafficeDetail);
    }//bindWidget

    private void showWidget(){
        //Receive from Intent
        int intClick =getIntent().getIntExtra("click",0);

        //Show Title
        Mydata objMydata = new Mydata();
        String[] strTitle = objMydata.title();
        showTitleTextView.setText(strTitle[intClick]);

        //Show Traffic Image
        int[] intDrawable = objMydata.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

        //Show Detail
        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        showDetailTextView.setText(strDetail[intClick]);

        //Show Widget



    }
}
