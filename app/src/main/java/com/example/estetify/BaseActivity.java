package com.example.estetify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();
        setupBottomNavigation();
    }

    public void setupBottomNavigation() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        if (bottomNavigationView != null) {
            bottomNavigationView.setOnItemSelectedListener(this::onNavigationItemSelected);
        } else {
            Log.e("BaseActivity", "BottomNavigationView não encontrado no layout.");
        }
    }


    public void updateBottomNavigationSelection(int menuItemId) {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        if (bottomNavigationView != null) {
            bottomNavigationView.setSelectedItemId(menuItemId);
        }
    }

    private boolean onNavigationItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.map) {
            if (!(BaseActivity.this instanceof Localizacao)) {
                Intent intent = new Intent(getApplicationContext(), Localizacao.class);
                startActivity(intent);
                overridePendingTransition(0, 0); // Sem animação
                finish();
            }
            return true;
        } else if (itemId == R.id.home) {
            if (!(BaseActivity.this instanceof TelaPrincipal)) {
                Intent intent = new Intent(getApplicationContext(), TelaPrincipal.class);
                startActivity(intent);
                overridePendingTransition(0, 0); // Sem animação
                finish();
            }
            return true;
        } else if (itemId == R.id.cart) {
            if (!(BaseActivity.this instanceof Notificacao)) {
                Intent intent = new Intent(getApplicationContext(), Notificacao.class);
                startActivity(intent);
                overridePendingTransition(0, 0); // Sem animação
                finish();
            }
            return true;
        } else if (itemId == R.id.perfil) {
            if (!(BaseActivity.this instanceof Perfil)) {
                Intent intent = new Intent(getApplicationContext(), Perfil.class);
                startActivity(intent);
                overridePendingTransition(0, 0); // Sem animação
                finish();
            }
            return true;
        }

        return false;
    }
}