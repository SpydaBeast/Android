package com.example.exertrmr.cal;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	double editKg, editCm, editAge;
	double convertedWeight;
	double convertedHeight;
	double convertedAge;
	double ans;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    {
 
        //UI in JAVA Memory
    	
    	final EditText weight = (EditText)findViewById(R.id.editKg);
    	final EditText height = (EditText)findViewById(R.id.editCm);
    	final EditText age = (EditText)findViewById(R.id.editAge);
    	
    	Button calButton = (Button)findViewById(R.id.calButton);	
    	final TextView textCal = (TextView)findViewById(R.id.textCal);
    	calButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				editKg = Double.parseDouble(weight.getText().toString());
				editCm = Double.parseDouble(height.getText().toString());
				editAge = Double.parseDouble(age.getText().toString());
				ans =  (editKg * 13.397) + (editCm * 4.799) + (editCm * 5.677) - (editAge * 4.7);
				DecimalFormat calories = new DecimalFormat("#,###.####");
			
		    	textCal.setText(" " + calories.format(ans));
		    	
			}
		});
    }
    
    }
}
