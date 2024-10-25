package com.example.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.list.models.UserModel;

import java.util.List;

public class UserAdapter extends ArrayAdapter<UserModel> {
    private final LayoutInflater inflater;

    public UserAdapter(Context context, List<UserModel> users) {
        super(context, 0, users);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        UserModel user = getItem(position);

        ImageView avatar = convertView.findViewById(R.id.avatar);
        TextView name = convertView.findViewById(R.id.name);
        TextView ageCity = convertView.findViewById(R.id.country_city);
        TextView age = convertView.findViewById(R.id.age);

        avatar.setImageResource(user.getAvatarId());
        name.setText(user.getFirstName() + " " + user.getLastName());
        ageCity.setText(user.getCity() + ", " + user.getCountry());
        age.setText(user.getAge() + " years old");

        return convertView;
    }
}
