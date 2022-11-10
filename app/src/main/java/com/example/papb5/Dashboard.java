package com.example.papb5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {
    FirebaseAuth mAuth;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            mAuth.signOut();
            startActivity(new Intent(Dashboard.this, MainActivity.class));
            finish();
        });
    }
}
