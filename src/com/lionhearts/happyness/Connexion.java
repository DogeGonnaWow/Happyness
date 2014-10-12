package com.lionhearts.happyness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Connexion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connexion_ui);
		
		
		ImageButton login = (ImageButton) findViewById(R.id.login_button);
		
		
		login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent lancementMain = new Intent(Connexion.this,AffichageMain.class);
                startActivity(lancementMain);
                finish();
				
			}
			
		});
		
	}
}
