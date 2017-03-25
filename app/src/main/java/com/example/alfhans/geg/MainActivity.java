package com.example.alfhans.geg;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {
    int display = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tambah (View View){
        display = display + 1;
        display(display);
    }
    public void kurang (View View){
        display = display - 1;
        if (display < 0) {
            display = 0 ;
        }
        display(display);

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void submitOrder(View view) {
        display(display);
        displayharga(5*display);
    }

    public void display(int kata) {
        TextView katakatanya = (TextView) findViewById(R.id.quantity_text_view);
        katakatanya.setText(" " + kata);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void displayharga(int harga) {
        TextView harganya = (TextView) findViewById(R.id.harganya);
        harganya.setText(NumberFormat.getCurrencyInstance().format(harga));
    }
}

