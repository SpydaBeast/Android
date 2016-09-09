package com.example.exert.lbstokg;

import java.text.DecimalFormat;
import java.util.concurrent.locks.Condition;

import android.os.Bundle;
import android.app.Activity;
import android.database.CursorJoiner.Result;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	double conversionRate = 2.2;
	double weightEntered;
	double convertedWeight;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText weight = (EditText) findViewById(R.id.editWeight);
		final RadioButton lbToKilo = (RadioButton) findViewById(R.id.radioLBS);
		final RadioButton kiloTolb = (RadioButton) findViewById(R.id.radioKG);
		final TextView result = (TextView) findViewById(R.id.weightConvter);
		Button convert = (Button) findViewById(R.id.butnConv);
		
		convert.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				weightEntered = Double.parseDouble(weight.getText().toString());
				DecimalFormat thou = new DecimalFormat("#.###");
				if(lbToKilo.isChecked()){
					if (weightEntered <=500){
						convertedWeight = weightEntered / conversionRate;
						result.setText(thou.format(convertedWeight) + "kilograms");
					}else {
						Toast.makeText(MainActivity.this,"Pounds must be less than 500", Toast.LENGTH_LONG).show();
					
					}
				}
				if(kiloTolb.isChecked()){
					if (weightEntered <=225){
						convertedWeight = weightEntered * conversionRate;
						result.setText(thou.format(convertedWeight) + "Kilogram");
					}else {
						Toast.makeText(MainActivity.this,"Pounds must be less than 500, duration", Toast.LENGTH_LONG).show();
						
					}
				}
			}
		});
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
