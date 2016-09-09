package net.androidbootcamp.concerttickets;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	double costPreTicket = 59.99;
	int numberOfTickets;
	double totalCost;
	String groupChoice;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText tickets = (EditText)findViewById(R.id.txtTicketNum);
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        
        
        Button cost = (Button)findViewById(R.id.btnCost);
        final TextView result = (TextView)findViewById(R.id.txtResult);
        cost.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				numberOfTickets = Integer.parseInt(tickets.getText().toString());
				totalCost = costPreTicket * numberOfTickets;
				DecimalFormat currency = new DecimalFormat ("$###,###.##");
				groupChoice = group.getSelectedItem().toString();
				result.setText("Total Cost for " + groupChoice + " is " + currency.format(totalCost));
			}
		} );
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
