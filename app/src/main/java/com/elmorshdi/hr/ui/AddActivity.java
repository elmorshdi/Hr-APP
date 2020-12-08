package com.elmorshdi.hr.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.elmorshdi.hr.R;
import com.elmorshdi.hr.data.Repository;
import com.elmorshdi.hr.data.model.DatatEmployee;

public class AddActivity extends AppCompatActivity {
    EditText name, title, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name = findViewById(R.id.name);
        title = findViewById(R.id.title);
        phone = findViewById(R.id.phone);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void add(View view) {
        Repository repository = new Repository(this);
        if (name.getText().toString().isEmpty()
                || phone.getText().toString().isEmpty()
                || title.getText().toString().isEmpty()) {

            Toast.makeText(this, "Empty data", Toast.LENGTH_LONG).show();
        } else {
            repository.insertcontact(new DatatEmployee(name.getText().toString(),
                    title.getText().toString(),
                    phone.getText().toString(),
                    R.drawable.person));
            Toast.makeText(this, " added", Toast.LENGTH_LONG).show();
            name.setText("");
            title.setText("");
            phone.setText("");
        }
    }

    public void back(View view) {
        onBackPressed();

    }
}