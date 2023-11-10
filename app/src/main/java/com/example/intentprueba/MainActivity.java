

package com.example.intentprueba;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.SearchManager;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.SearchEvent;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Button;
        import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String nom = "";

    EditText TextBusca;
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);

        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);

        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);

        TextBusca = findViewById(R.id.TextBusca);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()== R.id.b1) {
            Intent intent = new Intent (this, MainActivity2.class);
            startActivity(intent);

        }
        if (view.getId()==R.id.b2) {
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
            startActivity(intent2);
        }
        if (view.getId()==R.id.b3) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
            startActivity(intent3);
        }
        if (view.getId()==R.id.b4) {
            Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.2, 2.1"));
            startActivity(intent4);
        }
        if (view.getId()== R.id.b5) {
            Intent intent5 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent5.putExtra(SearchManager.QUERY,TextBusca.getText().toString());
            startActivity(intent5);
        }
        if (view.getId()==R.id.b6) {
            Intent intent = new Intent(this, Activity2.class);

            EditText nomText = findViewById(R.id.text);

            Bundle sac = new Bundle();
            sac.putString("NomLogin", nomText.getText().toString());

            intent.putExtra(sac);

            startActivity(Intent);
        }

    }
}