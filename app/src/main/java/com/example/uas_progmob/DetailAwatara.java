package com.example.uas_progmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAwatara extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_REMARK = "extra_remark";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_DESCRIPTION = "extra_description";
    TextView tv_nama;
    TextView tv_remark;
    TextView tv_description;
    ImageView iv_photos;




    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_awatara);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tv_nama = findViewById(R.id.tv_item_name);
        tv_remark = findViewById(R.id.tv_item_remarks);
        tv_description = findViewById(R.id.tv_description);
        iv_photos = findViewById(R.id.iv_photo);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String remarks = getIntent().getStringExtra(EXTRA_REMARK);
        String desc = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        String foto = getIntent().getStringExtra(EXTRA_PHOTO);

        setActionBarTitle(name);

        tv_nama.setText(name);
        tv_remark.setText(remarks);
        tv_description.setText(desc);
        tv_description.setMovementMethod(new ScrollingMovementMethod());

        Glide.with(getBaseContext())
                .load(foto)
//                .apply(new RequestOptions().override(350, 550))
                .into(iv_photos);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
