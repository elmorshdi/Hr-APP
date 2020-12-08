package com.elmorshdi.hr.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.elmorshdi.hr.R;
import com.elmorshdi.hr.data.Repository;
import com.elmorshdi.hr.data.model.DatatEmployee;

public class ProfileActivity extends AppCompatActivity {
    private String name;
    private String title;
    private String phone;
    private int circleImage;
    private TextView name_tv, title_tv, phone_tv;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bundle b = new Bundle();
        b = getIntent().getExtras();
        name = b.getString("name");
        title = b.getString("title");
        phone = b.getString("phone");
        circleImage = b.getInt("img");
        name_tv = findViewById(R.id.name);
        phone_tv = findViewById(R.id.phone);
        title_tv = findViewById(R.id.title);
        imageView = findViewById(R.id.img);
        name_tv.setText(name);
        title_tv.setText(title);
        phone_tv.setText(phone);
        imageView.setImageResource(circleImage);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void back(View view) {
        onBackPressed();
    }

    public void delet(View view) {
        Repository repository = new Repository(this);
        repository.delete(new DatatEmployee(name, title, phone, circleImage));
    }
}