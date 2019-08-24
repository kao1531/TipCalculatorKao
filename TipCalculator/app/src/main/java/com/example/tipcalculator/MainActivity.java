package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        double bill = 0, percent = 0;
        Context context = getApplicationContext();
        CharSequence text = "Please enter a bill total and tip percent";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);

        boolean valid = false;
        while (valid == false)
        {
           try
           {
               bill = Double.parseDouble(billCostEditText.getText().toString());
               percent = Double.parseDouble(tipPercentEditText.getText().toString());
               valid = true;
               double tip = bill * (percent/100.0);
               double total = tip + bill;

               finalTextView.setText("Final Bill Amount: " + df.format(total));
               tipTextView.setText("Tip Amount: " + df.format(tip));

           }

           catch (Exception e)
            {
                toast.show();
                valid = true;
            }
        }
    }

    public void happyTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        double bill = 0;

        Context context = getApplicationContext();
        CharSequence text = "Please enter a bill total";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);

        boolean valid = false;
        while (valid == false)
        {
            try
            {
                bill = Double.parseDouble(billCostEditText.getText().toString());
                valid = true;
                double tip = bill * .20;
                double total = tip + bill;

                finalTextView.setText("Final Bill Amount: " + df.format(total));
                tipTextView.setText("Tip Amount: " + df.format(tip));
                tipPercentEditText.setText("20");
            }

            catch (Exception e)
            {
                toast.show();
                valid = true;
            }
        }
    }

    public void neutralTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        double bill = 0;

        Context context = getApplicationContext();
        CharSequence text = "Please enter a bill total";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);

        boolean valid = false;
        while (valid == false)
        {
            try
            {
                bill = Double.parseDouble(billCostEditText.getText().toString());
                valid = true;
                double tip = bill * .15;
                double total = tip + bill;

                finalTextView.setText("Final Bill Amount: " + df.format(total));
                tipTextView.setText("Tip Amount: " + df.format(tip));
                tipPercentEditText.setText("15");
            }

            catch (Exception e)
            {
                toast.show();
                valid = true;
            }
        }
    }

    public void sadTip (View v)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        EditText billCostEditText = (EditText) findViewById(R.id.billCostEditText);
        EditText tipPercentEditText = (EditText) findViewById(R.id.tipPercentEditText);
        TextView finalTextView = (TextView) findViewById(R.id.finalAmountTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        double bill = 0;

        Context context = getApplicationContext();
        CharSequence text = "Please enter a bill total";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);

        boolean valid = false;
        while (valid == false)
        {
            try
            {
                bill = Double.parseDouble(billCostEditText.getText().toString());
                valid = true;
                double tip = bill * .10;
                double total = tip + bill;

                finalTextView.setText("Final Bill Amount: " + df.format(total));
                tipTextView.setText("Tip Amount: " + df.format(tip));
                tipPercentEditText.setText("10");
            }

            catch (Exception e)
            {
                toast.show();
                valid = true;
            }
        }
    }
}
