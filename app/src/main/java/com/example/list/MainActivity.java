package com.example.list;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.ComponentActivity;

import com.example.list.models.UserModel;

import java.util.List;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        List<UserModel> users = UserGenerator.generateUsers(100);

        UserAdapter adapter = new UserAdapter(this, users);
        listView.setAdapter(adapter);
    }
}
