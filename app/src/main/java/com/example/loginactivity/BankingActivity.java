package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class BankingActivity extends AppCompatActivity
{
    private final ArrayList<BankItemData> listServices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking);

        Intent intent = getIntent();
        String loggedUser = intent.getStringExtra("user");
        TextView welcomeTextV = findViewById(R.id.welcomeTextView);
        String welcomeStr = getString(R.string.welcome);
        welcomeTextV.setText(loggedUser+" "+welcomeStr);

        EditText editTextSearch = findViewById(R.id.searchEdit);
        RecyclerView myRecycler = findViewById(R.id.recyclerBanking);

        addBankItems();
        BankingAdapter adapter = new BankingAdapter(listServices);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecycler.setLayoutManager(gridLayoutManager);
        myRecycler.setAdapter(adapter);

    }
    public void addBankItems()
    {
        listServices.add(new BankItemData("Home",R.drawable.home_icon));
        listServices.add(new BankItemData("Transfare",R.drawable.transfare_icon));
        listServices.add(new BankItemData("inContact",R.drawable.message_icon));
        listServices.add(new BankItemData("All Accounts",R.drawable.list_accounts));
        listServices.add(new BankItemData("Statements",R.drawable.statements_icon));
        listServices.add(new BankItemData("tap to pay",R.drawable.tap_toppay_icon));
        listServices.add(new BankItemData("Cards",R.drawable.cards_icon));
        listServices.add(new BankItemData("Info",R.drawable.info_icon));
        listServices.add(new BankItemData("Cardless", R.drawable.cardless_icon));

    }
}