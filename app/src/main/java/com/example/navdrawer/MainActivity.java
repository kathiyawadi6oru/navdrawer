package com.example.navdrawer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer=(DrawerLayout)findViewById(R.id.drawer);
        navigationView=(NavigationView)findViewById(R.id.navigation);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawer.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){

                   case  R.id.login:
                    Toast.makeText(MainActivity.this, "login", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.order:
                       Toast.makeText(MainActivity.this, "order", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.cart:
                       Toast.makeText(MainActivity.this, "cart", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.wallet:
                       Toast.makeText(MainActivity.this, "wallet", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.history:
                       Toast.makeText(MainActivity.this, "history", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.subscription:
                       Toast.makeText(MainActivity.this, "subscription", Toast.LENGTH_SHORT).show();
                    break;

                   case  R.id.share:
                       Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                    break;


                    default:
                        break;

                }
                return true;
            }
        });

        View view = navigationView.getHeaderView(0);
        TextView email = view.findViewById(R.id.email);
        TextView name = view.findViewById(R.id.name);
        name.setText("mayank");
        email.setText("mayankvachhani91@gmail.com");
    }

public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
}

}