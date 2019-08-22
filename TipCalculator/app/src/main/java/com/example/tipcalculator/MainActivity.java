package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        double bill = Double.parseDouble(billCostEditText.getText().toString());
        double percent = Double.parseDouble(tipPercentEditText.getText().toString());

        double tip = bill * (percent/100.0);
        double total = tip + bill;

        finalTextView.setText("Final Bill Amount: " + df.format(total));
        tipTextView.setText("Tip Amount: " + df.format(tip));
    }

    public void happyTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        TextView percentTextView = (TextView) findViewById(R.id.emojiTipTextView);

        double bill = Double.parseDouble(billCostEditText.getText().toString());

        double tip = bill * 0.20;
        double total = bill + tip;

        finalTextView.setText("Final Bill Amount: " + df.format(total));
        tipTextView.setText("Tip Amount: " + df.format(tip));
        percentTextView.setText("Tip Percent: 20%");
    }

    public void neutralTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        TextView percentTextView = (TextView) findViewById(R.id.emojiTipTextView);

        double bill = Double.parseDouble(billCostEditText.getText().toString());

        double tip = bill * 0.15;
        double total = bill + tip;

        finalTextView.setText("Final Bill Amount: " + df.format(total));
        tipTextView.setText("Tip Amount: " + df.format(tip));
        percentTextView.setText("Tip Percent: 15%");
    }

    public void sadTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        TextView percentTextView = (TextView) findViewById(R.id.emojiTipTextView);

        double bill = Double.parseDouble(billCostEditText.getText().toString());

        double tip = bill * 0.10;
        double total = bill + tip;

        finalTextView.setText("Final Bill Amount: " + df.format(total));
        tipTextView.setText("Tip Amount: " + df.format(tip));
        percentTextView.setText("Tip Percent: 10%");
    }
}
